package programmers.level1;

public class 가운데글자가져오기 {
    public String solution(String s) {
        int length = s.length();
        int mid = length / 2;

        if (length % 2 == 0) {
            return s.substring(mid - 1, mid + 1);
        }
        return s.substring(mid, mid + 1);
    }
}
