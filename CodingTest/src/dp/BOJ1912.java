package dp;

import java.util.Scanner;

public class BOJ1912 {	// Continuous Sum

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] nums = new int[n + 1];
		int[] dp = new int[n + 1];
		int result;

		for (int i = 1; i < n + 1; i++) {
			nums[i] = scan.nextInt();
		}

		dp[1] = nums[1];
		result = dp[1];
		for (int i = 2; i < n + 1; i++) {
			dp[i] = Math.max(dp[i - 1] + nums[i], nums[i]);
			if (result < dp[i]) {
				result = dp[i];
			}
		}
		System.out.print(result);
	}
}