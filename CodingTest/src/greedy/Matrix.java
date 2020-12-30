/* baekjoon 1080
 * 
 * problem
 * 0과 1로만 이루어진 행렬 A와 행렬 B가 있다. 이때, 행렬 A를 행렬 B로 바꾸는데 필요한 연산의 횟수의 최솟값을 구하는 프로그램을 작성하시오.
 * 행렬을 변환하는 연산은 어떤 3*3크기의 부분 행렬에 있는 모든 원소를 뒤집는 것이다. (0 -> 1, 1 -> 0)
 * 
 * input
 * 첫째 줄에 행렬의 크기 N M이 주어진다. N과 M은 50보다 작거나 같은 자연수이다.
 * 둘째 줄부터 N개의 줄에는 행렬 A가 주어지고, 그 다음줄부터 N개의 줄에는 행렬 B가 주어진다.
 * 
 * output
 * 첫째 줄에 문제의 정답을 출력한다. 만약 A를 B로 바꿀 수 없다면 -1을 출력한다.
 */

package greedy;

import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int M = scanner.nextInt();
		char[][] matrix = new char[N][M];
		boolean[][] key = new boolean[N][M]; // init: false
		int cnt = 0;

		for (int i = 0; i < N; i++) {
			matrix[i] = scanner.next().toCharArray();
		}

		for (int i = 0; i < N; i++) {
			char[] tmp = scanner.next().toCharArray();
			for (int j = 0; j < M; j++) {
				if (matrix[i][j] != tmp[j]) {
					key[i][j] = true;
					cnt++;
				}
			}
		}
		if (cnt == 0) {
			System.out.print(0);
		} else {
			System.out.print(checker(key));
		}
	}

	private static int checker(boolean[][] key) {
		int N = key.length;
		int M = key[0].length;
		if (N < 3 || M < 3) {
			return -1;
		}
		int cnt = 0;

		for (int i = 0; i <= N - 3; i++) {
			for (int j = 0; j <= M - 3; j++) {
				if (i == N - 3 && !(key[i][j] == key[i + 1][j] && key[i][j] == key[i + 2][j])) {
					return -1;
				}
				if (j == M - 3 && !(key[i][j] == key[i][j + 1] && key[i][j] == key[i][j + 2])) {
					return -1;
				}
				if (key[i][j]) {
					cnt += reverse(key, i, j);
				}
			}
		}
		for (int i = N - 2; i < N; i++) {
			for (int j = M - 2; j < M; j++) {
				if (key[N - 3][M - 3] != key[i][j]) {
					return -1;
				}
			}
		}
		return cnt;
	}

	private static int reverse(boolean[][] key, int x, int y) {
		for (int i = x; i < x + 3; i++) {
			for (int j = y; j < y + 3; j++) {
				key[i][j] = !key[i][j];
			}
		}
		return 1;
	}
}

/*
 * example
 * 3 4
 * 0000
 * 0010
 * 0000
 * 1001
 * 1011
 * 1001
 * -> 2
 */