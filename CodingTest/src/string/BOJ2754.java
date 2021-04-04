/*
학점계산
시간 제한	메모리 제한	제출	    정답	    맞은 사람	정답 비율
1 초	    128 MB	    4814	2965	2763    	63.958%
문제
어떤 사람의 C언어 성적이 주어졌을 때, 평점은 몇 점인지 출력하는 프로그램을 작성하시오.

A+: 4.3, A0: 4.0, A-: 3.7

B+: 3.3, B0: 3.0, B-: 2.7

C+: 2.3, C0: 2.0, C-: 1.7

D+: 1.3, D0: 1.0, D-: 0.7

F: 0.0

입력
첫째 줄에 C언어 성적이 주어진다. 성적은 문제에서 설명한 13가지 중 하나이다.

출력
첫째 줄에 C언어 평점을 출력한다.

예제 입력 1
A0
예제 출력 1
4.0
 */

package string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BOJ2754 {

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
