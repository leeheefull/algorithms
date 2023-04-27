package leetcode.easy

class CountingBits {
    // before refactoring
    fun countBits1(n: Int): IntArray {
        val answer = mutableListOf<Int>()
        for (index in 0..n) {
            var cnt = 0
            for (char in index.toString(2)) {
                if (char == '1') {
                    cnt++
                }
            }
            answer.add(index, cnt)
        }
        return answer.toIntArray()
    }

    // after refactoring
    fun countBits2(n: Int): IntArray {
        return IntArray(n + 1) { index ->
            index.toString(2).count { it == '1' }
        }
    }
}
