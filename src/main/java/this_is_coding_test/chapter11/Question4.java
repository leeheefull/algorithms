package this_is_coding_test.chapter11;

import java.util.Collections;
import java.util.List;

public class Question4 {    // 만들 수 없는 금액
    public int solve(List<Integer> coins) {
        Collections.sort(coins);
        int cnt = 1;
        for (int coin : coins) {
            if (cnt < coin) {
                break;
            }
            cnt += coin;
        }
        return cnt;
    }
}
