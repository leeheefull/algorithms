package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ11655 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line = br.readLine();

		for (int i = 0; i < line.length(); i++) {
			char before = line.charAt(i);
			if (!(('A' <= before && before <= 'Z') || ('a' <= before && before <= 'z'))) {
				System.out.print(before);
			} else {
				char after = (char) (before + 13);
				if (before <= 'Z' && 'A' <= after && after <= 'Z') {
					System.out.print(after);
				} else if ('a' <= before && 'a' <= after && after <= 'z') {
					System.out.print(after);
				} else {
					System.out.print((char) (after - 26));
				}
			}
		}
	}
}