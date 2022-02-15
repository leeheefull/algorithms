package programmers.level2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class 오픈채팅방 {
    public String[] solution(String[] record) {
        // 최종 아이디와 닉네임 맵핑
        Map<String, String> recordMap = getMapNicknameById(record);

        // 결과 리스트
        List<String> answer = new ArrayList<>();

        // 결과 로직
        for (String data : record) {
            // 문자열 분리
            String[] infos = data.split(" ");

            // 입장
            if (infos[0].equals("Enter")) {
                answer.add(recordMap.get(infos[1]) + "님이 들어왔습니다.");
            }

            // 퇴장
            if (infos[0].equals("Leave")) {
                answer.add(recordMap.get(infos[1]) + "님이 나갔습니다.");
            }
        }
        return answer.toArray(String[]::new);
    }

    private Map<String, String> getMapNicknameById(String[] record) {
        // 아이디와 닉네임 맵
        Map<String, String> recordMap = new HashMap<>();

        // 최종 닉네임 찾기 로직
        for (String data : record) {
            // 문자열 분리
            String[] infos = data.split(" ");

            // 퇴장 메세지 예외 처리
            if (infos.length < 3) {
                continue;
            }

            // 입장과 변경 시 업데이트
            recordMap.put(infos[1], infos[2]);
        }
        return recordMap;
    }
}
