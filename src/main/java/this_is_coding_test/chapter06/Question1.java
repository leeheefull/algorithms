package this_is_coding_test.chapter06;

public class Question1 {    // 위에서 아래로
    public int[] solve(int n, int[] arr) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                if (arr[i] < arr[j]) {
                    swap(arr, i, j);
                }
            }
        }
        return arr;
    }

    private void swap(int[] arr, int i, int j) {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }
}
