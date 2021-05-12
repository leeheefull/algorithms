package bfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ2667 {

    private static final int[] dx = {-1, 0, 1, 0};
    private static final int[] dy = {0, -1, 0, 1};
    private static final List<Integer> result = new ArrayList<>();

    private static int n;
    private static int[][] map;
    private static boolean[][] visited;

    private static class Node {
        public int x;
        public int y;

        public Node(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        map = new int[n][n];
        visited = new boolean[n][n];

        for (int i = 0; i < n; i++) {
            String tmp = br.readLine();
            for (int j = 0; j < n; j++) {
                map[i][j] = tmp.charAt(j) - '0';
            }
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] == 1 && !visited[i][j]) {
                    result.add(bfs(new Node(i, j)));
                }
            }
        }
        Collections.sort(result);

        System.out.println(result.size());
        for (Integer integer : result) {
            System.out.println(integer);
        }
    }

    private static int bfs(Node node) {
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(node.x, node.y));
        visited[node.x][node.y] = true;
        int cnt = 1;

        while (!queue.isEmpty()) {
            Node current = queue.poll();
            System.out.println(current.x + " " + current.y);
            for (int i = 0; i < 4; i++) {
                int nextX = current.x + dx[i];
                int nextY = current.y + dy[i];

                if (0 <= nextX && 0 <= nextY && nextX < n && nextY < n
                        && !visited[nextX][nextY]
                        && map[nextX][nextY] == 1) {
                    queue.add(new Node(nextX, nextY));
                    visited[nextX][nextY] = true;
                    cnt++;
                }
            }
        }
        return cnt;
    }
}