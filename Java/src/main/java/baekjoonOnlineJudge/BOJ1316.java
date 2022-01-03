package baekjoonOnlineJudge;

import java.util.Scanner;

public class BOJ1316 {// string
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int result = 0;

		for (int i = 0; i < n; i++) {
			if (checker(scan.next()) == true) {
				result++;
			}
		}
		System.out.println(result);
	}

	public static boolean checker(String word) {
		boolean[] check = new boolean[26];
		int prev = 0;

		for (int i = 0; i < word.length(); i++) {
			int tmp = word.charAt(i);
			if (prev != tmp) {
				if (check[tmp - 'a'] == false) {
					check[tmp - 'a'] = true;
					prev = tmp;
				} else {
					return false;
				}
			}
		}
		return true;
	}
}