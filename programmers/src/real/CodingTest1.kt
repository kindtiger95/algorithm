package real

import kotlin.math.max

class CodingTest1 {
    companion object {
        fun s1(taxes: Array<Array<Int>>, income: Int): Int {
            var answer = 0
            var isFinal = false
            for (i in taxes.indices) {
                if (i == taxes.size - 1 || (taxes[i][0] >= income)) {
                    isFinal = true
                }

                val beforeTarget = if (i == 0) 0 else taxes[i-1][0]
                val targetCharge = if (isFinal) {
                    income - taxes[i - 1][0]
                } else {
                    taxes[i][0] - beforeTarget
                }
                val targetRate = taxes[i][1].toFloat() * 0.01
                answer += (targetCharge * targetRate).toInt()

                if (isFinal)
                    break
            }
            return answer
        }

        fun s2(mvp: Array<IntArray>): IntArray {
            val answer = mutableListOf<Int>()
            val mvpCount = Array(mvp.size + 1) { Array(mvp[0].size + 1) { 0 } }
            for (i in mvp.indices) {
                for (j in mvp[i].indices) {
                    mvpCount[i][mvp[i][j]] += 1
                }
            }
            val winnerCount = Array(mvp.size + 1) { 0 }
            for (i in mvpCount.indices) {
                val winPoint = mvpCount[i].maxOrNull()
                for (j in 0..< mvpCount[i].size) {
                    if (winPoint == mvpCount[i][j]) {
                        winnerCount[j] += 1
                    }
                }
            }
            val maximumWinner = winnerCount.max()
            for (i in 1..< winnerCount.size) {
                if (winnerCount[i] == maximumWinner) {
                    answer.add(i)
                }
            }
            return answer.toIntArray()
        }

        fun s3(playList: IntArray, listenTime: Int): Int {
            val maximumValue = Array(playList.size + 1) { 0 }
            for (i in playList.indices) {
                for (j in 1.. playList[i]) {
                    var maxValue = 0
                    var currentListenTime = listenTime - playList[i] + j
                    var nextTrack = if (i + 1 >= playList.size) 0 else i + 1
                    maxValue++
                    while (currentListenTime > 0 && nextTrack != i) {
                        currentListenTime -= playList[nextTrack]
                        maxValue++
                        nextTrack = if (nextTrack + 1 >= playList.size) 0 else nextTrack + 1
                    }
                    maximumValue[i + 1] = max(maximumValue[i + 1], maxValue)
                }
            }
            return maximumValue.max()
        }
    }
}