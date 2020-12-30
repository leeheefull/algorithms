/* baekjoon 1157
 * 알파벳 대소문자로 된 단어가 주어지면,
 * 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
 * 단, 대문자와 소문자를 구분하지 않는다.
 * 
 * input
 * 첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.
 * 
 * output
 * 첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다.
 * 단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
 * 
 * example
 * Mississipi
 * -> ?
 * zZa
 * -> Z
 * z
 * -> Z
 * baaa
 * -> A
 */

package string;

import java.util.Scanner;

public class WordStudy {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String word = scan.next();
		int[] alpa = new int[26];
		int max = -1;
		char result = '?';

		for (int i = 0; i < word.length(); i++) {
			if ('A' <= word.charAt(i) && word.charAt(i) <= 'Z') {
				alpa[word.charAt(i) - 'A']++;
			} else {
				alpa[word.charAt(i) - 'a']++;
			}
		}
		for (int i = 0; i < alpa.length; i++) {
			if (max < alpa[i]) {
				max = alpa[i];
				result = (char) (i + 65);
			} else if (alpa[i] == max) {
				result = '?';
			}
		}
		System.out.print(result);
	}
}