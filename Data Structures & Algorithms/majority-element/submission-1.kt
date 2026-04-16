class Solution {
    fun majorityElement(nums: IntArray): Int {

        // Bubble sort
        for (i in 0 until nums.size - 1) {
            for (j in 0 until nums.size - 1 - i) {
                if (nums[j] > nums[j + 1]) {
                    val temp = nums[j + 1]
                    nums[j + 1] = nums[j]
                    nums[j] = temp
                }
            }
        }

        val n = nums.size / 2
        var count = 1

        for (j in 1 until nums.size) {
            if (nums[j] == nums[j - 1]) {
                count++
            } else {
                count = 1
            }

            if (count > n) {
                return nums[j]
            }
        }

        return nums[0]
    }
}