package programmers.level1;

public class 체육복 {
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n;
        int[] check = new int[n + 1];
        for (int l : lost) {
            check[l]--;
        }
        for (int r : reserve) {
            check[r]++;
        }
        for (int i = 0; i < check.length; i++) {
            if (check[i] == -1) {
                if (i - 1 >= 0 && check[i - 1] == 1) {
                    check[i]++;
                    check[i - 1]--;
                } else if (i + 1 < check.length && check[i + 1] == 1) {
                    check[i]++;
                    check[i + 1]--;
                } else {
                    answer--;
                }
            }
        }
        return answer;
    }
}
