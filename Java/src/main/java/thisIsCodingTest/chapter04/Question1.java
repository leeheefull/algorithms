package thisIsCodingTest.chapter04;

public class Question1 {    // 상하좌우
    public int[] solve(int n, char[] moves) {
        final char[] moveTypes = {'L', 'R', 'U', 'D'};
        final int[] dx = {0, 0, -1, 1};
        final int[] dy = {-1, 1, 0, 0};

        int[] answer = {1, 1};
        for (char move : moves) {
            int nx = -1;
            int ny = -1;
            for (int j = 0; j < 4; j++) {
                if (move == moveTypes[j]) {
                    nx = answer[0] + dx[j];
                    ny = answer[1] + dy[j];
                }
            }

            if (nx < 1 || ny < 1 || nx > n || ny > n) {
                continue;
            }
            answer[0] = nx;
            answer[1] = ny;
        }
        return answer;
    }
}