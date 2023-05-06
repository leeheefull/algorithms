package leetcode.easy

class LongestCommonPrefix {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) return ""

        var result = strs[0]
        for (index in 1 until strs.size) {
            while (strs[index].indexOf(result) != 0) {
                result = result.substring(0, result.length - 1)
            }
        }
        return result
    }
}