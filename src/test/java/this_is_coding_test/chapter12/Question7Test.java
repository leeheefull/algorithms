package this_is_coding_test.chapter12;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Question7Test {
    private Question7 q7;

    @BeforeEach
    void setUp() {
        q7 = new Question7();
    }

    @Test
    @DisplayName("123402")
    void test1() {
        // given
        int n = 123402;

        // when
        String actual = q7.solve(n);
        String expected = "LUCKY";

        // then
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("7755")
    void test2() {
        // given
        int n = 7755;

        // when
        String actual = q7.solve(n);
        String expected = "READY";

        // then
        assertEquals(expected, actual);
    }
}