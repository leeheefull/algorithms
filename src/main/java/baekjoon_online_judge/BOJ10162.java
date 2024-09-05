package baekjoon_online_judge;

import java.util.Scanner;

public class BOJ10162 {	// greedy
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int tmp, a = 300, b = 60, c = 10;
		int t = scanner.nextInt();

		tmp = t / a;
		t = t % a;
		a = tmp;

		tmp = t / b;
		t = t % b;
		b = tmp;

		tmp = t / c;
		t = t % c;
		c = tmp;

		if (t != 0) {
			System.out.print(-1);
		} else {
			System.out.print(a + " " + b + " " + c);
		}
	}
}