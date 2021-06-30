package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1110 {// string
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());
        br.close();

        int cnt = 0;
        int tmp = input;

        do {
            cnt++;
            tmp = (tmp % 10) * 10 + (tmp / 10 + tmp % 10) % 10;
        } while (input != tmp);

        System.out.print(cnt);
    }
}
