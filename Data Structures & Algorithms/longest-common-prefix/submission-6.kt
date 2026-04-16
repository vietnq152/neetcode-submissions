class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) return ""

        var minLength = strs[0].length
        for (s in strs) {
            if (s.length < minLength) {
                minLength = s.length
            }
        }

        var e = 0
        while (e < minLength) {
            for (i in 1 until strs.size) {
                if (strs[0][e] != strs[i][e]) {
                    return strs[0].substring(0, e)
                }
            }
            e++
        }

        return strs[0].substring(0, e)
    }
}