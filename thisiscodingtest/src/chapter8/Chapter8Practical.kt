package chapter8

import java.util.Arrays
import kotlin.math.max
import kotlin.math.min

class Chapter8Practical {
    companion object {
        val array = Array(30001) { 0 }

        fun practical1(x: Int): Int {
            return when (x) {
                5 -> 1
                4 -> 2
                3 -> 1
                2 -> 1
                1 -> 0
                else -> {
                    if (array[x] != 0) {
                        array[x]
                    } else {
                        val condition1 = if (x % 5 == 0) practical1(x / 5) else 30000
                        val condition2 = if (x % 3 == 0) practical1(x / 3) else 30000
                        val condition3 = if (x % 2 == 0) practical1(x / 2) else 30000
                        val condition4 = practical1(x - 1)
                        val result1 = min(condition1, condition2)
                        val result2 = min(condition3, condition4)
                        val finalResult = min(result1, result2) + 1
                        array[x] = finalResult
                        finalResult
                    }
                }
            }
        }

        fun practical2(array: Array<Int>): Int {
            return max(dp2(array, array.size - 1), dp2(array, array.size - 2))
        }

        private fun dp2(array: Array<Int>, x: Int): Int {
            if (x < 0) {
                return 0
            } else if (x == 0) {
                return array[0]
            } else if (x == 1) {
                return array[1]
            }
            return dp2(array, x - 2) + array[x]
        }

        fun practical3(length: Int): Int {
            if (length == 1) {
                return 1
            } else if (length == 2) {
                return 3
            } else if (length == 3) {
                return 5
            }
            return practical3(length - 1) + practical3(length - 2) * 2
        }

        val coinArray = Array(101) { false }
        val resultArray = Array(10001) { 0 }

        fun practical4(coin: Array<Int>, target: Int): Int {
            coin.forEach { coinArray[it] = true }
            return dp4(coinArray, target)
        }

        fun dp4(coinArray: Array<Boolean>, target: Int): Int {
            if (target < 1)
                return 0

            if (resultArray[target] != 0) {
                return resultArray[target]
            }

            var min = 10001
            coinArray.forEachIndexed { index, i ->
                if (i.not()) {
                    return@forEachIndexed
                }
                val result1 = if (index == target) {
                    1
                } else if (target - index >= 1 && resultArray[target - index] != 0) {
                    resultArray[target - index] + 1
                } else {
                    dp4(coinArray, target - index) + 1
                }
                if (result1 < min) {
                    min = result1
                }
            }
            if (min != 10001) {
                resultArray[target] = min
            }
            return min
        }
    }
}