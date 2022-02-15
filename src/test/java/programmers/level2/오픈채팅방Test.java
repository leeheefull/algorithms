package programmers.level2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class 오픈채팅방Test {
    private 오픈채팅방 test;

    @BeforeEach
    void setUp() {
        test = new 오픈채팅방();
    }

    @Test
    void test1() {
        // given
        String[] record = {"Enter uid1234 Muzi", "Enter uid4567 Prodo", "Leave uid1234", "Enter uid1234 Prodo", "Change uid4567 Ryan"};

        // when
        String[] actual = test.solution(record);
        String[] expected = {"Prodo님이 들어왔습니다.", "Ryan님이 들어왔습니다.", "Prodo님이 나갔습니다.", "Prodo님이 들어왔습니다."};

        // then
        assertArrayEquals(expected, actual);
    }
}
