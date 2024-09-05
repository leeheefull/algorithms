package this_is_coding_test.chapter11;

public class Question3 {    // 문자열 뒤집기
    public int solve(String input) {
        char[] c = input.toCharArray();
        int zero = 0;
        int one = 0;

        if (c[0] == '0') {
            zero++;
        } else {
            one++;
        }

        for (int i = 1; i < c.length; i++) {
            if (c[i - 1] == '0' && c[i] == '1') {
                one++;
            } else if (c[i - 1] == '1' && c[i] == '0') {
                zero++;
            }
        }
        return Math.min(zero, one);
    }
}