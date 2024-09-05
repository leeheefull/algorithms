package baekjoon_online_judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ10798 {// string
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[][] read = new char[5][15];

        for (int i = 0; i < read.length; i++) {
            String tmp = br.readLine();
            for (int j = 0; j < tmp.length(); j++) {
                read[i][j] = tmp.charAt(j);
            }
        }
        for (int i = 0; i < read[0].length; i++) {
            for (char[] chars : read) {
                if (chars[i] == '\0') {
                } else {
                    System.out.print(chars[i]);
                }
            }
        }
    }
}