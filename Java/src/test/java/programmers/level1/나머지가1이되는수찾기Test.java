package programmers.level1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class 나머지가1이되는수찾기Test {
    private 나머지가1이되는수찾기 test;

    @BeforeEach
    void setUp() {
        this.test = new 나머지가1이되는수찾기();
    }

    @Test
    void test1() {
        // given
        int n = 10;

        // when
        int actual = test.solution(n);

        // then
        assertEquals(3, actual);
    }

    @Test
    void test2() {
        // given
        int n = 12;

        // when
        int actual = test.solution(n);

        // then
        assertEquals(11, actual);
    }
}
