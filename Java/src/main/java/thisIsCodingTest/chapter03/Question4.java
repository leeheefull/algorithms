package thisIsCodingTest.chapter03;

public class Question4 {    // 1이 될 때까지
    public int solve(int n, int k) {
        int answer = 0;
        while (n != 1) {
            if (n % k == 0) {
                n /= k;
            } else {
                n -= 1;
            }
            answer++;
        }
        return answer;
    }
}
