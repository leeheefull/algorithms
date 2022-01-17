package programmers;

public class 문자열압축 {
    public int solution(String s) {
        int answer = s.length();

        for (int i = 1; i <= s.length() / 2; i++) {
            int cnt = 1;
            String word = s.substring(0, i);
            StringBuilder summary = new StringBuilder();

            for (int j = i; j <= s.length(); j += i) {
                String nextWord = s.substring(j, Math.min(j + i, s.length()));

                if (word.equals(nextWord)) {
                    cnt++;
                } else {
                    summary.append(cnt == 1 ? "" : cnt).append(word);
                    word = nextWord;
                    cnt = 1;
                }
            }
            summary.append(word);
            answer = Math.min(answer, summary.length());
        }
        return answer;
    }
}
