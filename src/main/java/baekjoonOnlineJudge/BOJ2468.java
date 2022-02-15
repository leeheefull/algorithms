package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ2468 { // bfs
    private static int n;
    private static boolean[][] check;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        int[][] map = new int[n][n];
        check = new boolean[n][n];
        int maxHeight = 0;
        int result = 0;

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            for (int j = 0; j < n; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                maxHeight = Math.max(maxHeight, map[i][j]);
            }
        }

        for (int i = 0; i < maxHeight; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (i < map[j][k]) {
                        check[j][k] = true;
                    }
                }
            }
            int cnt = 0;
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    if (check[j][k]) {
                        dfs(j, k);
                        cnt++;
                    }
                }
            }
            result = Math.max(result, cnt);
        }
        System.out.print(result);
    }

    private static void dfs(int x, int y) {
        Queue<Node> queue = new LinkedList<>();
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, -1, 0, 1};

        queue.add(new Node(x, y));
        check[x][y] = false;

        while (!queue.isEmpty()) {
            Node current = queue.poll();

            for (int i = 0; i < 4; i++) {
                int nextX = current.x + dx[i];
                int nextY = current.y + dy[i];

                if (0 <= nextX && 0 <= nextY && nextX < n && nextY < n && check[nextX][nextY]) {
                    queue.add(new Node(nextX, nextY));
                    check[nextX][nextY] = false;
                }
            }
        }
    }
}
