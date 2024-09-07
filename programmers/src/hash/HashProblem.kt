package hash

class HashProblem {
    companion object {
        fun solution(clothes: Array<Array<String>>): Int {
            val map = mutableMapOf<String, Int>()
            clothes.forEach { map[it[1]] = map.getOrDefault(it[1], 0) + 1 }
            var result = 1
            map.values.forEach { result *= (it+1) }
            return result - 1
        }
    }
}