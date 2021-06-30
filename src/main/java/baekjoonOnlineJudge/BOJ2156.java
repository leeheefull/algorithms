package baekjoonOnlineJudge;

import java.util.Scanner;

public class BOJ2156 { // dp
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] wine = new int[n + 1];
		int[] dp = new int[n + 1];

		for (int i = 1; i <= n; i++) {
			wine[i] = scan.nextInt();
		}
		dp[1] = wine[1];
		if (1 < n) {
			dp[2] = wine[1] + wine[2];
		}
		for (int i = 3; i <= n; i++) {
			dp[i] = max(dp[i - 3] + wine[i - 1] + wine[i], dp[i - 2] + wine[i], dp[i - 1]);
		}
		System.out.print(dp[n]);
	}

	private static int max(int x, int y, int z) {
		return Math.max(x, Math.max(y, z));
	}
}