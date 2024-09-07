package chapter9

import java.util.PriorityQueue
import kotlin.math.min

class Chapter9Example {
    companion object {
        // Todo-Check.
        fun example1(array: Array<Array<Int>>) {
            val pq = PriorityQueue<Pair<Int, Int>> { o1, o2 -> o1.first - o2.first }
            val isVisited = Array(array.size) { false }
            val distances = Array(array.size) { Int.MAX_VALUE }

            // 출발점 세팅
            distances[1] = 0
            pq.add(1 to 0)

            // 그래프 탐색
            while (pq.isNotEmpty()) {
                val (currentNode, distance) = pq.poll()
                if (isVisited[currentNode]) {
                    continue
                }
                isVisited[currentNode] = true
                for (i in array[currentNode].indices) {
                    if (array[currentNode][i] != 0) {
                        distances[i] = min(distance + array[currentNode][i], distances[i])
                        pq.add(i to distances[i])
                    }
                }
            }
            // 목적지까지의 거리
            println(distances.joinToString(" "))
        }
    }
}