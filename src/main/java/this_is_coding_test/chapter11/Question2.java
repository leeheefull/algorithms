package this_is_coding_test.chapter11;

public class Question2 {    // 곱하기 혹은 더하기
    public int solve(String input) {
        int answer = 0;
        for (char c : input.toCharArray()) {
            int tmp = c - '0';
            answer = Math.max(answer * tmp, answer + tmp);
        }
        return answer;
    }
}
