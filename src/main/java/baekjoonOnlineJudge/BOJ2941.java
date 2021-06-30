package baekjoonOnlineJudge;

import java.util.Scanner;

public class BOJ2941 {// string
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] alphabet = { "c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z=" };
		String word = scan.next();

		for (int i = 0; i < alphabet.length; i++) {
			if (word.contains(alphabet[i])) {
				word = word.replaceAll(alphabet[i], "/");
			}
		}
		System.out.print(word.length());
	}
}