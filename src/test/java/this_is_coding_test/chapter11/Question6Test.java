package this_is_coding_test.chapter11;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Question6Test {
    private Question6 q6;

    @BeforeEach
    void setUp() {
        q6 = new Question6();
    }

    @Test
    @DisplayName("3 1 2 / 5")
    void test1() {
        // given
        int[] foodTimes = {3, 1, 2};
        long k = 5;

        // when
        int actual = q6.solve(foodTimes, k);
        int expected = 1;

        // then
        assertEquals(expected, actual);
    }
}