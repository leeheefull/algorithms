package programmers.level1;

public class 비밀지도 {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        final String format = "%" + n + "s";
        final String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            String tmp = Integer.toBinaryString(arr1[i] | arr2[i]);
            answer[i] = String.format(format, tmp);

            answer[i] = answer[i].replaceAll("[1]", "#");
            answer[i] = answer[i].replaceAll("[0]", " ");
        }
        return answer;
    }
}
