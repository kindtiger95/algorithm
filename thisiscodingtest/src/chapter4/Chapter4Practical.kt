package chapter4

class Chapter4Practical {
    companion object {
        fun practicalProblem1(position: String): Int {
            val col = position[0] - 'a' + 1
            val row = position[1].digitToInt()
            var result = 0
            val movable = arrayOf(
                arrayOf(-2, 1),
                arrayOf(-2, -1),
                arrayOf(-1, 2),
                arrayOf(1, 2),
                arrayOf(2, -1),
                arrayOf(2, 1),
                arrayOf(1, -2),
                arrayOf(-1, -2)
            )
            movable.forEach {
                if ((row + it[0] in 1..8) && (col + it[1] in 1..8)) {
                    result +=1
                }
            }
            return result
        }

        fun practicalProblem2(map: Array<Array<Int>>, startPosY: Int, startPosX: Int, direction: Int): Int {
            val movable = arrayOf(arrayOf(-1, 0), arrayOf(0, 1), arrayOf(1, 0), arrayOf(0, -1))
            var currentPosRow = startPosX
            var currentPosCol = startPosY
            var currentDirection = direction
            var result = 1
            map[currentPosRow][currentPosCol] = 1
            var turnCount = 0
            while (true) {
                currentDirection = if (currentDirection - 1 < 0) 3 else currentDirection - 1
                turnCount++
                val togo = movable[currentDirection]
                if ((currentPosRow + togo[0] in map.indices && currentPosCol + togo[1] in 0..<map[0].size) &&
                    map[currentPosRow + togo[0]][currentPosCol + togo[1]] < 1
                ) {
                    map[currentPosRow + togo[0]][currentPosCol + togo[1]] = 2
                    currentPosRow += togo[0]
                    currentPosCol += togo[1]
                    result++
                    turnCount = 0
                    continue
                }
                if (turnCount == 4) {
                    val backStepMoveY = movable[currentDirection][0]
                    val backStepMoveX = movable[currentDirection][1]
                    if ((currentPosRow + backStepMoveY in map.indices && currentPosCol + backStepMoveX in 0..<map[0].size) &&
                        map[currentPosRow + backStepMoveY][currentPosCol + backStepMoveX] == 2
                    ) {
                        currentPosRow += backStepMoveY
                        currentPosCol += backStepMoveX
                    } else {
                        break
                    }
                }

            }
            return result
        }
    }
}