package thisIsCodingTest.chapter07;

import java.util.Arrays;

public class Question2 {    // 떡볶이 떡 만들기
    public int solve(int n, int m, int[] heights) {
        int answer = 0;

        // 시작 점
        int start = 0;

        // 종단 점
        Arrays.sort(heights);
        int end = heights[n - 1];

        // 이진 탐색
        while (start <= end) {
            // 잘린 떡의 합계
            int sum = 0;

            // 중간 점
            int mid = (start + end) / 2;

            // 중간 점을 기준으로 잘린 떡 합계 구하기
            for (int height : heights) {
                if (mid < height) {
                    sum += height - mid;
                }
            }

            // 결과에 따라 시작 or 종단 점 위치 바꾸기
            if (sum < m) {
                end = mid - 1;
            } else {
                answer = mid;
                start = mid + 1;
            }
        }
        return answer;
    }
}
