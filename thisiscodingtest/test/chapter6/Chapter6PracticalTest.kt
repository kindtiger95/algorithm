package chapter6

import kotlin.test.Test

class Chapter6PracticalTest {
    @Test
    fun practical1Test1() {
        Chapter6Practical.practical1(arrayOf(15,27,12))
    }

    @Test
    fun practical2Test1() {
        Chapter6Practical.practical2(arrayOf("홍길동" to 95, "이순신" to 77))
    }

    @Test
    fun practical3Test1() {
        Chapter6Practical.practical3(arrayOf(1,2,5,4,3), arrayOf(5,5,6,6,5), 3)
    }
}