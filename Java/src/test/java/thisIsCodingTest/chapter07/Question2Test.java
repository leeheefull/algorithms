package thisIsCodingTest.chapter07;

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
    @DisplayName("4 6 / 19 15 10 17")
    void test1() {
        // given
        int n = 4;
        int m = 6;
        int[] heights = {19, 15, 10, 17};

        // when
        int actual = q2.solve(n, m, heights);
        int expected = 15;

        // then
        assertEquals(expected, actual);
    }
}
