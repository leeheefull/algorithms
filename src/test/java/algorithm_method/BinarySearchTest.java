package algorithm_method;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchTest {
    private BinarySearch binarySearch;

    @Test
    void 배열에서_값의_위치_찾기() {
        // given
        int[] position = {1, 2, 8, 4, 9};
        this.binarySearch = new BinarySearch(position);
        int key = 2;

        // when
        int actual = binarySearch.getIndex(key);
        int expected = 1;

        // then
        assertEquals(expected, actual);
    }
}
