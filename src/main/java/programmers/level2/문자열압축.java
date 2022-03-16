package programmers.level2;

public class 문자열압축 {
    public int solution(String s) {
        // 문자열 압축을 하지않은 길이
        int answer = s.length();

        // 1개 단위로 시작해서 s의 절반 단위까지만 잘라서 하나씩 확인해 보기
        for (int i = 1; i <= s.length() / 2; i++) {
            // i개 단위로 압축된 개수
            int cnt = 1;

            // i개 단위로 자른 문자열
            String word = s.substring(0, i);

            // i개 단위로 압축된 문자열의 결과물
            String summary = "";

            // i개 단위로 문자열 확인하여 압축
            for (int j = i; j <= s.length(); j += i) {
                // 다음 i개 단위로 잘릴 문자열 (j + i가 문자열 총 길이를 넘기면 안됨)
                String nextWord = s.substring(j, Math.min(j + i, s.length()));

                // 현재 단어와 다음 단어가 같으면, cnt 증가
                if (word.equals(nextWord)) {
                    cnt++;
                }

                // 현재 단어와 다음 단어가 다르면, 더이상 cnt를 증가시키지 않고 마무리 함.
                else {
                    // 압축된 문자열 개수가 1개가 아니면, 앞에 숫자를 추가해줌
                    if (cnt != 1) {
                        summary += cnt;
                    }
                    summary += word;

                    // 다음 단어가 이제 현재 단어가 됨.
                    word = nextWord;

                    // i개 단위로 압축된 개수 초기화
                    cnt = 1;
                }
            }
            // i개 단위로 자르고 남은 나머지 문자열을 이어 붙임 (딱 나눠지지 않을 수 있기 때문에)
            summary += word;

            // 한 번씩 잘라보면서 제일 짧게 잘린걸로 저장
            answer = Math.min(answer, summary.length());
        }
        return answer;
    }
}
