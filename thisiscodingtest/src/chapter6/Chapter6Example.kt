package chapter6

import java.util.*

class Chapter6Example {
    companion object {
        fun selectSort() {
            val array = arrayOf(7, 5, 9, 0, 3, 1, 6, 2, 4, 8)
            var index = 0
            for (i in array.indices) {
                var minValue = array[i]
                var change = false
                for (j in i+1..<array.size) {
                    if (minValue > array[j]) {
                        index = j
                        minValue = array[j]
                        change = true
                    }
                }
                if (change) {
                    swap(i, index, array)
                }
            }
            println(array)
        }

        private fun swap(left: Int, right: Int, array: Array<Int>) {
            val temp: Int = array[left]
            array[left] = array[right]
            array[right] = temp
        }
    }
}