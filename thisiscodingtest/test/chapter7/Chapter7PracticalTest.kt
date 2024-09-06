package chapter7

import kotlin.test.Test

class Chapter7PracticalTest {
    @Test
    fun practical1Test1() {
        val practical1 = Chapter7Practical.practical1(arrayOf(8, 3, 7, 9, 2), arrayOf(5, 7, 9))
        println(practical1)
    }

    @Test
    fun practical2Test1() {
        println(Chapter7Practical.practical2(arrayOf(19, 15, 10, 17), 6))
    }
}