package thisIsCodingTest.chapter04;

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
    @DisplayName("5")
    void test1() {
        // given
        int n = 5;

        // when
        int actual = q2.solve(n);
        int expected = 11475;

        // then
        assertEquals(expected, actual);
    }
}