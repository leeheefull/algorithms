package baekjoonOnlineJudge;

import java.util.Scanner;

public class BOJ11720 {// string
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String number = scanner.next();
		int result = 0;

		for (int i = 0; i < n; i++) {
			result += number.charAt(i) - '0';
		}
		System.out.print(result);
	}
}