package programmers.level1;

import java.util.HashMap;
import java.util.Map;

public class 실패율 {
    public int[] solution(int n, int[] stages) {
        int[] failure = new int[n];
        for (int stage : stages) {
            if (stage == n + 1) {
                continue;
            }
            failure[stage - 1]++;
        }

        double total = stages.length;
        Map<Integer, Double> failureRates = new HashMap<>();
        for (int i = 0; i < failure.length; i++) {
            if (total == 0) {
                failureRates.put(i, 0d);
                continue;
            }
            failureRates.put(i, failure[i] / total);
            total -= failure[i];
        }

        int[] answer = new int[n];
        for (int i = 0; i < n; i++) {
            double max = -1;
            int maxKey = 0;
            for (int key : failureRates.keySet()) {
                if (max < failureRates.get(key)) {
                    max = failureRates.get(key);
                    maxKey = key;
                }
            }
            answer[i] = maxKey + 1;
            failureRates.remove(maxKey);
        }
        return answer;
    }
}
