package bruteforce;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class BOJ14888 {

    private static int n;
    private static int[] number;
    private static int[] operator = new int[4];
    private static int max = Integer.MIN_VALUE;
    private static int min = Integer.MAX_VALUE;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        number = new int[n];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            number[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < operator.length; i++) {
            operator[i] = Integer.parseInt(st.nextToken());
        }

        bruteForce(number[0], 1);
        System.out.println(max);
        System.out.println(min);
    }

    private static void bruteForce(int tmp, int idx) {
        if (idx == n) {
            max = Math.max(max, tmp);
            min = Math.min(min, tmp);
            return;
        }

        for (int i = 0; i < 4; i++) {
            if (operator[i] > 0) {
                operator[i]--;
                switch (i) {
                    case 0:
                        bruteForce(tmp + number[idx], idx + 1);
                        break;
                    case 1:
                        bruteForce(tmp - number[idx], idx + 1);
                        break;
                    case 2:
                        bruteForce(tmp * number[idx], idx + 1);
                        break;
                    case 3:
                        bruteForce(tmp / number[idx], idx + 1);
                        break;
                }
                operator[i]++;
            }
        }
    }
}