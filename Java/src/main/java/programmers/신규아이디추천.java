package programmers;

public class 신규아이디추천 {
    public String solution(String newId) {
        // step 1
        String answer = newId.toLowerCase();

        // step 2
        answer = answer.replaceAll("[^-_.a-z0-9]", "");

        // step 3
        answer = answer.replaceAll("[.]{2,}", ".");

        // step 4
        answer = answer.replaceAll("^[.]|[.]$", "");

        // step 5
        if (answer.equals("")) {
            answer += "a";
        }

        // step 6
        if (16 <= answer.length()) {
            answer = answer.substring(0, 15);
            answer = answer.replaceAll("[.]$", "");
        }

        // step 7
        if (answer.length() <= 2) {
            while (answer.length() < 3) {
                answer += answer.charAt(answer.length() - 1);
            }
        }
        return answer;
    }
}
