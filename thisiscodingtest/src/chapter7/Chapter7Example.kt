package chapter7

class Chapter7Example {
    companion object {
        // Todo-Check.
        fun binarySearch(array: Array<Int>, target: Int) {
            array.sort()
            var count = 0
            var start = 0
            var end = array.size - 1
            var middle = 0
            while (true) {
                middle = (start + end) / 2
                count++
                if (array[middle] > target) {
                    end = middle - 1
                } else if (array[middle] < target) {
                    start = middle + 1
                } else {
                    break
                }
            }
            println(array[middle])
            println(count)
        }
    }
}