package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2902 {// string
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		String output = "";

		output += input.charAt(0);
		for (int i = 1; i < input.length(); i++) {
			if (input.charAt(i) == '-') {
				output += input.charAt(i + 1);
			}
		}
		System.out.print(output);
	}
}