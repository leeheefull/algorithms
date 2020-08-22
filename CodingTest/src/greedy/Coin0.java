/* problem baekjoon(11047)
 * 준규가 가지고 있는 동전은 총 N종류이고, 각각의 동전을 매우 많이 가지고 있다.
 * 동전을 적절히 사용해서 그 가치의 합을 K로 만들려고 한다.
 * 이때 필요한 동전 개수의 최솟값을 구하는 프로그램을 작성하시오.
 * input
 * 첫째 줄에 N과 K가 주어진다. (1 ≤ N ≤ 10, 1 ≤ K ≤ 100,000,000)
 * 둘째 줄부터 N개의 줄에 동전의 가치 Ai가 오름차순으로 주어진다.
 * (1 ≤ Ai ≤ 1,000,000, A1 = 1, i ≥ 2인 경우에 Ai는 Ai-1의 배수)
 * output
 * 첫째 줄에 K원을 만드는데 필요한 동전 개수의 최솟값을 출력한다.
 */

package greedy;

import java.util.Scanner;

public class Coin0 {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		
		int N = scanner.nextInt();		// number of coins
		int K = scanner.nextInt();		// sum
		int[] A = new int[N];			// value of coin
		for(int i=0; i<N; i++)
			A[i] = scanner.nextInt();
		int result = 0;
		
		for(int i=N-1; -1<i; i--)
			if(A[i]<=K) {
				result += K/A[i];
				K = K%A[i];
			}
		
		System.out.print(result);
		scanner.close();
	}
}

// example
/**********
 * 10 4200
 * 1
 * 5
 * 10
 * 50
 * 100
 * 500
 * 1000
 * 5000
 * 10000
 * 50000
 * -> 6
 **********/