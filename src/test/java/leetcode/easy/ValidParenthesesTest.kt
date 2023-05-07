package leetcode.easy

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class ValidParenthesesTest : StringSpec({
    "Example 1" {
        val s = "()"
        val result = ValidParentheses().isValid(s)

        result shouldBe true
    }

    "Example 2" {
        val s = "()[]{}"
        val result = ValidParentheses().isValid(s)

        result shouldBe true
    }

    "Example 3" {
        val s = "(]"
        val result = ValidParentheses().isValid(s)

        result shouldBe false
    }

    "Example 4" {
        val s = "[()]{}"
        val result = ValidParentheses().isValid(s)

        result shouldBe true
    }
})
