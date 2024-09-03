package part2

import kotlin.test.Test
import kotlin.test.assertEquals

class Part2Test {
    @Test
    fun practicalProblem2Test_1() {
        assertEquals(Part2.practicalProblem2(8, 3, listOf(2, 4, 5, 4, 6)), 46)
    }
    @Test
    fun practicalProblem2Test_2() {
        assertEquals(Part2.practicalProblem2(7, 2, listOf(3, 4, 3, 4, 3)), 28)
    }

    @Test
    fun practicalProblem3Test_1() {
        assertEquals(Part2.practicalProblem3(listOf(listOf(3, 1, 2), listOf(4, 1, 4), listOf(2, 2, 2))), 2)
    }

    @Test
    fun practicalProblem3Test_2() {
        assertEquals(Part2.practicalProblem3(listOf(listOf(7,3,1,8), listOf(3,3,3,4))), 3)
    }

    @Test
    fun practicalProblem4Test_1() {
        assertEquals(Part2.practicalProblem4(25, 5), 2)
    }

    @Test
    fun practicalProblem4Test_2() {
        assertEquals(Part2.practicalProblem4(25, 3), 6)
    }
}