class Solution {
    fun sortArray(nums: IntArray): IntArray {
        val left = 0
        val right = nums.size - 1

        fun partition(nums: IntArray, left: Int, right: Int): Int {
            val pivot = nums[right]
            var i = left - 1

            for (j in left until right) {
                if (nums[j] < pivot) {
                    i++
                    val temp = nums[i]
                    nums[i] = nums[j]
                    nums[j] = temp
                }
            }

            i++
            val temp = nums[i]
            nums[i] = nums[right]
            nums[right] = temp

            return i
        }

        fun quickSort(nums: IntArray, left: Int, right: Int) {
            if (left < right) {
                val pivotIndex = partition(nums, left, right)

                quickSort(nums, left, pivotIndex - 1)
                quickSort(nums, pivotIndex + 1, right)
            }
        }

        quickSort(nums, left, right)
        return nums
    }
}