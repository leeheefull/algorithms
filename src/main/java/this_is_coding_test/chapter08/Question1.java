package this_is_coding_test.chapter08;

public class Question1 {
    public int solve(int n) {   // 1로 만들기
        int[] dp = new int[n + 1];

        for (int i = 2; i < n + 1; i++) {
            // 이전 값보다 1많으니, +1 해주면 됨.
            dp[i] = dp[i - 1] + 1;

            // 이전 값보다 나눌 수 만큼 많으니, +1한 것과 비교
            if (dp[i] % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }
            if (dp[i] % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
            if (dp[i] % 5 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 5] + 1);
            }
        }
        return dp[n];
    }
}
