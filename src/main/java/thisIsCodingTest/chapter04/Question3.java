package thisIsCodingTest.chapter04;

public class Question3 {    // 왕실의 나이트
    public int solve(String position) {
        final int[] dx = {2, 2, -2, -2, 1, -1, 1, -1};
        final int[] dy = {-1, 1, -1, 1, 2, 2, -2, -2};

        int answer = 0;
        int x = position.charAt(0) - 'a' + 1;
        int y = position.charAt(1) - '0';

        for (int i = 0; i < 8; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (0 < nx && nx <= 8 && 0 < ny && ny <= 8) {
                answer++;
            }
        }
        return answer;
    }
}
