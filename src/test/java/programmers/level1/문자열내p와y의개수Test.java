package programmers.level1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class 문자열내p와y의개수Test {
    @Test
    public void test1() {
        assertTrue(new 문자열내p와y의개수().solution("pPoooyY"));
    }

    @Test
    public void test2() {
        assertFalse(new 문자열내p와y의개수().solution("Pyy"));
    }
}
