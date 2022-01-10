package algorithmMethod;

import java.util.LinkedList;
import java.util.Queue;

public class Bfs {
    /**
     * map에서 원하는 위치를 기준으로 방문했던 곳을 제외하고,
     * bfs 탐색을 실시하여 탐색한 곳의 개수를 구할 수 있다.
     */
    public int bfs(int[][] map, boolean[][] visited, int x, int y) {
        // 방향 (상하좌우)
        int[] dx = {-1, 0, 1, 0};
        int[] dy = {0, -1, 0, 1};

        // 시작
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(x, y));
        visited[x][y] = true;
        int cnt = 1;

        // bfs 로직
        while (!queue.isEmpty()) {
            Node current = queue.poll();
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
     * (0, 0) 부터 map의 마지막 index까지 이동한 횟수를 구할 수 있다.
     */
    public int bfs(int[][] map) {
        Queue<Node> queue = new LinkedList<>();
        queue.offer(new Node(0, 0));

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
        return map[map.length - 1][map[0].length - 1];
    }
}
