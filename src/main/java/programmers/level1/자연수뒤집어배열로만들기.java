package programmers.level1;

public class 자연수뒤집어배열로만들기 {
    public int[] solution(long n) {
        String nStr = n + "";
        int[] answer = new int[nStr.length()];

        for (int i = 0; i < answer.length; i++) {
            answer[i] = nStr.charAt(answer.length - i - 1) - '0';
        }
        return answer;
    }
}
