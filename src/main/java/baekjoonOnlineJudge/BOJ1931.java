package baekjoonOnlineJudge;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ1931 {	// greedy
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt(); // number of meetings
		int[][] time = new int[n][2]; // time of meetings

		for (int i = 0; i < n; i++) {
			time[i][0] = scanner.nextInt();
			time[i][1] = scanner.nextInt();
		}
		int min = -1; // minimum(min!=0)
		int cnt = 0; // solution

		Arrays.sort(time, (x, y) -> x[1] == y[1] ? x[0] - y[0] : x[1] - y[1]);

		for (int i = 0; i < n; i++) {
			if (min <= time[i][0]) {
				min = time[i][1];
				cnt++;
			}
		}
		System.out.println(cnt);
		scanner.close();
	}
}