package baekjoon_online_judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class BOJ4949 {// string
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> bracket = new Stack<>();

		while (true) {
			bracket.clear();
			String line = br.readLine();
			if (line.equals(".")) {
				break;
			}
			for (int i = 0; i < line.length(); i++) {
				char tmp = line.charAt(i);
				if (tmp == '(' || tmp == '[') {
					bracket.push(tmp);
				} else if (tmp == ')' || tmp == ']') {
					if (bracket.isEmpty() || (bracket.peek() == '(' && tmp == ']')
							|| (bracket.peek() == '[' && tmp == ')')) {
						bracket.push(tmp);
						break;
					}
					bracket.pop();
				}
			}
			if (bracket.isEmpty()) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}
		}
	}
}