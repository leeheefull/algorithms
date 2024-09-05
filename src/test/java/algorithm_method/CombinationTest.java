package algorithm_method;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

class CombinationTest {
    private Combination combination;
    @Test
    void 조합_구하기() {
        // given
        int[] arr = {3, 6, 1, 2};
        int r = 2;
        this.combination = new Combination(arr, r);

        // when
        List<int[]> actual = combination.getCombination();
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
        int actual = Combination.getCount(n, r);
        int expected = 45;

        // then
        assertEquals(actual, expected);
    }
}
