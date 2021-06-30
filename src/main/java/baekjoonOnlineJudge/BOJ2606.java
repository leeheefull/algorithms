package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ2606 { // bfs
    private static int n;
    private static int[][] matrix;
    private static boolean[] visited;

    public static void main(String[] args) throws IOException {
        makeAdjacencyMatrix();
        System.out.print(bfs());
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

    private static int bfs() {
        Queue<Integer> queue = new LinkedList<>();
        queue.add(1);
        visited[1] = true;
        int cnt = 0;

        while (!queue.isEmpty()) {
            int tmp = queue.poll();

            for (int i = 1; i < n + 1; i++) {
                if (!visited[i] && matrix[tmp][i] == 1) {
                    queue.add(i);
                    visited[i] = true;
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
