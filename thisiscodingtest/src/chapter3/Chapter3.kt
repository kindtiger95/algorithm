package chapter3

class Chapter3 {
    companion object {
        // 실전문제 2번, p.92
        fun practicalProblem2(m: Int, k: Int, numberArray: List<Int>): Int {
            val sortedNumberList = numberArray.sortedDescending()
            val multiply = m / (k + 1)
            val multiplyResult = (sortedNumberList[0] * k + sortedNumberList[1]) * multiply
            val remain = m % (k + 1)
            val remainResult = remain * sortedNumberList[0]
            return multiplyResult + remainResult
        }

        // 실전문제 3번, p.96
        fun practicalProblem3(numbers: List<List<Int>>): Int {
            var result = -1
            numbers.forEach {
                val min = it.min()
                result = if (result < 0) min else if (result > min) result else min
            }
            return result
        }

        // 실전문제 4번, p.99
        fun practicalProblem4(n: Int, k: Int): Int {
            var result = 0
            var target = n
            while (target != 1) {
                val remain = target % k
                if (remain == 0) {
                    target /= k
                    result++
                } else if (remain < target) {
                    target -= remain
                    result += remain
                } else {
                    target -= 1
                    result += 1
                }
            }
            return result
        }
    }
}