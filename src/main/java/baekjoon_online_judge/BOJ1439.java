package baekjoon_online_judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1439 {	// greedy
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] str = br.readLine().toCharArray();
		int zero = 0;
		int one = 0;

		if (str[0] == '0') {
			zero++;
		} else {
			one++;
		}

		for (int i = 1; i < str.length; ++i) {
			if (str[i] == '0' && str[i - 1] == '1') {
				zero++;
			} else if (str[i] == '1' && str[i - 1] == '0') {
				one++;
			}
		}
		System.out.println(Math.min(one, zero));
	}
}
