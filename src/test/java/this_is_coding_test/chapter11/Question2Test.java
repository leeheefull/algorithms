package this_is_coding_test.chapter11;

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
    @DisplayName("02984")
    void test1() {
        // given
        String input = "02984";

        // when
        int actual = q2.solve(input);
        int expected = 576;

        // then
        assertEquals(actual, expected);
    }

    @Test
    @DisplayName("567")
    void test2() {
        // given
        String input = "567";

        // when
        int actual = q2.solve(input);
        int expected = 210;

        // then
        assertEquals(actual, expected);
    }
}
