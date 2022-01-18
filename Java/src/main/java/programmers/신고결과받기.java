package programmers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 신고결과받기 {
    public int[] solution(String[] idList, String[] report, int k) {
        Map<String, List<String>> result = convertReport(report);
        return getResult(idList, k, result);
    }

    private int[] getResult(String[] idList, int k, Map<String, List<String>> result) {
        int[] answer = new int[idList.length];
        result.forEach((respondent, reporters) -> {
            if (reporters.size() >= k) {
                reporters.forEach(reporter -> {
                    for (int i = 0; i < idList.length; i++) {
                        if (reporter.equals(idList[i])) {
                            answer[i]++;
                        }
                    }
                });
            }
        });
        return answer;
    }

    private Map<String, List<String>> convertReport(String[] report) {
        Map<String, List<String>> result = new HashMap<>();
        for (String re : report) {
            // 신고자와 피신고자 분리
            String[] names = re.split(" ");
            String reporter = names[0];
            String respondent = names[1];

            // 피신고자가 존재하면, list에 add
            if (result.containsKey(respondent)) {
                // 중복 제거
                if (!result.get(respondent).contains(reporter)) {
                    result.get(respondent).add(reporter);
                }
            }
            // 피신고자가 존재하지 않으면, list 생성 후 add
            else {
                List<String> values = new ArrayList<>();
                values.add(reporter);
                result.put(respondent, values);
            }
        }
        return result;
    }
}
