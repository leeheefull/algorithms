package this_is_coding_test.chapter04;

public class Question4 {    // 게임 개발
    public int solve(int n, int m, int x, int y, int news, int[][] map) {
        // 방향
        final int dx[] = {-1, 0, 1, 0};
        final int dy[] = {0, 1, 0, -1};

        // map 가본 곳이라면 true
        boolean[][] check = new boolean[n][m];

        // 회전 수
        int turnTime = 0;

        // 초기 값
        int answer = 1;
        check[x][y] = true;

        // 시작
        while (true) {
            // 회전
            news -= 1;
            if (news == -1) {
                news = 3;
            }

            // 다음 좌표 생성
            int nx = x + dx[news];
            int ny = y + dy[news];

            // 가본 적이 없으면서 육지인 곳으로 가고 while 처음으로, 아니면 회전
            if (!check[nx][ny] && map[nx][ny] == 0) {
                check[nx][ny] = true;
                x = nx;
                y = ny;
                answer++;
                turnTime = 0;
                continue;
            } else {
                turnTime++;
            }

            // 어느 곳도 갈 수 없다면
            if (turnTime == 4) {
                nx = x - dx[news];
                ny = y - dy[news];
                // 뒤로 갈 수 있다면 가고, 아니면 끝
                if (map[nx][ny] == 0) {
                    x = nx;
                    y = ny;
                } else {
                    break;
                }
                turnTime = 0;
            }
        }
        return answer;
    }
}
