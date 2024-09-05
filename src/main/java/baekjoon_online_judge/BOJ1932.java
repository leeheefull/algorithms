package baekjoon_online_judge;

import java.util.Scanner;

public class BOJ1932 { // dp
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[][] dp = new int[n][n];

		for (int i = 0; i < n; i++) {
			for (int j = 0; j <= i; j++) {
				dp[i][j] = scan.nextInt();
			}
		}
		for (int i = n - 2; 0 <= i; i--) {
			for (int j = 0; j <= i; j++) {
				dp[i][j] = Math.max(dp[i + 1][j], dp[i + 1][j + 1]) + dp[i][j];
			}
		}
		System.out.print(dp[0][0]);
	}
}