package chapter4

class Chapter4Example {
    companion object {
        fun exampleProblem1(n: Int, commands: List<String>): Array<Int> {
            val currentPosition = arrayOf(1, 1)
            commands.forEach {
                move(it, currentPosition, n)
            }
            return currentPosition
        }

        private fun move(command: String, currentPosition: Array<Int>, maximum: Int) {
            when (command) {
                "U" -> currentPosition[0] = validate(currentPosition[0], -1, maximum)
                "D" -> currentPosition[0] = validate(currentPosition[0], 1, maximum)
                "R" -> currentPosition[1] = validate(currentPosition[1], 1, maximum)
                "L" -> currentPosition[1] = validate(currentPosition[1], -1, maximum)
                else -> throw IllegalStateException("알 수 없는 명령입니다.")
            }
        }

        private fun validate(origin: Int, moved: Int, maximum: Int) = if (origin + moved in 1 .. maximum) origin + moved else origin

        fun exampleProblem2(n: Int): Int {
            var startHour = 0
            var min = 0
            var sec = 0
            var result = 0
            while (startHour <= n) {
                if (sec >= 60) {
                    sec = 0
                    min += 1
                }
                if (min >= 60) {
                    min = 0
                    startHour += 1
                }
                if (startHour.toString().contains("3") || min.toString().contains("3") || sec.toString().contains("3")) {
                    result++
                }
                sec++
            }
            return result
        }
    }
}