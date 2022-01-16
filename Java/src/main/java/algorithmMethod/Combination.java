package algorithmMethod;

import java.util.ArrayList;
import java.util.List;

public class Combination {
    /**
     * getCombination의 결과 값
     */
    public static final List<int[]> answer = new ArrayList<>();

    /**
     * arr에서 r개를 뽑을 경우의 수 목록을 구할 수 있다.
     *
     * @param arr     뽑기를 할 정보
     * @param visited 방문했는지 체크
     * @param start   시작 index로써 처음에는 0을 넣는다.
     * @param r       뽑을 개수
     */
    public void getCombination(int[] arr, boolean[] visited, int start, int r) {
        if (r == 0) {
            List<Integer> oneCase = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                if (visited[i]) {
                    oneCase.add(arr[i]);
                }
            }
            answer.add(
                    oneCase.stream()
                            .mapToInt(i -> i)
                            .toArray()
            );
            return;
        } else {
            for (int i = start; i < arr.length; i++) {
                visited[i] = true;
                getCombination(arr, visited, i + 1, r - 1);
                visited[i] = false;
            }
        }
    }

    /**
     * n개 중 r개를 뽑을 경우의 수
     *
     * @param n 전체 개수
     * @param r 뽑을 개수
     * @return 경우의 수
     */
    public int getCount(int n, int r) {
        if (n == r || r == 0) {
            return 1;
        } else {
            return getCount(n - 1, r - 1) + getCount(n - 1, r);
        }
    }
}
