package programmers.level1;

import java.util.ArrayList;
import java.util.List;

public class 같은숫자는싫어 {
    public int[] solution(int[] arr) {
        List<Integer> answer = new ArrayList<>();
        int tmp = -1;

        for (int n : arr) {
            if (n != tmp) {
                answer.add(n);
                tmp = n;
            }
        }

        return answer.stream()
                .mapToInt(i -> i)
                .toArray();
    }
}
