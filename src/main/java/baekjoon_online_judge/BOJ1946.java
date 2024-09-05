package baekjoon_online_judge;

import java.util.Scanner;

public class BOJ1946 {	// greedy
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int cnt = scanner.nextInt();
		int[] pass = new int[cnt];

		for (int t = 0; t < cnt; t++) {
			int n = scanner.nextInt();
			int[] person = new int[n + 1];

			for (int i = 0; i < n; i++) {
				int paper = scanner.nextInt();
				int interview = scanner.nextInt();
				person[paper] = interview; // Rank
			}
			pass[t] = 1;
			int tmp = person[1];
			for (int i = 2; i <= n; i++) {
				if (person[i] < tmp) {
					pass[t]++;
					tmp = person[i];
				}
			}
		}
		for (int t = 0; t < cnt; t++) {
			System.out.println(pass[t]);
		}
	}
}