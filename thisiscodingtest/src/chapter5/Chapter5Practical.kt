package chapter5

import java.util.ArrayDeque
import java.util.Stack
import kotlin.math.min

class Chapter5Practical {
    companion object {
        fun practical1(grape: Array<Array<Int>>): Int {
            val row = grape.size
            val col = grape[0].size
            val isVisited = Array(row) { Array(col) { false } }
            var iceCream = 0
            for (i in grape.indices) {
                for (j in grape[0].indices) {
                    if (grape[i][j] == 0 && !isVisited[i][j]) {
                        bfs(grape, isVisited, i, j)
                        iceCream++
                    }
                }
            }
            return iceCream
        }

        private fun bfs(grape: Array<Array<Int>>, isVisited: Array<Array<Boolean>>, currentRow: Int, currentCol: Int) {
            val maxRow = grape.size
            val maxCol = grape[0].size
            val queue = ArrayDeque<Pair<Int, Int>>()
            queue.push(Pair(currentRow, currentCol))
            isVisited[currentRow][currentCol] = true
            val movable = arrayOf(Pair(-1, 0), Pair(0, 1), Pair(1, 0), Pair(0, -1))
            while (true) {
                val currentNode = queue.poll()
                val queueRow = currentNode.first
                val queueCol = currentNode.second
                movable.forEach {
                    val nextRow = queueRow + it.first
                    val nextCol = queueCol + it.second
                    if ((nextRow in 0..<maxRow && nextCol in 0..<maxCol)
                        && !isVisited[nextRow][nextCol]
                        && grape[nextRow][nextCol] == 0) {
                        queue.push(Pair(nextRow, nextCol))
                        isVisited[nextRow][nextCol] = true
                    }
                }
                if (queue.isEmpty()) {
                    break
                }
            }
        }

        fun practical2(grape: Array<Array<Int>>): Int {
            val maxRow = grape.size
            val maxCol = grape[0].size
            val isVisited = Array(maxRow) { Array(maxCol) { false } }
            val countMap = Array(maxRow) { Array(maxCol) { 1 } }
            val movable = arrayOf(Pair(1, 0), Pair(0, 1), Pair(-1, 0), Pair(0, -1))
            val stack = Stack<Pair<Int, Int>>()
            stack.push(Pair(0, 0))
            isVisited[0][0] = true
            while (true) {
                val node = stack.pop()
                movable.forEach {
                    val nextRow = node.first + it.first
                    val nextCol = node.second + it.second
                    if ((nextRow in 0 ..< maxRow && nextCol in 0 ..< maxCol)
                        && !isVisited[nextRow][nextCol]
                        && grape[nextRow][nextCol] == 1) {
                        isVisited[nextRow][nextCol] = true
                        countMap[nextRow][nextCol] += countMap[node.first][node.second]
                        stack.push(Pair(nextRow, nextCol))
                    }
                }
                if (stack.isEmpty()) break
            }
            return countMap[maxRow-1][maxCol-1]
        }

    }
}