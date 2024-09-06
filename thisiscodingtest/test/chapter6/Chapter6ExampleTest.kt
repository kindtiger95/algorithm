package chapter6

import kotlin.test.Test

class Chapter6ExampleTest {
    @Test
    fun chapter6Test1() {
        Chapter6Example.selectSort()
    }

    @Test
    fun chapter6Test2() {
        Chapter6Example.insertSort()
    }

    @Test
    fun chapter6Test3() {
        val array = arrayOf(9, 7, 0, 5, 3, 1, 6, 2, 4, 8)
        Chapter6Example.quickSort(0, 9, array)
        println(array.joinToString(","))
    }

    @Test
    fun chapter6Test4() {
        val array = arrayOf(7, 5, 9, 0, 3, 1, 6, 2, 9, 1, 4, 8, 0, 5, 2)
        Chapter6Example.countingSort(array)
    }
}