package programmers.level1;

public class 나머지가1이되는수찾기 {
    public int solution(int n) {
        int answer = 1;
        while (true) {
            answer++;
            if (n % answer == 1) {
                return answer;
            }
        }
    }
}
