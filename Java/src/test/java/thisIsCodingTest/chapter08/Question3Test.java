package thisIsCodingTest.chapter08;

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
    @DisplayName("3")
    void test1() {
        // given
        int n = 3;

        // when
        int actual = q3.solve(n);
        int expected = 5;

        // then
        assertEquals(expected, actual);
    }
}
