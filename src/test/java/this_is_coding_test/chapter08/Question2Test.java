package this_is_coding_test.chapter08;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Question2Test {
    private Question2 q2;

    @BeforeEach
    void setUp() {
        q2 = new Question2();
    }

    @Test
    @DisplayName("26")
    void test1() {
        // given
        int n = 4;
        int[] k = {1, 3, 1, 5};

        // when
        int actual = q2.solve(n, k);
        int expected = 8;

        // then
        assertEquals(expected, actual);
    }
}
