package thisIsCodingTest.chapter06;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Question3Test {
    private Question3 q3;

    @BeforeEach
    void setUp() {
        q3 = new Question3();
    }

    @Test
    @DisplayName("5 3 / 1 2 5 4 3 / 5 5 6 6 5")
    void test1() {
        // given
        int n = 5;
        int k = 3;
        int[] a = {1, 2, 5, 4, 3};
        int[] b = {5, 5, 6, 6, 5};

        // when
        long actual = q3.solve(n, k, a, b);
        long expected = 26;

        // then
        assertEquals(expected, actual);
    }
}
