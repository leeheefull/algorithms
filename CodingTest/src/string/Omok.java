package string;

import java.util.Scanner;

public class Omok {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("* width: ");
		int w = scanner.nextInt();
		System.out.print("* height: ");
		int h = scanner.nextInt();
		System.out.print("* point x: ");
		int a = scanner.nextInt();
		System.out.print("* point y: ");
		int b = scanner.nextInt();

		for (int y = 1; y <= h; y++) {
			for (int x = 1; x <= w; x++) {
				if (x == a && y == b) {
					System.out.printf("%c", '¡Ü');}
				else if (x == 1 && y == 1) {
					System.out.printf("%c", '¦£');}
				else if (x == w && y == 1) {
					System.out.printf("%c", '¦¤');}
				else if (x == 1 && y == h) {
					System.out.printf("%c", '¦¦');}
				else if (x == w && y == h) {
					System.out.printf("%c", '¦¥');}
				else if (x == 1) {
					System.out.printf("%c", '¦§');}
				else if (y == 1) {
					System.out.printf("%c", '¦¨');}
				else if (x == w) {
					System.out.printf("%c", '¦©');}
				else if (y == h) {
					System.out.printf("%c", '¦ª');}
				else {
					System.out.printf("%c", '¦«');}
			}
			System.out.println();
		}
		scanner.close();
	}
}