package chapter9

import kotlin.test.Test

class Chapter9ExampleTest {
    @Test
    fun example1Test() {
        Chapter9Example.example1(
            arrayOf(
                arrayOf(),
                arrayOf(0, 0, 2, 5, 1, 0, 0),
                arrayOf(0, 0, 0, 3, 2, 0, 0),
                arrayOf(0, 0, 3, 0, 0, 0, 5),
                arrayOf(0, 0, 0, 3, 0, 1, 0),
                arrayOf(0, 0, 0, 1, 0, 0, 2),
                arrayOf()
            )
        )
    }
}