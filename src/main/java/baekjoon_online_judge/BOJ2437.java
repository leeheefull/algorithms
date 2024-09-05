package baekjoon_online_judge;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ2437 {	// greedy
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] weight = new int[n];

        for (int i = 0; i < n; i++) {
            weight[i] = scanner.nextInt();
        }

        Arrays.sort(weight);
        System.out.print(min(weight));
    }

    private static int min(int[] weight) {

        int result = 0;
        for (int j : weight) {
            if (result + 1 < j) {
                break;
            }
            result += j;
        }
        return result + 1;
    }
}