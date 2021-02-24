package string;

import java.util.Scanner;

public class BOJ1157 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		int[] alpa = new int[26];
		int max = -1;
		char result = '?';

		for (int i = 0; i < word.length(); i++) {
			if ('A' <= word.charAt(i) && word.charAt(i) <= 'Z') {
				alpa[word.charAt(i) - 'A']++;
			} else {
				alpa[word.charAt(i) - 'a']++;
			}
		}
		for (int i = 0; i < alpa.length; i++) {
			if (max < alpa[i]) {
				max = alpa[i];
				result = (char) (i + 65);
			} else if (alpa[i] == max) {
				result = '?';
			}
		}
		System.out.print(result);
	}
}