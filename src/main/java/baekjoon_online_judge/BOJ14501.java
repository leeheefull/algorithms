package baekjoon_online_judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ14501 { // dp
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());
        int[] t = new int[n + 2];
        int[] p = new int[n + 2];
        int[] dp = new int[n + 6];

        for (int i = 1; i < n + 1; i++) {
            st = new StringTokenizer(br.readLine());
            t[i] = Integer.parseInt(st.nextToken());
            p[i] = Integer.parseInt(st.nextToken());
        }

        for (int i = 1; i < n + 2; i++) {
            dp[i] = Math.max(dp[i], dp[i - 1]);
            dp[t[i] + i] = Math.max(dp[t[i] + i], dp[i] + p[i]);
        }
        System.out.print(dp[n + 1]);
    }
}
