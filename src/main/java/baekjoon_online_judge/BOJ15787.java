package baekjoon_online_judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class BOJ15787 {     // 기차가 어둠을 헤치고 은하수를
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[] trains = new int[n + 1];

        for (int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            int cmd = Integer.parseInt(st.nextToken());
            int trainNo = Integer.parseInt(st.nextToken());
            int seat;

            switch (cmd) {
                case 1:
                    seat = Integer.parseInt(st.nextToken());
                    trains[trainNo] = (trains[trainNo] | (1 << seat));
                    break;
                case 2:
                    seat = Integer.parseInt(st.nextToken());
                    trains[trainNo] = trains[trainNo] & ~(1 << seat);
                    break;
                case 3:
                    trains[trainNo] = trains[trainNo] << 1;
                    trains[trainNo] = trains[trainNo] & ((1 << 21) - 1);
                    break;
                case 4:
                    trains[trainNo] = trains[trainNo] >> 1;
                    trains[trainNo] = trains[trainNo] & ~1;
                    break;
            }
        }

        Set<Integer> answer = new HashSet<>();
        for (int i = 1; i < trains.length; i++) {
            answer.add(trains[i]);
        }
        System.out.println(answer.size());
    }
}
