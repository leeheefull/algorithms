package programmers.level1;

public class 이상한문자만들기 {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        char[] ch = s.toCharArray();
        int index = 0;

        for (char c : ch) {
            if (c == ' ') {
                answer.append(' ');
                index = 0;
                continue;
            }
            if (index % 2 == 0) {
                answer.append(Character.toUpperCase(c));
            } else {
                answer.append(Character.toLowerCase(c));
            }
            index++;
        }
        return answer.toString();
    }
}
