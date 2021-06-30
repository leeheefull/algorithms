package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1100 {// string

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int result = 0;

		for (int i = 0; i < 8; i++) {
			String tmp = br.readLine();
			for (int j = 0; j < 8; j++) {
				if ((i + j) % 2 == 0 && tmp.charAt(j) == 'F') {
					result++;
				}
			}
		}
		System.out.print(result);
	}
}