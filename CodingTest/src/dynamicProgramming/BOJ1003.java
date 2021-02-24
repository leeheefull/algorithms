package dynamicProgramming;

import java.util.Scanner;

public class BOJ1003 {	// Fibonacci Function

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int T = scan.nextInt();
		int[] fibo = new int[41];

		fibo[0] = 0;
		fibo[1] = 1;
		while (T-- > 0) {
			int n = scan.nextInt();
			
			for (int i = 2; i <= n; i++) {
				if (fibo[i] == 0) {
					fibo[i] = fibo[i - 1] + fibo[i - 2];
				}
			}

			if (n == 0) {
				System.out.println(1 + " " + 0);
			} else {
				System.out.println(fibo[n - 1] + " " + fibo[n]);
			}
		}
	}
}