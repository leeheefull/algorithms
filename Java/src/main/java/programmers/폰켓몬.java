package programmers;

import java.util.ArrayList;
import java.util.List;

public class 폰켓몬 {
    public int solution(int[] param) {
        int maxCnt = param.length / 2;
        List<Integer> kinds = new ArrayList<>();
        for (int p : param) {
            if (!kinds.contains(p)) {
                kinds.add(p);
            }
        }
        return Math.min(maxCnt, kinds.size());
    }
}
