package algorithmMethod;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CombinationTest {
    private Combination combination;

    @BeforeEach
    void setUp() {
        this.combination = new Combination();
    }

    @Test
    void 조합_구하기() {
        // given
        int[] arr = {3, 6, 1, 2};
        boolean[] visited = new boolean[arr.length];
        int start = 0;
        int r = 2;

        // when
        combination.getCombination(arr, visited, start, r);
        List<int[]> actual = Combination.answer;
        List<int[]> expected = Arrays.asList(
                new int[]{3, 6},
                new int[]{3, 1},
                new int[]{3, 2},
                new int[]{6, 1},
                new int[]{6, 2},
                new int[]{1, 2}
        );

        // then
        for (int i = 0; i < actual.size(); i++) {
            assertArrayEquals(actual.get(i), expected.get(i));
        }
    }

    @Test
    void 조합_개수_구하기() {
        // given
        int n = 10;
        int r = 2;

        // when
        int actual = combination.getCount(n, r);
        int expected = 45;

        // then
        assertEquals(actual, expected);
    }
}
