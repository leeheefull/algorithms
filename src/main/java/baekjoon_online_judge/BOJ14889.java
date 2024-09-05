package baekjoon_online_judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ14889 { // bruteforce
    private static int n;
    private static int[][] map;
    private static boolean[] visited;
    private static int result = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        makeComb(0, 0);
        System.out.print(result);
    }

    private static void makeComb(int idx, int depth) {
        if (depth == n / 2) {
            getDiff();
            return;
        }
        for (int i = idx; i < n; i++) {
            if (!visited[i]) {
                visited[i] = true;
                makeComb(i + 1, depth + 1);
                visited[i] = false;
            }
        }
    }

    private static void getDiff() {
        int teamStart = 0;
        int teamLink = 0;

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (visited[i] && visited[j]) {
                    teamStart += map[i][j] + map[j][i];
                } else if (!visited[i] && !visited[j]) {
                    teamLink += map[i][j] + map[j][i];
                }
            }
        }
        int min = Math.abs(teamStart - teamLink);
        result = Math.min(min, result);
    }
}