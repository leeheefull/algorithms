package algorithmMethod;

import java.util.Arrays;

public class BinarySearch {
    private final int[] data;

    public BinarySearch(int[] data) {
        this.data = data;
    }

    /**
     * 이분 탐색을 이용하여, data에서 key를 찾아서 index를 반환한다.
     *
     * @param key  찾아야 할 값
     * @return data에서 key의 위치(index) 반환, 없으면 -1
     */
    public int getIndex(int key) {
        // 정렬된 배열에서 이분 탐색이 가능함
        Arrays.sort(data);

        // 배열의 맨 왼쪽과 오른쪽의 index 값
        int left = 0;
        int right = data.length - 1;

        // 이분 탐색 중요 로직
        while (left <= right) {
            // 피벗 생성
            int mid = (left + right) / 2;
            int pivot = data[mid];

            // 분기
            if (key < pivot) {
                right = mid - 1;
            }
            if (key > pivot) {
                left = mid + 1;
            }
            if (key == pivot) {
                return mid;
            }
        }
        // key가 data에 존재하지 않을 경우
        return -1;
    }
}
