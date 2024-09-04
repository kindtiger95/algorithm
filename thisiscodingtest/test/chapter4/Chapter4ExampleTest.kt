package chapter4

import kotlin.test.Test
import kotlin.test.assertEquals

class Chapter4ExampleTest {
    @Test
    fun exampleProblem1_1() {
        val result = Chapter4Example.exampleProblem1(5, listOf("R","R","R","U","D","D"))
        assertEquals(result[0], 3)
        assertEquals(result[1], 4)
    }

    @Test
    fun exampleProblem1_2() {
        val result = Chapter4Example.exampleProblem1(3, listOf("R","R","L","L","U","U","D","D","D","U","R"))
        assertEquals(result[0], 2)
        assertEquals(result[1], 2)
    }

    @Test
    fun exampleProblem2_1() {
        val result = Chapter4Example.exampleProblem2(5)
        assertEquals(result, 11475)
    }
}