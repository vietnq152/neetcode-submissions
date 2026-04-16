class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) return ""

        for (e in 0 until strs[0].length) {
            for (i in strs.indices) {
                if (e >= strs[i].length || strs[0][e] != strs[i][e]) {
                    return strs[0].substring(0, e)
                }
            }
        }

        return strs[0]
    }
}