package hash

import kotlin.test.Test
import kotlin.test.assertEquals

class HashProblemTest {
    @Test
    fun solutionTest() {
        assertEquals(HashProblem.solution(
            arrayOf(
                arrayOf("yellow_hat", "headgear"),
                arrayOf("blue_sunglasses", "eyewear"),
                arrayOf("green_turban", "headgear")
            )
        ), 5)
        assertEquals(HashProblem.solution(
            arrayOf(
                arrayOf("crow_mask", "face"),
                arrayOf("blue_sunglasses", "face"),
                arrayOf("smoky_makeup", "face")
            )
        ), 3)
        assertEquals(HashProblem.solution(
            arrayOf(
                arrayOf("crow_mask", "face"),
                arrayOf("blue_sunglasses", "face"),
                arrayOf("smoky_makeup", "face"),
                arrayOf("sibla", "face"),
                arrayOf("yellow_hat", "headgear"),
                arrayOf("green_turban", "headgear"),
                arrayOf("blue_sunglasses", "eyewear")
            )
        ), 29)
    }
}