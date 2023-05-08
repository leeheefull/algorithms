package leetcode.easy

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class RemoveDuplicatesfromSortedArrayTest : StringSpec({
    "Example 1" {
        val nums = intArrayOf(1, 1, 2)
        val result = RemoveDuplicatesfromSortedArray().removeDuplicates(nums)

        result shouldBe 2
    }

    "Example 2" {
        val nums = intArrayOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
        val result = RemoveDuplicatesfromSortedArray().removeDuplicates(nums)

        result shouldBe 5
    }
})
