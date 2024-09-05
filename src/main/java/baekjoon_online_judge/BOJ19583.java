package baekjoon_online_judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class BOJ19583 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Set<String> startSet = new HashSet<>();
        Set<String> endSet = new HashSet<>();

        int S = Integer.parseInt(st.nextToken().replace(":", ""));
        int E = Integer.parseInt(st.nextToken().replace(":", ""));
        int Q = Integer.parseInt(st.nextToken().replace(":", ""));
        int answer = 0;
        String massage;

        while ((massage = br.readLine()) != null) {
            st = new StringTokenizer(massage);
            int time = Integer.parseInt(st.nextToken().replace(":", ""));
            String name = st.nextToken();

            if (time <= S) {
                startSet.add(name);
            }
            if (E <= time && time <= Q) {
                endSet.add(name);
            }
        }

        for (String name : startSet) {
            if (endSet.contains(name)) {
                answer++;
            }
        }
        System.out.println(answer);
    }
}
