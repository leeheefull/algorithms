package this_is_coding_test.chapter04;

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
    @DisplayName("a1")
    void test1() {
        // given
        String position = "a1";

        // when
        int actual = q3.solve(position);
        int expected = 2;

        // then
        assertEquals(expected, actual);
    }
}