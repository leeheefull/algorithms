package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1065 { // bruteforce
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 0;

        for (int i = 1; i <= n; i++) {
            if (i < 100) {
                result++;
            } else if (i < 1000) {
                int[] arr = {i / 100, (i / 10) % 10, i % 10};
                if (arr[2] - arr[1] == arr[1] - arr[0]) {
                    result++;
                }
            }
        }
        System.out.print(result);
    }
}
