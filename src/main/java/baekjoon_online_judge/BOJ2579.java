package baekjoon_online_judge;

import java.util.Scanner;

public class BOJ2579 { // dp
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] stair = new int[n + 1];
        int[] dp = new int[n + 1];

        for (int i = 1; i < n + 1; i++) {
            stair[i] = scan.nextInt();
        }

        dp[1] = stair[1];
        if (1 < n) {
            dp[2] = stair[1] + stair[2];
        }

        for (int i = 3; i < n + 1; i++) {
            dp[i] = Math.max(dp[i - 2], dp[i - 3] + stair[i - 1]) + stair[i];
        }

        System.out.print(dp[n]);
    }
}