package greedy;

import java.util.Scanner;

public class BOJ5585 {	// Exchange

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int money = scanner.nextInt(); // money to pay
		money = 1000 - money; // change
		int[] coin = { 500, 100, 50, 10, 5, 1 }; // kind of change
		int cnt = 0; // change money count

		for (int i = 0; i < coin.length; i++) {
			if (0 < money / coin[i]) {
				cnt += money / coin[i];
				money %= coin[i];
			}
		}
		System.out.print(cnt);
		scanner.close();
	}
}