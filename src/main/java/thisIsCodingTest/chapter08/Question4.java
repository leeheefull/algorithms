package thisIsCodingTest.chapter08;

import java.util.Arrays;

public class Question4 {    // 효율적인 화폐 구성
    public int solve(int n, int m, int[] moneys) {
        int[] dp = new int[m + 1];
        Arrays.fill(dp, 10001);

        dp[0] = 0;
        for (int i = 0; i < n; i++) {
            for (int j = moneys[i]; j < m + 1; j++) {
                if (dp[j - moneys[i]] != 10001) {
                    dp[j] = Math.min(dp[j], dp[j - moneys[i]] + 1);
                }
            }
        }

        if (dp[m] == 10001) {
            return -1;
        }
        return dp[m];
    }
}
