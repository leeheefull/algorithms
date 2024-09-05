package baekjoon_online_judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ9663 { // bruteforce
    private static int n;
    private static int[] chess;
    private static int cnt = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        chess = new int[n];

        nQueen(0);
        System.out.print(cnt);
    }

    private static void nQueen(int row) {
        // 체스판이 완성되면 cnt 증가
        if (row == n) {
            cnt++;
            return;
        }

        for (int i = 0; i < n; i++) {
            chess[row] = i;

            // (row, i) 위치에 놓을 수 있다면, 다음 row 증가하여 재귀
            if (check(row)) {
                nQueen(row + 1);
            }
        }
    }

    private static boolean check(int row) {
        for (int i = 0; i < row; i++) {

            // 같은 열에 퀸이 존재한다면, 퀸을 놓을 수 없음
            if (chess[row] == chess[i]) {
                return false;
            }

            // 퀸이 서로 대각선에 존재한다면, 퀸을 놓을 수 없음
            else if (Math.abs(row - i) == Math.abs(chess[row] - chess[i])) {
                return false;
            }
        }
        return true;
    }
}