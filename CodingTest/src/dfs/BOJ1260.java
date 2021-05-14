package dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ1260 {

    private static int n, v;
    private static int[][] matrix;
    private static boolean[] visited;

    public static void main(String[] args) throws IOException {

        makeAdjacencyMatrix();
        dfs(v);
        System.out.println();
        visited = new boolean[n + 1];
        bfs(v);
    }

    private static void makeAdjacencyMatrix() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        v = Integer.parseInt(st.nextToken());
        matrix = new int[n + 1][n + 1];
        visited = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            matrix[x][y] = matrix[y][x] = 1;
        }
    }

    private static void dfs(int idx) {
        visited[idx] = true;
        System.out.print(idx + " ");

        for (int i = 1; i < n + 1; i++) {
            if (!visited[i] && matrix[idx][i] == 1) {
                dfs(i);
            }
        }
    }

    private static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;
        System.out.print(start + " ");

        while (!queue.isEmpty()) {
            int tmp = queue.poll();

            for (int i = 1; i < n + 1; i++) {
                if (!visited[i] && matrix[tmp][i] == 1) {
                    queue.add(i);
                    visited[i] = true;
                    System.out.print(i + " ");
                }
            }
        }
    }
}
