package dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ4963 {

    private static int w;
    private static int h;
    private static int[][] map;
    private static boolean[][] visited;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            w = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            if (h == 0 && w == 0) {
                return;
            }

            map = new int[h][w];
            visited = new boolean[h][w];
            int result = 0;

            for (int i = 0; i < h; i++) {
                st = new StringTokenizer(br.readLine());
                for (int j = 0; j < w; j++) {
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            for (int i = 0; i < h; i++) {
                for (int j = 0; j < w; j++) {
                    if (map[i][j] == 1 && !visited[i][j]) {
                        result++;
                        dfs(i, j);
                    }
                }
            }
            System.out.println(result);
        }
    }

    private static void dfs(int x, int y) {

        int[] dx = {-1, 0, 1, 0, -1, -1, 1, 1};
        int[] dy = {0, -1, 0, 1, -1, 1, -1, 1};
        visited[x][y] = true;

        for (int i = 0; i < 8; i++) {
            int nextX = x + dx[i];
            int nextY = y + dy[i];

            if (0 <= nextX && 0 <= nextY && nextX < h && nextY < w
                    && !visited[nextX][nextY] && map[nextX][nextY] == 1) {
                dfs(nextX, nextY);
            }
        }
    }
}
