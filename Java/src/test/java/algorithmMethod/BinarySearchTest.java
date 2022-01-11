package algorithmMethod;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BinarySearchTest {
    private BinarySearch binarySearch;

    @BeforeEach
    void setUp() {
        this.binarySearch = new BinarySearch();
    }

    @Test
    void 배열에서_값의_위치_찾기() {
        // given
        int key = 2;
        int[] position = {1, 2, 8, 4, 9};

        // when
        int actual = binarySearch.getIndex(position, key);
        int expected = 1;

        // then
        assertEquals(expected, actual);
    }
}
