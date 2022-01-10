package algorithmMethod;

public class Dfs {
    /**
     * map의 시작 점을 기준으로 1인 부분이 인접한 모든 곳을 0으로 변경한다.
     */
    public int[][] dfs(int[][] map, int x, int y) {
        // 방문한 곳은 0으로 변경
        map[x][y]--;

        // 방향
        int[] dx = {1, 0, -1, 0};
        int[] dy = {0, 1, 0, -1};

        // 시작 점을 기준으로 0을 탐색
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            // 인접한 1 탐색
            if (0 <= ny && ny < map[0].length &&
                    0 <= nx && nx < map.length &&
                    map[nx][ny] == 1
            ) {
                dfs(map, nx, ny);
            }
        }
        return map;
    }
}
