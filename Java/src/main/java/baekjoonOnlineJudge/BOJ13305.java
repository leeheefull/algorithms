package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ13305 {	// greedy
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int[] dist = new int[n - 1];
        int[] cost = new int[n];
        long result = 0;

        String[] tmp = br.readLine().split(" ");
        for (int i = 0; i < n - 1; i++) {
            dist[i] = Integer.parseInt(tmp[i]);
        }

        tmp = br.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            cost[i] = Integer.parseInt(tmp[i]);
        }

        int min = cost[0];
        for (int i = 1; i < n; i++) {
            result += (long) min * dist[i-1];
            if(cost[i] < min){
                min = cost[i];
            }
        }
        System.out.print(result);
    }
}
// �� "integer"�� ���ϰ� �ȴٸ� "overflow"�� �߻��� �� �ִٴ� ���� ��������.