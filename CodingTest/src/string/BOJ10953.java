package string;

import java.util.Scanner;

public class BOJ10953 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] result = new int[n];

		for (int i = 0; i < n; i++) {
			String tmp = scan.next();
			result[i] = tmp.charAt(0) + tmp.charAt(2) - 96;
		}
		for (int i = 0; i < n; i++) {
			System.out.println(result[i]);
		}
	}
}