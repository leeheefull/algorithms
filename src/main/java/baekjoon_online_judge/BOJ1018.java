package baekjoon_online_judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1018 { // bruteforce
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        char[][] chess = new char[n][m];
        int result = 64;

        for (int i = 0; i < n; i++) {
            chess[i] = br.readLine().toCharArray();
        }

        for (int i = 0; i < n - 7; i++) {
            for (int j = 0; j < m - 7; j++) {
                int cnt = 0;
                for (int x = i; x < i + 8; x++) {
                    for (int y = j; y < j + 8; y++) {
                        if ((i + j) % 2 == (x + y) % 2 && chess[i][j] != chess[x][y]) {
                            cnt++;
                        } else if ((i + j) % 2 != (x + y) % 2 && chess[i][j] == chess[x][y]) {
                            cnt++;
                        }
                    }
                }
                cnt = Math.min(cnt, 64 - cnt);
                result = Math.min(result, cnt);
            }
        }
        System.out.print(result);
    }
}