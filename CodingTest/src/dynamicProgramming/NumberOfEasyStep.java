/* baekjoon 10844
 * 45656이란 수를 보자.
 * 이 수는 인접한 모든 자리수의 차이가 1이 난다. 이런 수를 계단 수라고 한다.
 * 세준이는 수의 길이가 N인 계단 수가 몇 개 있는지 궁금해졌다.
 * N이 주어질 때, 길이가 N인 계단 수가 총 몇 개 있는지 구하는 프로그램을 작성하시오. (0으로 시작하는 수는 없다.)
 * 
 * input
 * 첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 100보다 작거나 같은 자연수이다.
 * 
 * output
 * 첫째 줄에 정답을 1,000,000,000으로 나눈 나머지를 출력한다.
 * 
 * example
 * 1
 * -> 9
 * 2
 * -> 17
 */

package dynamicProgramming;

import java.util.Scanner;

public class NumberOfEasyStep {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		long[][] dp = new long[n+1][10];
		long result = 0;
		
		for(int i=1; i<=9; i++)
			dp[1][i] = 1;
		
		for(int i=2; i<n+1; i++) {
			for(int j=0; j<10; j++){
				if(j==0)
					dp[i][j] = dp[i-1][j+1];
				else if(j==9)
					dp[i][j] = dp[i-1][j-1];
				else
					dp[i][j] = dp[i-1][j-1] + dp[i-1][j+1];
				
				dp[i][j] %= 1000000000;
			}
		}
		
		for(int i=0; i<10; i++)
			result += dp[n][i];
		
		System.out.print(result%1000000000);
	}
}