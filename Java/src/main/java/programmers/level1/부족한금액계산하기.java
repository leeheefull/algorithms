package programmers.level1;

public class 부족한금액계산하기 {
    public long solution(int price, int money, int count) {
        long answer = price * ((long) count * (count + 1) / 2) - money;
        return Math.max(answer, 0);
    }
}
