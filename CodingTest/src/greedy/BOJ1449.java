package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ1449 {	// Repairman

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int l = scan.nextInt();
		int[] leak = new int[n];
		int result = 0;
		int tmp = 0;

		for (int i = 0; i < n; i++) {
			leak[i] = scan.nextInt();
		}
		Arrays.sort(leak);

		tmp = leak[0];
		result++;
		for (int v : leak) {
			if (tmp + l - 1 < v) {
				tmp = v;
				result++;
			}
		}
		System.out.print(result);
	}
}