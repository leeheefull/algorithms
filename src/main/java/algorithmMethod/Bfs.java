package algorithmMethod;

import java.util.LinkedList;
import java.util.Queue;

public class Bfs {
    private final int[][] map;

    /**
     * 0은 벽이고, 1은 길
     */
    public Bfs(int[][] map) {
        this.map = map;
    }

    /**
     * map에서 원하는 위치를 기준으로 방문했던 곳을 제외하고,
     * bfs 탐색을 실시하여 탐색한 곳의 개수를 구할 수 있다.
     *
     * @param x 위치 값으로써 행을 결정하는 인자
     * @param y 위치 값으로써 열을 결정하는 인자
     * @return map의 (x, y)를 시작으로 이동할 수 있는 곳의 개수
     */
    public int getMoveCnt(int x, int y) {
        if (map[x][y] == 0) {
            return 0;
        }

        // 방향 (상하좌우)
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, -1, 0, 1};

        // 방문할 곳 저장
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(x, y));

        // 방문한 곳 체크
        boolean[][] visited = new boolean[map.length][map[0].length];
        visited[x][y] = true;
        int cnt = 1;

        // bfs 로직
        while (!queue.isEmpty()) {
            Node current = queue.poll();

            // 상하좌우 체크 후에 방문할 곳은 큐에 저장
            for (int i = 0; i < 4; i++) {
                int nextX = current.getX() + dx[i];
                int nextY = current.getY() + dy[i];

                if (nextX < 0 || nextY < 0 ||
                        map.length <= nextX || map[0].length <= nextY ||
                        visited[nextX][nextY] || map[nextX][nextY] != 1
                ) {
                    continue;
                }

                queue.add(new Node(nextX, nextY));
                visited[nextX][nextY] = true;
                cnt++;
            }
        }
        return cnt;
    }

    /**
     * (0, 0)을 시작으로 map의 마지막 index까지 가장 짧게 이동한 횟수를 구할 수 있다.
     *
     * @param x1 출발 지점의 행
     * @param y1 출발 지접의 열
     * @param x2 도착 지점의 행
     * @param y2 도착 지점의 열
     * @return 출발 지점부터 도착 지점까지의 최소 이동 회수
     */
    public int getMoveCntByShortPath(int x1, int y1, int x2, int y2) {
        if (x1 == x2 && y1 == y2) {
            return 1;
        }

        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(x1, y1));

        // bfs 로직
        while (!queue.isEmpty()) {
            // 상하좌우 방향 이동 매개체
            int[] dx = {1, 0, -1, 0};
            int[] dy = {0, 1, 0, -1};

            // 현재 위치 꺼내기
            Node current = queue.poll();
            int x = current.getX();
            int y = current.getY();

            // 현재 위치로부터 4개 방향 전부 탐색하기
            for (int i = 0; i < 4; i++) {
                int nx = x + dx[i];
                int ny = y + dy[i];

                // map의 범위
                if (nx < 0 || map.length <= nx ||
                        ny < 0 || map[0].length <= ny ||
                        map[nx][ny] != 1
                ) {
                    continue;
                }

                // 위치 값 큐에 저장
                queue.offer(new Node(nx, ny));

                // 이동했으니 연산
                map[nx][ny] = map[x][y] + 1;
            }
        }
        return map[x2][y2];
    }
}
