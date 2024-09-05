package baekjoon_online_judge;

import java.util.Scanner;

public class BOJ11721 {// string
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.next();

		for (int i = 0; i < input.length(); i++) {
			if (i != 0 && i % 10 == 0) {
				System.out.println();
			}
			System.out.print(input.charAt(i));
		}
	}
}