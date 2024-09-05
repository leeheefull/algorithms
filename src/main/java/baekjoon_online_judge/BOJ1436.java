package baekjoon_online_judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ1436 { // bruteforce
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int result = 666;

        while (1 < n) {
            result++;
            if (Integer.toString(result).contains("666")) {
                n--;
            }
        }
        System.out.println(result);
    }
}