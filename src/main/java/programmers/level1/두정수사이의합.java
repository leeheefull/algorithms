package programmers.level1;

public class 두정수사이의합 {
    public long solution(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);

        return ((long) (max - min + 1) * (max + min)) / 2;
    }
}
