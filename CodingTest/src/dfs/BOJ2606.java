package dfs;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ2606 {

    private static int n, cnt = 0;
    private static int[][] matrix;
    private static boolean[] visited;

    public static void main(String[] args) throws IOException {

        makeAdjacencyMatrix();
        dfs(1);
        System.out.print(cnt);
    }

    private static void makeAdjacencyMatrix() throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        matrix = new int[n + 1][n + 1];
        visited = new boolean[n + 1];

        for (int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            matrix[x][y] = matrix[y][x] = 1;
        }
    }

    private static void dfs(int idx) {

        visited[idx] = true;
        for (int i = 1; i < n + 1; i++) {
            if (!visited[i] && matrix[idx][i] == 1) {
                System.out.println(idx + " " + i);
                cnt++;
                dfs(i);
            }
        }
    }
}
