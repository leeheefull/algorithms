package baekjoonOnlineJudge;

import java.util.Scanner;

public class BOJ10844 { // dp
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long[][] dp = new long[n + 1][10];
        long result = 0;

        for (int i = 1; i <= 9; i++) {
            dp[1][i] = 1;
        }
        for (int i = 2; i < n + 1; i++) {
            for (int j = 0; j < 10; j++) {
                if (j == 0) {
                    dp[i][j] = dp[i - 1][j + 1];
                } else if (j == 9) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    dp[i][j] = dp[i - 1][j - 1] + dp[i - 1][j + 1];
                }
                dp[i][j] %= 1000000000;
            }
        }

        for (int i = 0; i < 10; i++) {
            result += dp[n][i];
        }
        System.out.print(result % 1000000000);
    }
}