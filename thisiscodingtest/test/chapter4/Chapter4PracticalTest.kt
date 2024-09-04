package chapter4

import kotlin.test.Test
import kotlin.test.assertEquals

class Chapter4PracticalTest {
    @Test
    fun practicalProblemTest1_1() {
        assertEquals(Chapter4Practical.practicalProblem1("a1"), 2)
    }

    @Test
    fun practicalProblemTest1_2() {
        assertEquals(Chapter4Practical.practicalProblem1("c2"), 6)
    }

    @Test
    fun practicalProblemTest2_1() {
        assertEquals(
            Chapter4Practical.practicalProblem2(
                arrayOf(
                    arrayOf(1, 1, 1, 1),
                    arrayOf(1, 0, 0, 1),
                    arrayOf(0, 1, 0, 1),
                    arrayOf(0, 0, 0, 1)
                ),
                1, 1, 0
            ),
            7
        )
    }
}