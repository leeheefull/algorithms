package thisIsCodingTest.chapter12;

public class Question9 {    // 문자열 압축
    public int solve(String s) {
        int answer = s.length();
        for (int step = 1; step < s.length() / 2 + 1; step++) {
            // step 값을 기준으로 나눴을 때, 압축된 최종 문자열
            String compressedStr = "";
            // s에서 step 값 만큼 자른 문자열
            String compareStr = s.substring(0, step);
            // compareStr가 얼만큼 압축될 수 있는지 개수
            int compareCnt = 1;

            // compareStr과 같은 문자열의 개수를 구하기
            for (int j = step; j < s.length(); j += step) {
                // compareStr과 비교하려고 step 만큼 자른 문자열 생성
                String subStr = "";
                for (int k = j; k < j + step; k++) {
                    if (k < s.length()) {
                        subStr += s.charAt(k);
                    }
                }

                // compareStr과 sumStr 비교하기
                if (compareStr.equals(subStr)) {
                    // 같으면 압축 시키고 증가시키기
                    compareCnt += 1;
                } else {
                    // 다르면 숫자와 문자열을 합쳐서 이어주기
                    if (compareCnt >= 2) {
                        compressedStr += compareCnt + compareStr;
                    } else {
                        compressedStr += compareStr;
                    }

                    // 새로운 compareStr을 지정해 주고, 나머지는 초기화
                    subStr = "";
                    for (int k = j; k < j + step; k++) {
                        if (k < s.length()) {
                            subStr += s.charAt(k);
                        }
                    }
                    compareStr = subStr;
                    compareCnt = 1;
                }
            }

            // compareCnt가 1개면 그대로, 2개 이상이면 숫자와 함께 붙이기
            if (compareCnt >= 2) {
                compressedStr += compareCnt + compareStr;
            } else {
                compressedStr += compareStr;
            }

            // 가장 짧게 압축된 문자열의 길이 구하기
            answer = Math.min(answer, compressedStr.length());
        }
        return answer;
    }
}
