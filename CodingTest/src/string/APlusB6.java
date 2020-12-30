/* baekjoon 10953
 * 두 정수 A와 B를 입력받은 다음, A+B를 출력하는 프로그램을 작성하시오.
 * 
 * input
 * 첫째 줄에 테스트 케이스의 개수 T가 주어진다.
 * 각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다.
 * A와 B는 콤마(,)로 구분되어 있다. (0 < A, B < 10)
 * 
 * output
 * 각 테스트 케이스마다 A+B를 출력한다.
 * 
 * example
 * 5
 * 1,1
 * 2,3
 * 3,4
 * 9,8
 * 5,2
 * ->
 * 2
 * 5
 * 7
 * 17
 * 7
 */

package string;

import java.util.Scanner;

public class APlusB6 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] result = new int[n];

		for (int i = 0; i < n; i++) {
			String tmp = scan.next();
			result[i] = tmp.charAt(0) + tmp.charAt(2) - 96;
		}
		for (int i = 0; i < n; i++) {
			System.out.println(result[i]);
		}
	}
}