package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1120 {// string
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] str = br.readLine().split(" ");
		int min = Integer.MAX_VALUE;

		for (int i = 0; i <= str[1].length() - str[0].length(); i++) {
			int cnt = 0;
			for (int j = 0; j < str[0].length(); j++) {
				if (str[0].charAt(j) != str[1].charAt(i + j)) {
					cnt++;
				}
			}
			min = Math.min(cnt, min);
		}
		System.out.println(min);
	}
}