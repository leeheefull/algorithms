package baekjoon_online_judge;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ1744 {	// greedy
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int[] numbers = new int[N];
		int start = 0;
		int end = N - 1;
		int result = 0;

		for (int i = 0; i < N; i++) {
			numbers[i] = scanner.nextInt();
		}
		Arrays.sort(numbers);

		for (; start < end; start += 2) {
			if (numbers[start] < 1 && numbers[start + 1] < 1) {
				result += numbers[start] * numbers[start + 1];
			} else {
				break;
			}
		}
		for (; 0 < end; end -= 2) {
			if (1 < numbers[end] && 1 < numbers[end - 1]) {
				result += numbers[end] * numbers[end - 1];
			} else {
				break;
			}
		}
		for (; start <= end; start++) {
			result += numbers[start];
		}
		System.out.println(result);
	}
}