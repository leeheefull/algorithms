package thisIsCodingTest.chapter03;

import java.util.Arrays;

public class Question3 {    // 숫자 카드 게임
    public int solve(int n, int m, int[][] cards) {
        int answer = 0;
        for (int i = 0; i < n; i++) {
            Arrays.sort(cards[i]);
            answer = Math.max(answer, cards[i][0]);
        }
        return answer;
    }
}
