package programmers.level1;

import java.util.*;

public class 두개뽑아서더하기 {
    private final List<int[]> combinationResult = new ArrayList<>();

    public int[] solution(int[] numbers) {
        Set<Integer> answer = new TreeSet<>();
        getCombination(numbers, new boolean[numbers.length], 0, 2);

        combinationResult.forEach(array -> answer.add(array[0] + array[1]));
        return answer.stream()
                .mapToInt(Integer::intValue)
                .toArray();
    }

    private void getCombination(int[] arr, boolean[] visited, int start, int r) {
        if (r == 0) {
            List<Integer> oneCase = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                if (visited[i]) {
                    oneCase.add(arr[i]);
                }
            }
            combinationResult.add(
                    oneCase.stream()
                            .mapToInt(Integer::intValue)
                            .toArray()
            );
        }
        if (r != 0) {
            for (int i = start; i < arr.length; i++) {
                visited[i] = true;
                getCombination(arr, visited, i + 1, r - 1);
                visited[i] = false;
            }
        }
    }
}
