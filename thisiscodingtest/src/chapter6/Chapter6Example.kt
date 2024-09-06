package chapter6

class Chapter6Example {
    companion object {
        fun selectSort() {
            val array = arrayOf(7, 5, 9, 0, 3, 1, 6, 2, 4, 8)
            for (i in array.indices) {
                var needChange = false
                var mostSmallValue = array[i]
                var mostSmallIndex = i
                for (j in i+1..<array.size) {
                    if (array[j] < mostSmallValue) {
                        mostSmallValue = array[j]
                        mostSmallIndex = j
                        needChange = true
                    }
                }
                if (needChange) {
                    swap(i, mostSmallIndex, array)
                }
            }
            println(array.joinToString(","))
        }

        fun insertSort() {
            val array = arrayOf(7, 5, 9, 0, 3, 1, 6, 2, 4, 8)
            for (i in 1..<array.size) {
                for (j in i downTo 1) {
                    if (array[j-1] > array[j]) {
                        swap(j-1, j, array)
                    }
                }
            }
            println(array.joinToString(","))
        }

        fun quickSort(start: Int, end: Int, array: Array<Int>) {
            if (start >= end) {
                return
            }
            val pivot = start
            var left = start + 1
            var right = end
            while (left <= right) {
                while (left <= end) {
                    if (array[pivot] < array[left]) {
                        break
                    }
                    left++
                }
                while (right > pivot) {
                    if (array[pivot] > array[right]) {
                        break
                    }
                    right--
                }
                if (left < right) {
                    swap(left, right, array)
                } else {
                    swap(pivot, right, array)
                }
            }
            quickSort(start, right - 1, array)
            quickSort(right + 1 , end, array)
        }

        fun countingSort(array: Array<Int>) {
            val countingArray = Array(11) { 0 }
            array.forEach { countingArray[it]++ }
            countingArray.forEachIndexed { index, i ->
                for (j in 0..< i) {
                    print("$index ")
                }
            }
        }

        private fun swap(left: Int, right: Int, array: Array<Int>) {
            val temp: Int = array[left]
            array[left] = array[right]
            array[right] = temp
        }
    }
}