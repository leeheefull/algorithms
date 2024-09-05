package baekjoon_online_judge;

import java.util.Scanner;

public class BOJ1152 {// string
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String sentence = scanner.nextLine();
		int cnt = 0;

		if (!sentence.equals("") && !sentence.equals(" ")) {
			cnt = 1;
			for (int i = 1; i < sentence.length() - 1; i++) {
				if (sentence.charAt(i) == ' ') {
					cnt++;
				}
			}
		}
		System.out.print(cnt);
	}
}