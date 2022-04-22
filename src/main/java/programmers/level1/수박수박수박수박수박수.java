package programmers.level1;

public class 수박수박수박수박수박수 {
    public String solution(int n) {
        StringBuilder answer = new StringBuilder();
        answer.append("수박".repeat(n / 2));

        if (n % 2 == 1) {
            answer.append("수");
        }
        return answer.toString();
    }
}