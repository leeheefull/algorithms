package this_is_coding_test.chapter12;

public class Question7 {    // 럭키 스트레이트
    public String solve(int n) {
        String str = n + "";
        int answer = 0;

        for (int i = 0; i < str.length(); i++) {
            if (i < str.length() / 2) {
                answer += str.charAt(i) - '0';
            } else if (str.length() / 2 <= i) {
                answer -= str.charAt(i) - '0';
            }
        }
        return answer == 0 ? "LUCKY" : "READY";
    }
}
