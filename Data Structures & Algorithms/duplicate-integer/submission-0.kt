class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {
        var n = nums.size
        for (i in 0..n-1){
            for (j in i+1..n-1){
                if (nums[i] == nums[j]){
                    return true
                    break
                }
            }
        }
        return false
    }
}
