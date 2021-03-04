package dp;

import java.util.Scanner;

public class BOJ11727 {	// Tiling 2N (2)

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] dp = new int[n + 1];

		dp[1] = 1;
		if (1 < n) {
			dp[2] = 3;
		}
		for (int i = 3; i < n + 1; i++) {
			dp[i] = (dp[i - 1] + dp[i - 2] * 2) % 10007;
		}
		System.out.print(dp[n]);
	}
}