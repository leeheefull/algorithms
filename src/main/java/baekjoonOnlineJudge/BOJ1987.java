package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1987 { // dfs
    private static final boolean[] visited = new boolean[26];
    private static int r, c, result;
    private static char[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());

        map = new char[r][c];
        for (int i = 0; i < r; i++) {
            map[i] = br.readLine().toCharArray();
        }

        dfs(0, 0, 0);
        System.out.print(result);
    }

    private static void dfs(int x, int y, int depth) {
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, -1, 0, 1};
        int tmp = map[x][y] - 'A';

        if (visited[tmp]) {
            result = Math.max(result, depth);
        } else {
            visited[tmp] = true;
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];
                if (nx >= 0 && ny >= 0 && nx < r && ny < c) {
                    dfs(nx, ny, depth + 1);
                }
            }
            visited[tmp] = false;
        }
    }
}
