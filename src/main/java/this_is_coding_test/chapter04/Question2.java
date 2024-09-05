package this_is_coding_test.chapter04;

public class Question2 {    // 시각
    public int solve(int n) {
        int answer = 0;
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < 60; j++) {
                for (int k = 0; k < 60; k++) {
                    if (check(i, j, k)) {
                        answer++;
                    }
                }
            }
        }
        return answer;
    }

    public boolean check(int h, int m, int s) {
        return h % 10 == 3 || m / 10 == 3 || m % 10 == 3 || s / 10 == 3 || s % 10 == 3;
    }
}
