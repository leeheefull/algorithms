package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class 문자열다루기기본Test {
    @Test
    public void test1() {
        assertFalse(new 문자열다루기기본().solution("a234"));
    }

    @Test
    public void test2() {
        assertTrue(new 문자열다루기기본().solution("1234"));
    }
}
