package thisIsCodingTest.chapter03;

public class Question1 {    // 거스름 돈
    private static final int[] coinType = {500, 100, 50, 10};

    public int solve(int change) {
        int answer = 0;
        for (int coin : coinType) {
            answer += change / coin;
            change %= coin;
        }
        return answer;
    }
}
