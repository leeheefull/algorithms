package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11365 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			String line = br.readLine();

			if (line.equals("END")) {
				break;
			}
			for (int i = 0; i < line.length(); i++) {
				System.out.print(line.charAt(line.length() - 1 - i));
			}
			System.out.println();
		}
	}
}