package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ2217 {    // Rope

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] ropes = new int[N];

        for (int i = 0; i < N; i++) {
            ropes[i] = scanner.nextInt();
        }
        int max = 0;
        Arrays.sort(ropes);

        for (int i = 0; i < N; i++) {
            max = Math.max(max, ropes[i] * (N - i));
        }
        System.out.printf("%d\n", max);
        scanner.close();
    }
}
