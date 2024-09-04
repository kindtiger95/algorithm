package chapter5

import java.util.*

class Chapter5Example {
    companion object {
        fun dfsExample() {
            val grape = arrayOf(
                arrayOf(),
                arrayOf(2, 3, 8),
                arrayOf(1, 7),
                arrayOf(4, 5),
                arrayOf(3, 5),
                arrayOf(3, 4),
                arrayOf(7),
                arrayOf(2, 6, 8),
                arrayOf(1, 7)
            )
            val stack = Stack<Int>()
            val visit = Array(9) { false }
            var result = 1
            visit[1] = true
            println(1)
            stack.push(1)
            outer@while (true) {
                val node = stack.peek()
                for (i in grape[node]) {
                    if (visit[i].not()) {
                        stack.push(i)
                        visit[i] = true
                        result++
                        println(i)
                        continue@outer
                    }
                }
                stack.pop()
                if (stack.isEmpty()) {
                    break
                }
            }
        }

        fun bfsExample() {
            val grape = arrayOf(
                arrayOf(),
                arrayOf(2, 3, 8),
                arrayOf(1, 7),
                arrayOf(4, 5),
                arrayOf(3, 5),
                arrayOf(3, 4),
                arrayOf(7),
                arrayOf(2, 6, 8),
                arrayOf(1, 7)
            )
            val queue: Queue<Int> = ArrayDeque()
            val isVisited = Array(9) { false }
            queue.add(1)
            isVisited[1] = true
            while (true) {
                val currentNode = queue.poll()
                println(currentNode)
                val linkList = grape[currentNode]
                linkList.forEach {
                    if (isVisited[it]) {
                        return@forEach
                    }
                    queue.add(it)
                    isVisited[it] = true
                }
                if (queue.isEmpty()) {
                    break
                }
            }
        }
    }
}