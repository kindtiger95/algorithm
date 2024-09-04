package chapter5

import kotlin.test.Test
import kotlin.test.assertEquals

class Chapter5PracticalTest {
    @Test
    fun practical1Test1() {
        assertEquals(Chapter5Practical.practical1(arrayOf(
            arrayOf(0,0,1,1,0),
            arrayOf(0,0,0,1,1),
            arrayOf(1,1,1,1,1),
            arrayOf(0,0,0,0,0)
        )), 3)
    }

    @Test
    fun practical1Test2() {
        assertEquals(Chapter5Practical.practical1(arrayOf(
            arrayOf(0,1,1,1,0),
            arrayOf(1,0,0,1,1),
            arrayOf(1,1,1,0,1),
            arrayOf(0,1,0,1,0)
        )), 7)
    }

    @Test
    fun practical1Test3() {
        assertEquals(Chapter5Practical.practical1(arrayOf(
            arrayOf(0,1,1,1,0,1,0),
            arrayOf(1,0,0,1,1,1,0),
            arrayOf(1,1,1,0,1,1,0),
            arrayOf(0,1,0,1,0,1,1),
            arrayOf(0,1,0,1,0,1,1),
            arrayOf(1,0,0,1,0,1,0),
            arrayOf(0,1,0,1,0,1,1),
            arrayOf(0,1,1,1,1,1,0)
        )),  11)
    }

    @Test
    fun practical2Test1() {
        assertEquals(
            Chapter5Practical.practical2(
                arrayOf(
                    arrayOf(1, 0, 1, 0, 1, 0),
                    arrayOf(1, 1, 1, 1, 1, 1),
                    arrayOf(0, 0, 0, 0, 0, 1),
                    arrayOf(1, 1, 1, 1, 1, 1),
                    arrayOf(1, 1, 1, 1, 1, 1),
                )
            ), 10
        )
    }
}