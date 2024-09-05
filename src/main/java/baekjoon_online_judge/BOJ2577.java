package baekjoon_online_judge;

import java.util.Scanner;

public class BOJ2577 {// string
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String n = (scan.nextInt() * scan.nextInt() * scan.nextInt()) + "";
		int[] num = new int[10];

		for (int i = 0; i < n.length(); i++) {
			num[n.charAt(i) - '0']++;
		}
		for (int v : num) {
			System.out.println(v);
		}
	}
}