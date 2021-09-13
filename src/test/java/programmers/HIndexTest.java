package programmers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class HIndexTest {
    private HIndex test;

    @BeforeEach
    void setUp() {
        test = new HIndex();
    }

    @Test
    void test1() {
        // given
        int[] citations = {3, 0, 6, 1, 5};

        // when
        int actual = test.solution(citations);
        int expected = 3;

        // then
        assertEquals(actual, expected);
    }
}