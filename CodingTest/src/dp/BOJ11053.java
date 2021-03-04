package dp;

import java.util.Scanner;

public class BOJ11053 {    // LIS

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        int[] dp = new int[n];
        int max = 0;

        for (int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
            dp[i] = 1;

            for (int j = 0; j < i; j++) {
                if (a[j] < a[i] && dp[i] < dp[j] + 1) {
                    dp[i] = dp[j] + 1;
                }
            }
            if (max < dp[i]) {
                max = dp[i];
            }
        }
        System.out.print(max);
    }
}