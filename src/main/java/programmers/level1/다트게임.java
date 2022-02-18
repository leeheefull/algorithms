package programmers.level1;

public class 다트게임 {
    public int solution(String dartResult) {
        int[] score = new int[3];
        String tmp = "";
        int idx = 0;

        for (char c : dartResult.toCharArray()) {
            switch (c) {
                case '*':
                    score[idx - 1] *= 2;
                    if (idx > 1) score[idx - 2] *= 2;
                    break;
                case '#':
                    score[idx - 1] *= -1;
                    break;
                case 'S':
                    score[idx] = (int) Math.pow(Integer.parseInt(tmp), 1);
                    idx++;
                    tmp = "";
                    break;
                case 'D':
                    score[idx] = (int) Math.pow(Integer.parseInt(tmp), 2);
                    idx++;
                    tmp = "";
                    break;
                case 'T':
                    score[idx] = (int) Math.pow(Integer.parseInt(tmp), 3);
                    idx++;
                    tmp = "";
                    break;
                default:
                    tmp += String.valueOf(c);
            }
        }

        int answer = 0;
        for (int n : score) {
            answer += n;
        }
        return answer;
    }
}
