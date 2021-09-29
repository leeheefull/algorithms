package thisIsCodingTest.chapter08;

public class Question3 {    // 바닥 공사
    public int solve(int n) {
        int[] dp = new int[n + 1];

        // 초기 값
        dp[1] = 1;
        dp[2] = 3;

        // 점화식
        for (int i = 3; i < n + 1; i++) {
            dp[i] = 2 * dp[i - 2] + dp[i - 1];
        }

        // 결과 값
        return dp[n] % 796796;
    }
}
