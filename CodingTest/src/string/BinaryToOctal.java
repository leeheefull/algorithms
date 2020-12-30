/* baekjoon1373
 * 2진수가 주어졌을 때, 8진수로 변환하는 프로그램을 작성하시오.
 * 
 * input
 * 첫째 줄에 2진수가 주어진다. 주어지는 수의 길이는 1,000,000을 넘지 않는다.
 * 
 * output
 * 첫째 줄에 주어진 수를 8진수로 변환하여 출력한다.
 * 
 * example
 * 11001100
 * -> 314
 */

package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinaryToOctal {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder binary = new StringBuilder(br.readLine());
		StringBuilder result = new StringBuilder();

		if (binary.length() % 3 == 2) {
			binary.insert(0, "0");
		} else if (binary.length() % 3 == 1) {
			binary.insert(0, "00");
		}

		for (int i = 0; i < binary.length(); i += 3) {
			int sum = 0;
			sum += ((int) (binary.charAt(i) - 48)) * 4;
			sum += ((int) (binary.charAt(i + 1) - 48)) * 2;
			sum += ((int) (binary.charAt(i + 2) - 48)) * 1;
			result.append(sum);
		}
		System.out.print(result);
	}
}