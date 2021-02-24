package string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class BOJ1259 {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		while (true) {
			String n = br.readLine();
			if (n.equals("0")) {
				break;
			}
			if (check(n)) {
				bw.write("yes\n");
			} else {
				bw.write("no\n");
			}
		}
		bw.flush();
	}

	private static boolean check(String n) {
		char[] tmp = n.toCharArray();
		int head = 0;
		int tail = tmp.length - 1;

		while (head < tail) {
			if (tmp[head] != tmp[tail]) {
				return false;
			}
			head++;
			tail--;
		}
		return true;
	}
}