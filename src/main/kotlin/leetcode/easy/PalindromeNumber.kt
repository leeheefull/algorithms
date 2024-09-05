package leetcode.easy

class PalindromeNumber {
    fun isPalindrome(x: Int): Boolean {
        val stringNumber = x.toString()
        return stringNumber == stringNumber.reversed()
    }
}
