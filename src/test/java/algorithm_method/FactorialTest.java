package algorithm_method;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FactorialTest {
    @Test
    public void 팩토리얼_개수_구하기() {
        // given
        int n = 5;

        // when
        int actual = Factorial.execute(5);
        int expected = 120;

        // then
        assertEquals(expected, actual);
    }
}
