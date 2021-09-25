package thisIsCodingTest.chapter07;

import java.util.Arrays;

public class Question1 {	// 부품 찾기
    public String[] solve(int n, int[] nArr, int m, int[] mArr) {
        String[] answer = new String[m];
        Arrays.sort(nArr);
        for (int i = 0; i < m; i++) {
            int result = binarySearch(nArr, mArr[i], 0, n - 1);
            answer[i] = (result == -1 ? "no" : "yes");
        }
        return answer;
    }

    public int binarySearch(int[] arr,
                            int target,
                            int start,
                            int end) {
        while (start <= end) {
            int mid = (start + end) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (arr[mid] > target) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return -1;
    }
}
