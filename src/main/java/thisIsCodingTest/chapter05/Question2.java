package thisIsCodingTest.chapter05;

import java.util.LinkedList;
import java.util.Queue;

public class Question2 {
    public int solve(int n, int m, int[][] map) {   // 미로 탈출
        // bfs 큐
        Queue<Node> queue = new LinkedList<>();

        // 출발 상태 (1, 1)
        queue.offer(new Node(0, 0));

        // bfs
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

                // 해당 방향으로 이동해도 되는지
                if (0 <= nx && nx < m &&
                        0 <= ny && ny < n &&
                        map[ny][nx] == 1
                ) {
                    // 위치 값 큐에 저장
                    queue.offer(new Node(nx, ny));

                    // 이동했으니 연산
                    map[ny][nx] = map[y][x] + 1;
                }
            }
        }
        return map[n - 1][m - 1];
    }
}
