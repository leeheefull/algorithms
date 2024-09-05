package this_is_coding_test.chapter11;

import java.util.*;

public class Question1 {    // 모험가 길드
    public int solve(int n, List<Integer> fears) {
        int answer = 0;
        int cnt = 0;

        Collections.sort(fears);

        for (int v : fears) {
            cnt++;
            if (v <= cnt) {
                cnt = 0;
                answer++;
            }
        }
        return answer;
    }
}