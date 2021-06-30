package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ16931 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] figure = new int[n + 1][m + 1];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                figure[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        System.out.println(solve(n, m, figure));
    }

    private static int solve(int n, int m, int[][] figure) {
        // 아래, 위
        int answer = n * m;

        // 왼쪽, 오른쪽
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (figure[i][j] > figure[i][j + 1]) {
                    answer += figure[i][j] - figure[i][j + 1];
                }
            }
        }

        // 앞, 뒤
        for (int j = 0; j < m; j++) {
            for (int i = 0; i < n; i++) {
                if (figure[i][j] > figure[i + 1][j]) {
                    answer += figure[i][j] - figure[i + 1][j];
                }
            }
        }
        return answer * 2;
    }
}
