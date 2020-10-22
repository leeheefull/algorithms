/* baekjoon 11720
 * N개의 숫자가 공백 없이 쓰여있다. 이 숫자를 모두 합해서 출력하는 프로그램을 작성하시오.
 * 
 * input
 * 첫째 줄에 숫자의 개수 N (1 ≤ N ≤ 100)이 주어진다. 둘째 줄에 숫자 N개가 공백없이 주어진다.
 * 
 * output
 * 입력으로 주어진 숫자 N개의 합을 출력한다.
 * 
 * example
 * 1
 * 1
 * -> 1
 * 5
 * 54321
 * -> 15
 * 25
 * 7000000000000000000000000
 * -> 7
 * 11
 * 10987654321
 * -> 46
 */
package string;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
	
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();
		String number = scanner.next();
		int result = 0;
		
		for(int i=0; i<n; i++)
			result += number.charAt(i)-'0';
		System.out.print(result);
	}
}