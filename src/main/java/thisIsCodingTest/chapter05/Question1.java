package thisIsCodingTest.chapter05;

public class Question1 {    // 음료수 얼려 먹기
    public int solve(int n, int m, int[][] map) {
        int cnt = 0;

        // 0을 찾고 dfs를 돌려서 인접한 0을 전부 1로 만듦
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (map[i][j] == 0) {
                    dfs(map, i, j);
                    cnt++;
                }
            }
        }
        return cnt;
    }

    private void dfs(int[][] map, int y, int x) {
        // 방문한 곳은 1로 변경
        map[y][x]++;

        // 방향
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        // 시작 점을 기준으로 0을 탐색
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            // 인접한 0 탐색
            if (0 <= nx && nx < map[0].length &&
                    0 <= ny && ny < map.length &&
                    map[ny][nx] == 0
            ) {
                dfs(map, ny, nx);
            }
        }
    }
}
