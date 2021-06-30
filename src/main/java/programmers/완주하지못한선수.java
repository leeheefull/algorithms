package programmers;

import java.util.*;

public class 완주하지못한선수 { // hash
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> hash = new HashMap<>();

        for (String arg : participant) {
            hash.put(arg, hash.getOrDefault(arg, 0) + 1);
        }

        for (String arg : completion) {
            hash.put(arg, hash.get(arg) - 1);
        }

        for (String key : hash.keySet()) {
            if (hash.get(key) != 0) {
                return key;
            }
        }
        return "";
    }
}
