package baekjoon_online_judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1032 {// string
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] input = new String[n];
		String result = "";

		for (int i = 0; i < n; i++) {
			input[i] = br.readLine();
		}
		for (int i = 0; i < input[0].length(); i++) {
			boolean dif = false;
			for (int j = 0; j < n - 1; j++) {
				if (input[j].charAt(i) != input[j + 1].charAt(i)) {
					dif = true;
					break;
				}
			}
			if (dif) {
				result += "?";
			} else {
				result += input[0].charAt(i);
			}
		}
		System.out.print(result);
	}
}