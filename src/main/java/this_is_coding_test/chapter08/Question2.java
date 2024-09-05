package this_is_coding_test.chapter08;

public class Question2 {    // 개미 전사
    public int solve(int n, int[] k) {
        int[] dp = new int[n];

        // 초기 값
        dp[0] = k[0];
        dp[1] = Math.max(k[0], k[1]);

        // 점화식
        for (int i = 2; i < n; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i - 2] + k[i]);
        }

        // 출력
        return dp[n - 1];
    }
}
