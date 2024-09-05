package baekjoon_online_judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1373 {// string
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder binary = new StringBuilder(br.readLine());
		StringBuilder result = new StringBuilder();

		if (binary.length() % 3 == 2) {
			binary.insert(0, "0");
		} else if (binary.length() % 3 == 1) {
			binary.insert(0, "00");
		}

		for (int i = 0; i < binary.length(); i += 3) {
			int sum = 0;
			sum += ((int) (binary.charAt(i) - 48)) * 4;
			sum += ((int) (binary.charAt(i + 1) - 48)) * 2;
			sum += ((int) (binary.charAt(i + 2) - 48)) * 1;
			result.append(sum);
		}
		System.out.print(result);
	}
}