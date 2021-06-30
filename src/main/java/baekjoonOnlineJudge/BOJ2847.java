package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2847 {	// greedy
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int[] level = new int[n];
        int result = 0;

        for (int i = 0; i < n; i++) {
            level[i] = Integer.parseInt(br.readLine());
        }

        for (int i = n - 1; 0 < i; i--) {
            if (level[i] <= level[i - 1]) {
                int reduction = level[i - 1] - level[i] + 1;
                level[i - 1] -= reduction;
                result += reduction;
            }
        }
        System.out.print(result);
    }
}
