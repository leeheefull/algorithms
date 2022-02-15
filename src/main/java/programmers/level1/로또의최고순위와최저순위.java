package programmers.level1;

import java.util.Arrays;

public class 로또의최고순위와최저순위 {
    public int[] solution(int[] lottos, int[] winNums) {
        int zeroCnt = 0;
        int matchCnt = 0;

        Arrays.sort(lottos);
        Arrays.sort(winNums);

        for (int lotto : lottos) {
            if (lotto == 0) {
                zeroCnt++;
            }

            for (int winNum : winNums) {
                if (lotto == winNum) {
                    matchCnt++;
                    break;
                }
            }
        }
        return new int[]{
                getRank(matchCnt + zeroCnt),
                getRank(matchCnt)
        };
    }

    private int getRank(int n) {
        if (2 <= n && n <= 6) {
            return 7 - n;
        }
        return 6;
    }
}
