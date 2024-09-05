package this_is_coding_test.chapter11;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Question3Test {
    private Question3 q3;

    @BeforeEach
    void setUp() {
        q3 = new Question3();
    }

    @Test
    @DisplayName("0001100")
    void test1() {
        // given
        String input = "0001100";

        // when
        int actual = q3.solve(input);
        int expected = 1;

        // then
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("01010101010")
    void test2() {
        // given
        String input = "01010101010";

        // when
        int actual = q3.solve(input);
        int expected = 5;

        // then
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("010101010101")
    void test3() {
        // given
        String input = "010101010101";

        // when
        int actual = q3.solve(input);
        int expected = 6;

        // then
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("0")
    void test4() {
        // given
        String input = "0";

        // when
        int actual = q3.solve(input);
        int expected = 0;

        // then
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("1")
    void test5() {
        // given
        String input = "1";

        // when
        int actual = q3.solve(input);
        int expected = 0;

        // then
        assertEquals(expected, actual);
    }
}
