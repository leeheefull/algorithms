package algorithm_method;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class PermutationTest {
    private Permutation permutation;

    @Test
    public void 순열_리스트_구하기() {
        // given
        int[] numbers = {1, 3, 2};
        this.permutation = new Permutation(numbers, 2);

        // when
        List<int[]> actual = permutation.getPermutation();
        List<int[]> expected = Arrays.asList(
                new int[]{1, 3},
                new int[]{1, 2},
                new int[]{3, 1},
                new int[]{3, 2},
                new int[]{2, 3},
                new int[]{2, 1}

        );

        // then
        for (int i = 0; i < actual.size(); i++) {
            assertArrayEquals(actual.get(i), expected.get(i));
        }
    }

    @Test
    public void 순열_개수_구하기() {
        // given
        int n = 5;
        int r = 3;

        // when
        int actual = Permutation.getCount(n, r);
        int expected = 60;

        // then
        assertEquals(actual, expected);
    }
}
