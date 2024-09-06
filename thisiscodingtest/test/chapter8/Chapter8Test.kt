package chapter8

import kotlin.test.Test

class Chapter8Test {
    @Test
    fun fibonacciTest() {
        println(Chapter8Example.fibonacci(8))
    }

    @Test
    fun practicalTest1() {
        println(Chapter8Practical.practical1(301))
    }

    @Test
    fun practicalTest2() {
        println(Chapter8Practical.practical2(arrayOf(4, 3, 3, 5, 200, 150, 50, 100, 200)))
    }

    @Test
    fun practicalTest3() {
        println(Chapter8Practical.practical3(5))
    }

    @Test
    fun practicalTest4() {
        println(Chapter8Practical.practical4(arrayOf(2, 3, 5), 50))
    }
}