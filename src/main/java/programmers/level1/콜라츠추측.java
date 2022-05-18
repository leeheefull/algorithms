package programmers.level1;

public class 콜라츠추측 {
    public int solution(int num) {
        int cnt = 0;
        while (num != 1) {
            if (cnt == 500) {
                return -1;
            }

            if (num % 2 == 0) {
                num /= 2;
            } else if (num % 2 == 1) {
                num = (3 * num) + 1;
            }

            cnt++;
        }
        return cnt;
    }
}
