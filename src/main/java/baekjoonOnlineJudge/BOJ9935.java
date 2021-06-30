package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9935 {// string
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] str = br.readLine().toCharArray();
		StringBuilder exp = new StringBuilder(br.readLine());
		StringBuilder ans = new StringBuilder();

		for (int i = 0; i < str.length; i++) {
			ans.append(str[i]);
			if (exp.length() <= ans.length()) {
				int index = ans.length() - exp.length();
				if (ans.substring(index).equals(exp.toString())) {
					ans.delete(index, index + exp.length());
				}
			}
		}
		if (ans.length() == 0) {
			System.out.print("FRULA");
		} else {
			System.out.print(ans.toString());
		}
	}
}