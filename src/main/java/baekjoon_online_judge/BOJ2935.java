package baekjoon_online_judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2935 {// string
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String A = br.readLine();
        String operator = br.readLine();
        String B = br.readLine();

        if (A.length() < B.length()) {
            String tmp = A;
            A = B;
            B = tmp;
        }
        if (operator.equals("+")) {
            if (A.length() == B.length()) {
                System.out.print("2" + A.substring(1));
                return;
            }
            System.out.print(A.substring(0, A.length() - B.length()) + B);
        } else if (operator.equals("*")) {
            System.out.print(A + B.substring(1));
        }
        br.close();
    }
}