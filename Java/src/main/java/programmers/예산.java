package programmers;

import java.util.Arrays;

public class 예산 {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int answer = 0;
        for (int value : d) {
            budget -= value;
            if (budget < 0) {
                break;
            }
            answer++;
        }
        return answer;
    }
}
