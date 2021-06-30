package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class BOJ14502 { // bruteforce
    public static class Location {
        private final int x;
        private final int y;

        public Location(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    private static final List<Location> virusList = new ArrayList<>();
    private static final int[] dx = {1, -1, 0, 0};  // up, down
    private static final int[] dy = {0, 0, 1, -1};  // left, right

    private static int n, m;
    private static int[][] map, copyMap;
    private static int result = 0;

    public static void main(String[] args) throws Exception {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        map = new int[n][m];
        copyMap = new int[n][m];

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
                if (map[i][j] == 2) {
                    virusList.add(new Location(i, j));
                }
            }
        }
        setWall(0, 0);
        System.out.println(result);
    }

    private static void setWall(int start, int depth) {
        if (depth == 3) {
            copyMap();

            for (Location location : virusList) {
                spreadVirus(location.x, location.y);
            }
            result = Math.max(result, countSafeZone());
            return;
        }
        for (int i = start; i < n * m; i++) {
            int x = i / m;  // row
            int y = i % m;  // column

            if (map[x][y] == 0) {
                map[x][y] = 1;
                setWall(i + 1, depth + 1);
                map[x][y] = 0;
            }
        }
    }

    private static void copyMap() {
        for (int i = 0; i < n; i++) {
            if (m >= 0) System.arraycopy(map[i], 0, copyMap[i], 0, m);
        }
    }

    private static void spreadVirus(int x, int y) {
        for (int i = 0; i < 4; i++) {
            int nx = x + dx[i];
            int ny = y + dy[i];

            if (0 <= nx && nx < n && 0 <= ny && ny < m) {
                if (copyMap[nx][ny] == 0) {
                    copyMap[nx][ny] = 2;
                    spreadVirus(nx, ny);
                }
            }
        }
    }

    private static int countSafeZone() {
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (copyMap[i][j] == 0) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}