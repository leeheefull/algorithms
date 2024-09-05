package this_is_coding_test.chapter03;

import java.util.Arrays;

public class Question2 {    // 큰 수의 법칙
    public int solve(int n, int m, int k, int[] nums) {
        Arrays.sort(nums);
        int cnt = (m / (k + 1)) * k + (m % (k + 1));
        return cnt * nums[n - 1] + (m - cnt) * nums[n - 2];
    }
}
