package programmers.level1;

public class 시저암호 {
    public String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            int ascii = s.charAt(i);

            if (Character.isLowerCase(ascii)) {
                ascii = (ascii - 'a' + n) % 26 + 'a';
            } else if (Character.isUpperCase(ascii)) {
                ascii = (ascii - 'A' + n) % 26 + 'A';
            }

            answer.append(Character.toString(ascii));
        }
        return answer.toString();
    }
}
