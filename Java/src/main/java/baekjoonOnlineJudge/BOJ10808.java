package baekjoonOnlineJudge;

import java.util.Scanner;

public class BOJ10808 {// string
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		int[] alphabet = new int[26];

		for (int i = 0; i < word.length(); i++) {
			alphabet[word.charAt(i) - 'a']++;
		}
		for (int i = 0; i < alphabet.length; i++) {
			System.out.print(alphabet[i] + " ");
		}
	}
}