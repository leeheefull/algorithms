package baekjoon_online_judge;

import java.util.Scanner;

public class BOJ2839 { // dp
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // weight
        int bags = 0; // number of bags

        while (true) {
            if (N % 5 == 0) {
                System.out.print(N / 5 + bags);
                break;
            } else if (N <= 0) {
                System.out.print(-1);
                break;
            }
            N -= 3;
            bags++;
        }
        scanner.close();
    }
}