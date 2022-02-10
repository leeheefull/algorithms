package programmers.level1;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class 부족한금액계산하기Test {
    private 부족한금액계산하기 test;

    @BeforeEach
    void setUp() {
        this.test = new 부족한금액계산하기();
    }

    @Test
    void test1() {
        // given
        int price = 3;
        int money = 20;
        int count = 4;

        // when
        long actual = test.solution(price, money, count);

        // then
        assertEquals(10, actual);
    }
}
