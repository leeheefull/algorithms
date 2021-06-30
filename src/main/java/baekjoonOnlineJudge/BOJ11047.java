package baekjoonOnlineJudge;

import java.util.Scanner;

public class BOJ11047 {	// greedy
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // number of coins
        int K = scanner.nextInt(); // sum
        int[] A = new int[N]; // value of coin
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }
        int result = 0;

        for (int i = N - 1; -1 < i; i--) {
            if (A[i] <= K) {
                result += K / A[i];
                K = K % A[i];
            }
        }
        System.out.print(result);
        scanner.close();
    }
}