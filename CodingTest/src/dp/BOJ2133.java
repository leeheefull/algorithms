/*
타일 채우기
시간 제한	메모리 제한	제출	    정답	    맞은 사람	정답 비율
2 초	    128 MB  	28581   10028	7879    	35.262%
문제
3×N 크기의 벽을 2×1, 1×2 크기의 타일로 채우는 경우의 수를 구해보자.

입력
첫째 줄에 N(1 ≤ N ≤ 30)이 주어진다.

출력
첫째 줄에 경우의 수를 출력한다.

예제 입력 1
2
예제 출력 1
3
 */

package dp;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2133 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dp = new int[31];

        dp[0] = 1;
        dp[1] = 0;
        dp[2] = 3;

        for (int i = 4; i <= n; i = i + 2) {
            dp[i] = dp[i - 2] * 3;
            for (int j = i - 4; j >= 0; j = j - 2) {
                dp[i] = dp[i] + dp[j] * 2;
            }
        }
        System.out.print(dp[n]);
    }
}
