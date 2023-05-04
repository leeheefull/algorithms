package leetcode.easy

class RomanToInteger {
    fun romanToInt(s: String): Int {
        val romanNumbers = mapOf(
            'I' to 1, 'V' to 5, 'X' to 10, 'L' to 50, 'C' to 100, 'D' to 500, 'M' to 1000
        )
        var result = 0
        var index = 0

        while (index < s.length) {
            val current = romanNumbers[s[index]]!!
            val next = romanNumbers[s.getOrNull(index + 1)] ?: 0

            if (current < next) {
                result += next - current
                index += 2
            } else {
                result += current
                index++
            }
        }

        return result
    }
}
