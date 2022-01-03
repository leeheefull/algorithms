package thisIsCodingTest.chapter04;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class Question1Test {
    private Question1 q1;

    @BeforeEach
    void setUp() {
        q1 = new Question1();
    }

    @Test
    @DisplayName("5 / R R R U D D")
    void test1() {
        // given
        int n = 5;
        char[] moves = {'R', 'R', 'R', 'U', 'D', 'D'};

        // when
        int[] actual = q1.solve(n, moves);
        int[] expected = {3, 4};

        // then
        assertArrayEquals(expected, actual);
    }
}