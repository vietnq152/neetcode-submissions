class Solution {
    fun topKFrequent (nums: IntArray, k: Int): IntArray{

    val numbers = mutableListOf<Int>()
    val keys = mutableListOf<Int>()
    //SortArray
    for (i in nums.indices){
        for (j in i+1 until nums.size){
            if (nums[j] < nums[i]){
                val temp = nums [i]
                nums [i] = nums [j]
                nums [j] = temp
            }
        }
    }
    //dung Hashmap
    //numbers.add(nums[0])
    for (i in nums.indices) {
        if (nums[i] !in keys) {
            var count = 1

            for (j in i + 1 until nums.size) {
                if (nums[j] == nums[i]) {
                    count++
                } else {
                    break
                }
            }

            numbers.add(count)
            keys.add(nums[i])
        }
    }
    val listRetu = mutableListOf<Int>()

    while (listRetu.size < k) {
        var maxIndex = 0

        for (i in numbers.indices) {
            if (numbers[i] > numbers[maxIndex]) {
                maxIndex = i
            }
        }

        listRetu.add(keys[maxIndex])

        numbers[maxIndex] = -1
    }

    return listRetu.toIntArray()
}
}
