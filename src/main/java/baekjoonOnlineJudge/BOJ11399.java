package baekjoonOnlineJudge;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ11399 {	// greedy
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] p = new int[n];

        for (int i = 0; i < n; i++) {
            p[i] = scanner.nextInt();
        }
        Arrays.sort(p);
        int total = p[0];

        for (int i = 0; i < n - 1; i++) {
            p[i + 1] += p[i];
            total += p[i + 1];
        }
        System.out.print(total);
        scanner.close();
    }
}