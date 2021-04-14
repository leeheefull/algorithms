package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2231 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int cnt = 0;    // ÀÚ¸®¼ö

        int tmp = n;
        while (0 < tmp) {
            cnt++;
            tmp /= 10;
        }

        for (int i = n - cnt * 9; i < n; i++) {
            int num = i;
            int result = i;

            while (0 < num) {
                result += num % 10;
                num /= 10;
            }

            if (n == result) {
                System.out.print(i);
                return;
            }
        }
        System.out.print(0);
    }
}
