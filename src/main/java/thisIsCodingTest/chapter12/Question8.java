package thisIsCodingTest.chapter12;

import java.util.Arrays;

public class Question8 {
    public String solve(String input) { // 문자열 재정렬
        String answer = "";
        int sum = 0;

        char[] inputs = input.toCharArray();
        Arrays.sort(inputs);

        for (char c : inputs) {
            if ('0' <= c && c <= '9') {
                sum += c - '0';
            } else {
                answer += c;
            }
        }
        return answer + sum + "";
    }
}
