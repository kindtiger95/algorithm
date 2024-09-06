package chapter6

class Chapter6Practical {
    companion object {
        fun practical1(array: Array<Int>) {
            array.sortDescending()
            println(array.joinToString(" "))
        }

        fun practical2(array: Array<Pair<String, Int>>) {
            val countArray = Array(100) { mutableListOf<String>() }
            array.forEach { countArray[it.second].add(it.first) }
            for (i in countArray.indices) {
                if (countArray[i].isNotEmpty()) {
                    println(countArray[i])
                }
            }
        }

        fun practical3(originArray: Array<Int>, stockArray: Array<Int>, availableChangeCount: Int) {
            originArray.sort()
            stockArray.sortDescending()
            for (i in 0..<availableChangeCount) {
                if (originArray[i] < stockArray[i]) {
                    val temp = originArray[i]
                    originArray[i] = stockArray[i]
                    stockArray[i] = temp
                }
            }
            println(originArray.sum())
        }
    }
}