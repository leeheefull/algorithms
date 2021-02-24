package greedy;

import java.util.Scanner;

public class BOJ1783 {	// Sick Knight

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		System.out.println(chess(N, M));
	}

	private static int chess(int n, int m) {
		if (n == 1) {
			return 1;
		} else if (n == 2) {
			return Math.min(4, (m + 1) / 2);
		} else {
			if (m < 7) {
				return Math.min(4, m);
			} else {
				return m - 2;
			}
		}
	}
}