package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ16953 {	// greedy
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int result = 1;

        while (a != b) {
            if (b % 10 == 1) {
                b /= 10;
            } else if (b % 2 == 0 && b != 0) {
                b /= 2;
            } else {
                result = -1;
                break;
            }
            result++;
        }
        System.out.print(result);
    }
}
