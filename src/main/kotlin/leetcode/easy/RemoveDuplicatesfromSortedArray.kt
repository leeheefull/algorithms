package leetcode.easy

class RemoveDuplicatesfromSortedArray {
    fun removeDuplicates(nums: IntArray): Int {
        if (nums.isEmpty()) {
            return 0
        }

        var pre = 0
        for (curr in 1 until nums.size) {
            if (nums[curr] != nums[pre]) {
                pre++
                nums[pre] = nums[curr]
            }
        }
        return pre + 1
    }
}
