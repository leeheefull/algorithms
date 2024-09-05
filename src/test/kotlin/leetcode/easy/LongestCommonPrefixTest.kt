package leetcode.easy

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class LongestCommonPrefixTest : StringSpec({
    "Example 1" {
        val strs = arrayOf("flower", "flow", "flight")
        val result = LongestCommonPrefix().longestCommonPrefix(strs)

        result shouldBe "fl"
    }

    "Example 2" {
        val strs = arrayOf("dog", "racecar", "car")
        val result = LongestCommonPrefix().longestCommonPrefix(strs)

        result shouldBe ""
    }
})
