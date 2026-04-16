class Solution {
    fun sortColors(nums: IntArray) {
        for (i in 0 until nums.size - 1) {
            for (j in i + 1 until nums.size) {
                if (nums[i] > nums[j]) {
                    val temp = nums[i]
                    nums[i] = nums[j]
                    nums[j] = temp
                }
            }
        }
    }
}