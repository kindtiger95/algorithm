package chapter7

import kotlin.test.Test

class Chapter7ExampleTest {
    @Test
    fun binarySearchTest() {
        Chapter7Example.binarySearch(arrayOf(9, 7, 0, 5, 3, 1, 6, 2, 4, 8), 2)
    }
}