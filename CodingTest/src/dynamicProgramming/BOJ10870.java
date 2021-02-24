/* baekjoon 10870
 * �Ǻ���ġ ���� 0�� 1�� �����Ѵ�. 
 * 0��° �Ǻ���ġ ���� 0�̰�, 1��° �Ǻ���ġ ���� 1�̴�. 
 * �� ���� 2��° ���ʹ� �ٷ� �� �� �Ǻ���ġ ���� ���� �ȴ�.
 * �̸� ������ �Ẹ�� Fn = Fn-1 + Fn-2 (n �� 2)�� �ȴ�.
 * n=17�϶� ���� �Ǻ���ġ ���� �Ẹ�� ������ ����.
 * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
 * n�� �־����� ��, n��° �Ǻ���ġ ���� ���ϴ� ���α׷��� �ۼ��Ͻÿ�.
 *  
 * input
 * ù° �ٿ� n�� �־�����. n�� 20���� �۰ų� ���� �ڿ��� �Ǵ� 0�̴�.
 * 
 * output
 * ù° �ٿ� n��° �Ǻ���ġ ���� ����Ѵ�.
 * 
 * example
 * 10
 * -> 55
 */

package dynamicProgramming;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10870 {	// Fibonacci Number 5

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long[] dp = new long[n + 1];

		if (0 <= n) {
			dp[0] = 0;
		}
		if (1 <= n) {
			dp[1] = 1;
		}
		for (int i = 2; i < n + 1; i++) {
			dp[i] = dp[i - 1] + dp[i - 2];
		}
		System.out.print(dp[n]);
	}
}