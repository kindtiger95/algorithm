package chapter8

class Chapter8Example {
    companion object {
        val array = Array(100) { 0 }
        fun fibonacci(n: Int): Int {
            if (n == 0 || n == 1) {
                return 1
            }
            if (array[n] != 0 ) return array[n]
            val result = fibonacci(n - 2) + fibonacci(n - 1)
            array[n] = result
            return result
        }
    }
}