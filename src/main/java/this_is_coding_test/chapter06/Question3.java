package this_is_coding_test.chapter06;

import java.util.Arrays;

public class Question3 {    // 두 배열의 원소 교체
    public long solve(int n, int k, int[] a, int[] b) {
        Arrays.sort(a);
        Arrays.sort(b);

        for (int i = 0; i < k; i++) {
            if (a[i] < b[n - i - 1]) {
                int tmp = b[n - i - 1];
                b[n - i - 1] = a[i];
                a[i] = tmp;
            }
        }

        long answer = 0;
        for (int num : a) {
            answer += num;
        }
        return answer;
    }
}
