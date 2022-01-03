package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ13565 {     // 침투
    private static int n, m;
    private static int[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        map = new int[m][n];

        for (int i = 0; i < m; i++) {
            char[] tmp = br.readLine().toCharArray();
            for (int j = 0; j < n; j++) {
                map[i][j] = tmp[j] - '0';
            }
        }

        for (int i = 0; i < n; i++) {
            if (map[0][i] == 0 && bfs(new Node(0, i))) {
                System.out.print("YES");
                return;
            }
        }
        System.out.print("NO");
    }

    private static boolean bfs(Node node) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(node);
        map[node.x][node.y] = 1;

        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, -1, 0, 1};

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nextX = current.x + dx[i];
                int nextY = current.y + dy[i];

                if (0 <= nextX && nextX < m && 0 <= nextY && nextY < n && map[nextX][nextY] == 0) {
                    if (nextX == m - 1) {
                        return true;
                    }
                    queue.offer(new Node(nextX, nextY));
                    map[nextX][nextY] = 1;
                }
            }
        }
        return false;
    }
}