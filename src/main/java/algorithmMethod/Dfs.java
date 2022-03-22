package algorithmMethod;

public class Dfs {
    private final int[][] map;

    /**
     * 0은 벽이고, 1은 길이다.
     */
    public Dfs(int[][] map) {
        this.map = map;
    }

    /**
     * map의 시작 점을 기준으로 1인 부분이 인접한 모든 곳을 0으로 변경한다.
     *
     * @param x 위치 값으로써 행을 결정
     * @param y 위치 값으로써 열을 결정
     * @return 시작 점으로부터 방문한 공간을 1에서 0으로 바꾼 후 map을 반환
     */
    public int[][] spread(int x, int y) {
        return execute(map, x, y);
    }

    private int[][] execute(int[][] map, int x, int y) {
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
                execute(map, nx, ny);
            }
        }
        return map;
    }
}
