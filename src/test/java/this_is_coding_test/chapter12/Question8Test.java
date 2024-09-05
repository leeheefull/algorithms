package this_is_coding_test.chapter12;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Question8Test {
    private Question8 q8;

    @BeforeEach
    void setUp() {
        q8 = new Question8();
    }

    @Test
    @DisplayName("K1KA5CB7")
    void test1() {
        // given
        String input = "K1KA5CB7";

        // when
        String actual = q8.solve(input);
        String expected = "ABCKK13";

        // then
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("AJKDLSI412K4JSJ9D")
    void test8() {
        // given
        String input = "AJKDLSI412K4JSJ9D";

        // when
        String actual = q8.solve(input);
        String expected = "ADDIJJJKKLSS20";

        // then
        assertEquals(expected, actual);
    }
}