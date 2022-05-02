package programmers.level1;

public class 정수제곱근판별 {
    public long solution(long n) {
        int sqrt = (int) Math.sqrt(n);
        if (Math.pow(sqrt, 2) == n) {
            return (long) Math.pow(sqrt + 1, 2);
        }
        return -1;
    }
}
