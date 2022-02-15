package thisIsCodingTest.chapter03;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Question1Test {
    private Question1 q1;

    @BeforeEach
    void setUp() {
        q1 = new Question1();
    }

    @Test
    @DisplayName("123402")
    void test1() {
        // given
        int change = 1260;

        // when
        int actual = q1.solve(change);
        int expected = 6;

        // then
        assertEquals(expected, actual);
    }
}