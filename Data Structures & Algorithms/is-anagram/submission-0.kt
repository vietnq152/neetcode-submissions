class Solution {
    fun isAnagram(s: String, t: String): Boolean {
        if (s.length != t.length) {
            return false
        }

        val n = s.length

        for (i in 0 until n) {
            var daKiemTra = false

            for (k in 0 until i) {
                if (s[k] == s[i]) {
                    daKiemTra = true
                    break
                }
            }

            if (daKiemTra) continue

            var countS = 0
            var countT = 0

            for (j in 0 until n) {
                if (s[j] == s[i]) countS++
                if (t[j] == s[i]) countT++
            }

            if (countS != countT) {
                return false
            }
        }

        return true
    }
}