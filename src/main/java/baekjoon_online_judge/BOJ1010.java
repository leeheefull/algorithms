package baekjoon_online_judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1010 {
    private static final int[][] dp = new int[30][30];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            System.out.println(getCombination(n, r));
        }
    }

    private static int getCombination(int n, int r) {
        // 이미 구했던 값이면, 바로 출력
        if (dp[n][r] > 0) {
            return dp[n][r];
        }
        // 조합 기본 규칙
        if (n == r || r == 0) {
            return dp[n][r] = 1;
        }
        // 조합의 파스칼 공식
        return dp[n][r] = getCombination(n - 1, r - 1) + getCombination(n - 1, r);
    }
}
