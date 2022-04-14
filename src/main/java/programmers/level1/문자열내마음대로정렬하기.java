package programmers.level1;

import java.util.Arrays;

public class 문자열내마음대로정렬하기 {
    public String[] solution(String[] strings, int n) {
        Arrays.sort(strings, (o1, o2) -> {
            int result = o1.charAt(n) - o2.charAt(n);
            if (result == 0) {
                return o1.compareTo(o2);
            }
            return result;
        });

        return strings;
    }
}
