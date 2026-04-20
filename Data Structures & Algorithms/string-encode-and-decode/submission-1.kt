class Solution {
    fun encode(strs: List<String>): String {
        var c = ""
        for (i in strs){
            c += i.length.toString()+ "#" + i
        }
    return c
    }

    fun decode(str: String): List<String> {
    val list = mutableListOf<String>()
        var i = 0
        while (i<str.length){
            var j = i
            while (str[j] != '#'){
                j++
            }
            val num = str.substring(i,j).toInt()
            val s = str.substring(j+1,j+num+1)
            list.add(s)
            i = j+num+1
        }
        return list
    }
}