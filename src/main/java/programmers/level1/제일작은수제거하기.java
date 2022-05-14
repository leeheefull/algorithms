package programmers.level1;

public class 제일작은수제거하기 {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }

        int min = Integer.MAX_VALUE;
        for (int value : arr) {
            min = Math.min(min, value);
        }

        int[] answer = new int[arr.length - 1];
        int index = 0;

        for (int value : arr) {
            if (value == min) {
                continue;
            }
            answer[index++] = value;
        }
        return answer;
    }
}
