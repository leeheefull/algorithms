/* problem: (baekjoon 1541)
 * 세준이는 양수와 +, -, 그리고 괄호를 가지고 길이가 최대 50인 식을 만들었다.
 * 그리고 나서 세준이는 괄호를 모두 지웠다.
 * 그리고 나서 세준이는 괄호를 적절히 쳐서 이 식의 값을 최소로 만들려고 한다.
 * 괄호를 적절히 쳐서 이 식의 값을 최소로 만드는 프로그램을 작성하시오.
 * input
 * 첫째 줄에 식이 주어진다. 식은 '0'~'9', '+', 그리고 '-'만으로 이루어져 있고, 가장 처음과 마지막 문자는 숫자이다.
 * 그리고 연속해서 두 개 이상의 연산자가 나타나지 않고, 5자리보다 많이 연속되는 숫자는 없다.
 * 수는 0으로 시작할 수 있다.
 * output
 * 첫째 줄에 정답을 출력한다.
 */

package greedy;

import java.util.Scanner;

public class LostParenthesis {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String data = scanner.nextLine();
		String[] splitMinus = data.split("\\-");	// split minus
		
		int result = plus(splitMinus[0]);
		for(int i=1; i<splitMinus.length; i++)
			result -= plus(splitMinus[i]);
		
		System.out.print(result);
		scanner.close();
	}

	private static int plus(String splitMinus) {
		
		String[] num = splitMinus.split("\\+");		// split plus
		
		int result = 0;
		for(String item: num)
			result += Integer.parseInt(item);
		
		return result;
	}
}

// example
/***********
 * 55-50+40
 * -> -35
 ***********/