/* baekjoon 11727
 * 2×n 직사각형을 1×2, 2×1과 2×2 타일로 채우는 방법의 수를 구하는 프로그램을 작성하시오.
 * 아래 그림은 2×17 직사각형을 채운 한가지 예이다.
 * 
 * input
 * 첫째 줄에 n이 주어진다. (1 ≤ n ≤ 1,000)
 * 
 * output
 * 첫째 줄에 2×n 크기의 직사각형을 채우는 방법의 수를 10,007로 나눈 나머지를 출력한다.
 * 
 * example
 * 2
 * -> 3
 * 8
 * -> 171
 * 12
 * -> 2731
 */

package dynamicProgramming;

import java.util.Scanner;

public class Tiling2N2 {

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