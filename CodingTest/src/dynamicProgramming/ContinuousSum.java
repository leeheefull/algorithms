/* baekjoon 1912
 * n개의 정수로 이루어진 임의의 수열이 주어진다.
 * 우리는 이 중 연속된 몇 개의 수를 선택해서 구할 수 있는 합 중 가장 큰 합을 구하려고 한다.
 * 단, 수는 한 개 이상 선택해야 한다.
 * 예를 들어서 10, -4, 3, 1, 5, 6, -35, 12, 21, -1 이라는 수열이 주어졌다고 하자.
 * 여기서 정답은 12+21인 33이 정답이 된다.
 * 
 * input
 * 첫째 줄에 정수 n(1 ≤ n ≤ 100,000)이 주어지고 둘째 줄에는 n개의 정수로 이루어진 수열이 주어진다.
 * 수는 -1,000보다 크거나 같고, 1,000보다 작거나 같은 정수이다.
 * 
 * output
 * 첫째 줄에 답을 출력한다.
 * 
 * example
 * 10
 * 10 -4 3 1 5 6 -35 12 21 -1
 * -> 33
 * 10
 * 2 1 -4 3 4 -4 6 5 -5 1
 * -> 14
 * 5
 * -1 -2 -3 -4 -5
 * -> -1
 */

package dynamicProgramming;

import java.util.Scanner;

public class ContinuousSum {

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