package algorithm_method;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 순열 : 배열 중 r개를 뽑아 나열한 순서를 구하는 경우의 수
 */
public class Permutation {
    private final List<int[]> pairs = new ArrayList<>();
    private final int[] arr;
    private final int r;

    public Permutation(int[] arr, int r) {
        this.arr = arr;
        this.r = r;
    }

    /**
     * 순열 경우의 수 리스트 반환
     */
    public List<int[]> getPermutation() {
        int[] pair = new int[r];
        execute(arr, pair, 0);
        print();
        return pairs;
    }

    private void execute(int[] arr, int[] pair, int depth) {
        if (depth == r) {
            pairs.add(Arrays.copyOf(pair, r));
            return;
        }
        for (int i = depth; i < arr.length; i++) {
            swap(arr, i, depth);
            pair[depth] = arr[depth];
            execute(arr, pair, depth + 1);
            swap(arr, i, depth);
        }
    }

    private void swap(int[] arr, int x, int y) {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }

    private void print() {
        pairs.forEach(pair -> {
            for (int n : pair) {
                System.out.print(n + " ");
            }
            System.out.println();
        });
    }

    /**
     * 순열 경우의 수 반환 (nPr)
     * ex) 5P2 = 5 * 4 = 20
     */
    public static int getCount(int n, int r) {
        return Factorial.execute(n) / Factorial.execute(n - r);
    }
}
