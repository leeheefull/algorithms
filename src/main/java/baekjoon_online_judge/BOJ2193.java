package baekjoon_online_judge;

import java.util.Scanner;

public class BOJ2193 { // dp
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        long[] dp = new long[n + 1];

        if (0 < n) {
            dp[1] = 1;
        }
        if (1 < n) {
            dp[2] = 1;
        }
        for (int i = 3; i < n + 1; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        System.out.print(dp[n]);
    }
}