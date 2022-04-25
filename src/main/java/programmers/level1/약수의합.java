package programmers.level1;

import java.util.ArrayList;
import java.util.List;

public class 약수의합 {
    public int solution(int n) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                list.add(i);
            }
        }

        int answer = 0;
        for (int v : list) {
            answer += v;
        }
        return answer;
    }
}
