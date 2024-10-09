package real

import kotlin.test.Test

class CodingTest1Test {
    @Test
    fun test1() {
        val result = CodingTest1.s1(
            arrayOf(
                arrayOf(1200, 6),
                arrayOf(4600, 15),
                arrayOf(8800, 24),
                arrayOf(15000, 35),
                arrayOf(0, 38)
            ), 9500)
        println(result)
    }

    @Test
    fun test2() {
        val result = CodingTest1.s2(
            arrayOf(
                intArrayOf(2, 1, 1, 3),
                intArrayOf(2, 3, 4, 2),
                intArrayOf(3, 3, 2, 3),
                intArrayOf(4, 1, 1, 3),
            )
        )
        println(result.joinToString(","))
    }

    @Test
    fun test3() {
        val result = CodingTest1.s2(
            arrayOf(
                intArrayOf(2, 1, 1, 3),
                intArrayOf(2, 3, 4, 2),
                intArrayOf(3, 3, 2, 3),
                intArrayOf(4, 1, 1, 3),
            )
        )
        println(result.joinToString(","))
    }
}