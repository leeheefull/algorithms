package programmers.level1;

public class 문자열내p와y의개수 {
    boolean solution(String s) {
        return s.replaceAll("[^yY]", "").length() - s.replaceAll("[^pP]", "").length() == 0;
    }
}
