package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1652 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		char[][] place = new char[n][n];
		int h = 0, v = 0;

		for (int i = 0; i < n; i++) {
			place[i] = br.readLine().toCharArray();
		}
		for (int i = 0; i < n; i++) {
			int hCnt = 0, vCnt = 0;
			for (int j = 0; j < n; j++) {
				if (place[i][j] == 'X') {
					if (2 <= hCnt) {
						h++;
					}
					hCnt = 0;
				} else {
					hCnt++;
				}
				if (place[j][i] == 'X') {
					if (2 <= vCnt) {
						v++;
					}
					vCnt = 0;
				} else {
					vCnt++;
				}
			}
			if (2 <= hCnt) {
				h++;
			}
			if (2 <= vCnt) {
				v++;
			}
		}
		System.out.print(h + " " + v);
	}
}