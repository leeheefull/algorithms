package baekjoonOnlineJudge;

import java.util.Scanner;

public class BOJ10809 {// string
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String S = scan.next();

		for (char c = 'a'; c <= 'z'; c++) {
			System.out.print(S.indexOf(c) + " ");
		}
	}
}