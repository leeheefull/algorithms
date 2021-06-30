package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ1182 { // bruteforce
    private static int n, s, result = 0;
    private static int[] set;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        s = Integer.parseInt(st.nextToken());
        set = new int[n];

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            set[i] = Integer.parseInt(st.nextToken());
        }

        backtrack(0, 0);
        if (s == 0) {
            result--;
        }
        System.out.print(result);
    }

    private static void backtrack(int sum, int idx) {
        if (n == idx) {
            if (sum == s) {
                result++;
            }
            return;
        }
        backtrack(sum + set[idx], idx + 1);
        backtrack(sum, idx + 1);
    }
}
