package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1159 {// string
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] alphabet = new int[26];
		String result = "";

		for (int i = 0; i < n; i++) {
			alphabet[br.readLine().charAt(0) - 'a']++;
		}
		for (int i = 0; i < alphabet.length; i++) {
			if (5 <= alphabet[i]) {
				result += (char) (i + 'a');
			}
		}
		if (result.equals("")) {
			System.out.print("PREDAJA");
		} else {
			System.out.print(result);
		}
	}
}