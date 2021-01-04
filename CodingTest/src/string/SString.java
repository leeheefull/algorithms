/* baekjoon9086
 * 문자열을 입력으로 주면 문자열의 첫 글자와 마지막 글자를 출력하는 프로그램을 작성하시오.
 * 
 * input
 * 입력의 첫 줄에는 테스트 케이스의 개수 T(1 ≤ T ≤ 10)가 주어진다. 
 * 각 테스트 케이스는 한 줄에 하나의 문자열이 주어진다. 
 * 문자열은 알파벳 A~Z 대문자로 이루어지며 알파벳 사이에 공백은 없으며 문자열의 길이는 1000보다 작다.
 * 
 * output
 * 각 테스트 케이스에 대해서 주어진 문자열의 첫 글자와 마지막 글자를 연속하여 출력한다.
 * 
 * example
 * 3
 * ACDKJFOWIEGHE
 * O
 * AB
 * -> 
 * AE
 * OO
 * AB
 */

package string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class SString {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int t = Integer.parseInt(br.readLine());

		while (t-- > 0) {
			char[] word = br.readLine().toCharArray();
			bw.write(word[0]);
			bw.write(word[word.length-1]);
			bw.write('\n');
		}
		bw.flush();
	}
}
