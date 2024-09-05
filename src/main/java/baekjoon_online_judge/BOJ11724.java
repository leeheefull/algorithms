package baekjoon_online_judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ11724 { // bfs
    private static int n;
    private static boolean[][] matrix;
    private static boolean[] visited;

    public static void main(String[] args) throws IOException {
        makeAdjacencyMatrix();
        int result = 0;
        for (int i = 1; i < n + 1; i++) {
            if (!visited[i]) {
                bfs(i);
                result++;
            }
        }
        System.out.print(result);
    }

    private static void makeAdjacencyMatrix() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        matrix = new boolean[n + 1][n + 1];
        visited = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st.nextToken());
            int v = Integer.parseInt(st.nextToken());
            matrix[u][v] = matrix[v][u] = true;
        }
    }

    private static void bfs(int start) {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(start);
        visited[start] = true;

        while (!queue.isEmpty()) {
            int tmp = queue.poll();
            for (int i = 1; i < n + 1; i++) {
                if (matrix[tmp][i] && !visited[i]) {
                    queue.add(i);
                    visited[i] = true;
                }
            }
        }
    }
}
