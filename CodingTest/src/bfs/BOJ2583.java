package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ2583 {
    private static int m, n;
    private static boolean[][] map;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        List<Integer> result = new ArrayList<>();

        m = Integer.parseInt(st.nextToken());
        n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        map = new boolean[m][n];

        for (int i = 0; i < k; i++) {
            st = new StringTokenizer(br.readLine());
            visit(
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken()),
                    Integer.parseInt(st.nextToken())
            );
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (!map[i][j]) {
                    result.add(bfs(new Node(i, j)));
                }
            }
        }
        Collections.sort(result);
        System.out.println(result.size());
        for (int value : result) {
            System.out.print(value + " ");
        }
    }

    private static void visit(int startX, int startY, int endX, int endY) {
        for (int i = startY; i < endY; i++) {
            for (int j = startX; j < endX; j++) {
                map[i][j] = true;
            }
        }
    }

    private static int bfs(Node node) {
        Queue<Node> queue = new LinkedList<>();
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, -1, 0, 1};
        map[node.x][node.y] = true;

        queue.add(new Node(node.x, node.y));
        int cnt = 1;

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            for (int i = 0; i < 4; i++) {
                int nextX = current.x + dx[i];
                int nextY = current.y + dy[i];

                if (0 <= nextX && 0 <= nextY && nextX < m && nextY < n && !map[nextX][nextY]) {
                    cnt++;
                    map[nextX][nextY] = true;
                    queue.add(new Node(nextX, nextY));
                }
            }
        }
        return cnt;
    }
}
