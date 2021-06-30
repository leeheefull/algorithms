package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2133 { // dp
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
