package this_is_coding_test.chapter03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Question2Test {
    private Question2 q2;

    @BeforeEach
    void setUp() {
        q2 = new Question2();
    }

    @Test
    @DisplayName("5 8 3 / 2 4 5 4 6")
    void test1() {
        // given
        int n = 5;
        int m = 8;
        int k = 3;
        int[] nums = {2, 4, 5, 4, 6};

        // when
        int actual = q2.solve(n, m, k, nums);
        int expected = 46;

        // then
        assertEquals(expected, actual);
    }
}