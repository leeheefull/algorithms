package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class BOJ2110 {  // 공유기 설치
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int[] home = new int[n];

        for (int i = 0; i < n; i++) {
            home[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(home);

        int answer = 0;
        int left = 1;
        int right = home[n - 1] - home[0];

        while (left <= right) {
            int mid = (left + right) / 2;
            int prevHome = home[0];
            int cnt = 1;
            for (int i = 0; i < n; i++) {
                int distance = home[i] - prevHome;
                if (distance >= mid) {
                    cnt++;
                    prevHome = home[i];
                }
            }
            if (cnt >= c) {
                left = mid + 1;
                answer = mid;
            } else {
                right = mid - 1;
            }
        }
        System.out.println(answer);
    }
}
