package baekjoon_online_judge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2754 {// string
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] grade = br.readLine().toCharArray();
        double result = 0.0;

        switch (grade[0]){
            case 'A':
                result = 4.0;
                break;
            case 'B':
                result = 3.0;
                break;
            case 'C':
                result = 2.0;
                break;
            case 'D':
                result = 1.0;
                break;
            case 'F':
                System.out.println(result);
                return;
        }

        if (grade[1] == '+') {
            result += 0.3;
        } else if (grade[1] == '-') {
            result -= 0.3;
        }
        System.out.print(result);
    }
}
