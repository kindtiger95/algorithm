package chapter7

class Chapter7Practical {
    companion object {
        fun practical1(array: Array<Int>, target: Array<Int>): List<String> {
            array.sort()
            return target.map { if (binarySearch(array, it)) "yes" else "no" }
        }

        fun practical2(array: Array<Int>, target: Int): Int {
            array.sort()
            var middle = 0
            var start = 0
            var end = array.size - 1
            while (start <= end) {
                middle = (start + end) / 2
                var dduckLength = 0
                for (i in middle+1 .. end) {
                    dduckLength += (array[i] - array[middle])
                }
                if (dduckLength > target) {
                    start = middle + 1
                } else if (dduckLength < target) {
                    end = middle - 1
                } else {
                    break
                }
            }
            return array[middle]
        }

        private fun binarySearch(array: Array<Int>, target: Int): Boolean {
            var middle = 0
            var start = 0
            var end = array.size - 1
            var find = false
            while (start <= end) {
                middle = (start + end) / 2
                if (array[middle] > target) {
                    end = middle - 1
                } else if (array[middle] < target) {
                    start = middle + 1
                } else {
                    find = true
                    break
                }
            }
            return find
        }
    }
}