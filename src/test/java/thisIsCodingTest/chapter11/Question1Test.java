package thisIsCodingTest.chapter11;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Question1Test {
    private Question1 q1;

    @BeforeEach
    void setUp() {
        q1 = new Question1();
    }

    @Test
    void test1() {
        // given
        int n = 5;
        List<Integer> fears = Arrays.asList(2, 3, 1, 2, 2);

        // when
        int actual = q1.solve(n, fears);
        int expected = 2;

        // then
        assertEquals(actual, expected);
    }

    @Test
    void test2() {
        // given
        int n = 1;
        List<Integer> fears = Arrays.asList(1);

        // when
        int actual = q1.solve(n, fears);
        int expected = 1;

        // then
        assertEquals(actual, expected);
    }

    @Test
    void test3() {
        // given
        int n = 2;
        List<Integer> fears = Arrays.asList(2, 2);

        // when
        int actual = q1.solve(n, fears);
        int expected = 1;

        // then
        assertEquals(actual, expected);
    }

    @Test
    void test4() {
        // given
        int n = 2;
        List<Integer> fears = Arrays.asList(1, 1);

        // when
        int actual = q1.solve(n, fears);
        int expected = 2;

        // then
        assertEquals(actual, expected);
    }

    @Test
    void test5() {
        // given
        int n = 8;
        List<Integer> fears = Arrays.asList(6, 5, 4, 3, 3, 3, 3, 3);

        // when
        int actual = q1.solve(n, fears);
        int expected = 1;

        // then
        assertEquals(actual, expected);
    }
}
