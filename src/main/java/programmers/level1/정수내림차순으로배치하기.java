package programmers.level1;

import java.util.Arrays;

public class 정수내림차순으로배치하기 {
    public long solution(long n) {
        char[] nArr = (n + "").toCharArray();
        Arrays.sort(nArr);

        String answer = "";
        for (char c : nArr) {
            answer = c + answer;
        }
        return Long.parseLong(answer);
    }
}
