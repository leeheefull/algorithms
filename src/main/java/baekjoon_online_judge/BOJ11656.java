package baekjoon_online_judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class BOJ11656 {// string
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		String[] suffix = new String[word.length()];

		for (int i = 0; i < suffix.length; i++) {
			suffix[i] = word.substring(i);
		}
		Arrays.sort(suffix);
		for (String item : suffix) {
			System.out.println(item);
		}
	}
}