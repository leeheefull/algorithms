/* baekjoon1764
 * 김진영이 듣도 못한 사람의 명단과, 보도 못한 사람의 명단이 주어질 때, 듣도 보도 못한 사람의 명단을 구하는 프로그램을 작성하시오.
 * 
 * input
 * 첫째 줄에 듣도 못한 사람의 수 N, 보도 못한 사람의 수 M이 주어진다.
 * 이어서 둘째 줄부터 N개의 줄에 걸쳐 듣도 못한 사람의 이름과, N+2째 줄부터 보도 못한 사람의 이름이 순서대로 주어진다.
 * 이름은 띄어쓰기 없이 영어 소문자로만 이루어지며, 그 길이는 20 이하이다. N, M은 500,000 이하의 자연수이다.
 * 
 * output
 * 듣보잡의 수와 그 명단을 사전순으로 출력한다.
 * 
 * example
 * 3 4
 * ohhenrie
 * charlie
 * baesangwook
 * obama
 * baesangwook
 * ohhenrie
 * clinton
 * -> 
 * 2
 * baesangwook
 * ohhenrie
 */

package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.StringTokenizer;

public class CannotHearSee {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		HashSet<String> hear = new HashSet<String>();
		ArrayList<String> result = new ArrayList<String>();

		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		for (int i = 0; i < n; i++) {
			hear.add(br.readLine());
		}
		for (int i = 0; i < m; i++) {
			String see = br.readLine();
			if (hear.contains(see)) {
				result.add(see);
			}
		}
		Collections.sort(result);
		System.out.println(result.size());
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}
	}
}