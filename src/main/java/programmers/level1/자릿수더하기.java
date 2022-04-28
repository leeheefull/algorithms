package programmers.level1;

public class 자릿수더하기 {
    public int solution(int n) {
        String nStr = n + "";
        int answer = 0;

        for (int i = 0; i < nStr.length(); i++) {
            answer += nStr.charAt(i) - '0';
        }
        return answer;
    }
}
