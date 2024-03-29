package programmers.level1;

import java.util.Arrays;

public class 문자열내림차순으로배치하기 {
    public String solution(String s) {
        char[] chars = s.toCharArray();
        Arrays.sort(chars);

        StringBuilder answer = new StringBuilder();
        for (char c : chars) {
            answer.insert(0, c);
        }
        return answer.toString();
    }
}
