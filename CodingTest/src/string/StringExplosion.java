/* baekjoon9935
 * 상근이는 문자열에 폭발 문자열을 심어 놓았다.
 * 폭발 문자열이 폭발하면 그 문자는 문자열에서 사라지며, 남은 문자열은 합쳐지게 된다.
 * 폭발은 다음과 같은 과정으로 진행된다.
 * 문자열이 폭발 문자열을 포함하고 있는 경우에, 모든 폭발 문자열이 폭발하게 된다. 
 * 남은 문자열을 순서대로 이어 붙여 새로운 문자열을 만든다.
 * 새로 생긴 문자열에 폭발 문자열이 포함되어 있을 수도 있다.
 * 폭발은 폭발 문자열이 문자열에 없을 때까지 계속된다.
 * 상근이는 모든 폭발이 끝난 후에 어떤 문자열이 남는지 구해보려고 한다. 
 * 남아있는 문자가 없는 경우가 있다. 
 * 이때는 "FRULA"를 출력한다.
 * 폭발 문자열은 같은 문자를 두 개 이상 포함하지 않는다.
 * 
 * input
 * 첫째 줄에 문자열이 주어진다. 
 * 문자열의 길이는 1보다 크거나 같고, 1,000,000보다 작거나 같다.
 * 둘째 줄에 폭발 문자열이 주어진다. 
 * 길이는 1보다 크거나 같고, 36보다 작거나 같다.
 * 두 문자열은 모두 알파벳 소문자와 대문자, 숫자 0, 1, ..., 9로만 이루어져 있다.
 * 
 * output
 * 첫째 줄에 모든 폭발이 끝난 후 남은 문자열을 출력한다.
 * 
 * example
 * mirkovC4nizCC44
 * C4
 * -> mirkovniz
 * 
 * 12ab112ab2ab
 * 12ab
 * -> FRULA
 */

package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringExplosion {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		char[] str = br.readLine().toCharArray();
		StringBuilder exp = new StringBuilder(br.readLine());
		StringBuilder ans = new StringBuilder();
				
		for (int i = 0; i < str.length; i++) {
            ans.append(str[i]);
            if (exp.length() <= ans.length()){
                int index = ans.length() - exp.length();
                if (ans.substring(index).equals(exp.toString())) {
                    ans.delete(index, index + exp.length());
                }
            }
        }
		
		if(ans.length() == 0)
			System.out.print("FRULA");
		else
			System.out.print(ans.toString());
	}
}