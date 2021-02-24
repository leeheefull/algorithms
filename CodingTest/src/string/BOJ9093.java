package string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class BOJ9093 {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int n = Integer.parseInt(br.readLine());

		while (n-- > 0) {
			StringTokenizer word = new StringTokenizer(br.readLine(), " ");
			while (word.hasMoreTokens()) {
				char[] filp = word.nextToken().toCharArray();
				for (int i = filp.length - 1; 0 <= i; i--) {
					bw.write(filp[i]);
				}
				bw.write(' ');
			}
			bw.write('\n');
		}
		bw.flush();
	}
}