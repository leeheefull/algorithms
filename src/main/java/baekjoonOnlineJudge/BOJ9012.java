package baekjoonOnlineJudge;

import java.util.Scanner;

public class BOJ9012 {// string
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		for (int i = 0; i < n; i++) {
			System.out.println(vps(scan.next()));
		}
	}

	private static String vps(String line) {
		int left = 0;
		int right = 0;

		for (int i = 0; i < line.length(); i++) {
			if (line.charAt(i) == '(') {
				left++;
			}
			if (line.charAt(i) == ')') {
				right++;
			}
			if (left < right) {
				return "NO";
			}
		}
		if (left != right) {
			return "NO";
		} else {
			return "YES";
		}
	}
}