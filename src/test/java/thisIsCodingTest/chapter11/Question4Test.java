package thisIsCodingTest.chapter11;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Question4Test {
    private Question4 q4;

    @BeforeEach
    void setUp() {
        q4 = new Question4();
    }

    @Test
    @DisplayName("3 2 1 1 9")
    void test1() {
        // given
        List<Integer> coins = Arrays.asList(3, 2, 1, 1, 9);

        // when
        int actual = q4.solve(coins);
        int expected = 8;

        // then
        assertEquals(expected, actual);
    }
}