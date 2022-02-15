package baekjoonOnlineJudge;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BOJ1138 {    // greedy
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] tall = new int[N + 1]; // input
        List<Integer> line = new ArrayList<>(); // result
        line.add(0);

        for (int i = 1; i <= N; i++) {
            tall[i] = scanner.nextInt();
        }

        for (int i = N; 1 <= i; i--) {
            line.add(tall[i], i);
        }

        for (int i = 0; i < N; i++) {
            System.out.print(line.get(i) + " ");
        }
    }
}