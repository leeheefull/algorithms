package thisIsCodingTest.chapter07;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Question1Test {
    private Question1 q1;

    @BeforeEach
    void setUp() {
        q1 = new Question1();
    }

    @Test
    @DisplayName("5 / 8 3 7 9 2 / 3 / 5 7 9")
    void test1() {
        // given
        int n = 5;
        int[] nArr = {8, 3, 7, 9, 2};
        int m = 3;
        int[] mArr = {5, 7, 9};

        // when
        String[] actual = q1.solve(n, nArr, m, mArr);
        String[] expected = {"no", "yes", "yes"};

        // then
        assertArrayEquals(expected, actual);
    }
}
