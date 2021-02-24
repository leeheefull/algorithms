package string;

import java.util.Scanner;

public class BOJ8958 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String[] OX = new String[n];

		for (int i = 0; i < n; i++) {
			OX[i] = scanner.next();
		}
		for (int i = 0; i < n; i++) {
			System.out.println(quiz(OX[i]));
		}
	}

	private static int quiz(String OX) {
		int result = 0, cnt = 0;

		for (int i = 0; i < OX.length(); i++) {
			if (OX.charAt(i) == 'X') {
				cnt = 0;
			} else {
				result += ++cnt;
			}
		}
		return result;
	}
}