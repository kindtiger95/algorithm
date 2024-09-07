package chapter3

import chapter3.Chapter3
import kotlin.test.Test
import kotlin.test.assertEquals

class JChapter3Test {
    @Test
    fun practicalProblem2Test_1() {
        assertEquals(Chapter3.practicalProblem2(8, 3, listOf(2, 4, 5, 4, 6)), 46)
    }
    @Test
    fun practicalProblem2Test_2() {
        assertEquals(Chapter3.practicalProblem2(7, 2, listOf(3, 4, 3, 4, 3)), 28)
    }

    @Test
    fun practicalProblem3Test_1() {
        assertEquals(Chapter3.practicalProblem3(listOf(listOf(3, 1, 2), listOf(4, 1, 4), listOf(2, 2, 2))), 2)
    }

    @Test
    fun practicalProblem3Test_2() {
        assertEquals(Chapter3.practicalProblem3(listOf(listOf(7,3,1,8), listOf(3,3,3,4))), 3)
    }

    @Test
    fun practicalProblem4Test_1() {
        assertEquals(Chapter3.practicalProblem4(25, 5), 2)
    }

    @Test
    fun practicalProblem4Test_2() {
        assertEquals(Chapter3.practicalProblem4(25, 3), 6)
    }
}