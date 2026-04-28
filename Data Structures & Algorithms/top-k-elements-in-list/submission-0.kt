class Solution {
fun topKFrequent(nums: IntArray, k: Int): IntArray {
    val map = mutableMapOf<Int, Int>()

    for (num in nums) {
        map[num] = map.getOrDefault(num, 0) + 1
    }

    val sorted = map.entries.sortedByDescending { it.value }

    val result = IntArray(k)
    for (i in 0 until k) {
        result[i] = sorted[i].key
    }

    return result
}
    
}
