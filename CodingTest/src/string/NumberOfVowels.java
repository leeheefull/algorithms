/* baekjoon10987
 * 알파벳 소문자로만 이루어진 단어가 주어진다. 이때, 모음(a, e, i, o, u)의 개수를 출력하는 프로그램을 작성하시오.
 * 
 * input
 * 첫째 줄에 단어가 주어진다. 단어의 길이는 1보다 크거나 같고, 100보다 작거나 같으며, 알파벳 소문자로만 이루어져 있다.
 * 
 * output
 * 첫째 줄에 모음의 개수를 출력한다.
 * 
 * example
 * baekjoon
 * -> 4
 */

package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class NumberOfVowels {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String word = br.readLine();
		int result = 0;
		
		for(int i=0; i<word.length(); i++)
			if(check(word.charAt(i)))
				result++;
		
		System.out.print(result);
	}
	
	private static boolean check(char c) {
		if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
			return true;
		else
			return false;
	}
}