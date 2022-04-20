package programmers.level1;

public class Level1소수찾기 {
    public int solution(int n) {
        int answer = 0;
        boolean[] check = new boolean[n + 1];

        for (int i = 2; i < check.length; i++) {
            if (check[i]) {
                continue;
            }
            for (int j = 2 * i; j < check.length; j += i) {
                check[j] = true;
            }
        }

        for (int i = 2; i < check.length; i++) {
            if (!check[i]) {
                answer++;
            }
        }
        return answer;
    }
}
