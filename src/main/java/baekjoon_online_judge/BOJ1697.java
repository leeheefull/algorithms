package baekjoon_online_judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class BOJ1697 {  // 숨바꼭질
    private static int k;
    private static final int[] check = new int[100001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        k = Integer.parseInt(st.nextToken());

        bfs(n);
    }

    public static void bfs(int n) {
        if (n == k) {
            System.out.print(0);
            return;
        }

        Queue<Integer> queue = new LinkedList<>();
        queue.offer(n);
        check[n] = 1;

        while (!queue.isEmpty()) {
            int currentN = queue.poll();
            int[] nextN = {currentN + 1, currentN - 1, currentN * 2};

            for (int i = 0; i < 3; i++) {
                if (nextN[i] == k) {
                    System.out.print(check[currentN]);
                    return;
                }

                if (0 <= nextN[i] && nextN[i] < check.length && check[nextN[i]] == 0) {
                    queue.offer(nextN[i]);
                    check[nextN[i]] = check[currentN] + 1;
                }
            }
        }
    }
}
