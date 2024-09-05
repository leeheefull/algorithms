package algorithm_method;

import java.util.ArrayList;
import java.util.List;

/**
 * 조합 : 배열 중 r개를 뽑는 경우의 수 (순서는 중요하지 않음)
 */
public class Combination {
    private final List<int[]> picks = new ArrayList<>();
    private final int[] arr;
    private final int r;

    public Combination(int[] arr, int r) {
        this.arr = arr;
        this.r = r;
    }

    /**
     * 조합의 경우의 수 리스트 반환
     */
    public List<int[]> getCombination() {
        execute(new boolean[arr.length], 0, r);
//        print();
        return picks;
    }

    private void execute(boolean[] visited, int depth, int r) {
        if (r == 0) {
            List<Integer> tmp = new ArrayList<>();
            for (int i = 0; i < arr.length; i++) {
                if (visited[i]) {
                    tmp.add(arr[i]);
                }
            }
            int[] pick = new int[tmp.size()];
            for (int i = 0; i < pick.length; i++) {
                pick[i] = tmp.get(i);
            }
            picks.add(pick);
        }
        if (r != 0) {
            for (int i = depth; i < arr.length; i++) {
                visited[i] = true;
                execute(visited, i + 1, r - 1);
                visited[i] = false;
            }
        }
    }

    private void print() {
        picks.forEach(pick -> {
            for (int n : pick) {
                System.out.print(n + " ");
            }
            System.out.println();
        });
    }

    /**
     * 순열 경우의 수 반환 (nCr)
     * ex) 5C2 = (5 * 4) / (2 * 1) = 10
     */
    public static int getCount(int n, int r) {
        if (n == r || r == 0) {
            return 1;
        } else {
            return getCount(n - 1, r - 1) + getCount(n - 1, r);
        }
    }
}
