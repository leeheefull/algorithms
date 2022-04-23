package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class 문자열을정수로바꾸기Test {
    @Test
    public void test1() {
        assertEquals(
                1234,
                new 문자열을정수로바꾸기().solution("1234")
        );
    }

    @Test
    public void test2() {
        assertEquals(
                -1234,
                new 문자열을정수로바꾸기().solution("-1234")
        );
    }
}
