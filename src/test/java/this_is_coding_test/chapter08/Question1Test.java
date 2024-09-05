package this_is_coding_test.chapter08;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Question1Test {
    private Question1 q1;

    @BeforeEach
    void setUp() {
        q1 = new Question1();
    }

    @Test
    @DisplayName("26")
    void test1() {
        // given
        int n = 26;

        // when
        int actual = q1.solve(n);
        int expected = 3;

        // then
        assertEquals(expected, actual);
    }
}
