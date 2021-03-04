package dp;

import java.util.Scanner;

public class BOJ1149 {    // RGB Distance

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[][] dp = new int[n + 1][3];
        int result;

        dp[1][0] = scan.nextInt();
        dp[1][1] = scan.nextInt();
        dp[1][2] = scan.nextInt();

        for (int i = 2; i < n + 1; i++) {
            dp[i][0] = scan.nextInt() + Math.min(dp[i - 1][1], dp[i - 1][2]);
            dp[i][1] = scan.nextInt() + Math.min(dp[i - 1][0], dp[i - 1][2]);
            dp[i][2] = scan.nextInt() + Math.min(dp[i - 1][0], dp[i - 1][1]);
        }

        result = Math.min(Math.min(dp[n][0], dp[n][1]), dp[n][2]);
        System.out.print(result);
    }
}