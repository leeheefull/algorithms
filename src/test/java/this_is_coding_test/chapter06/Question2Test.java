package this_is_coding_test.chapter06;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class Question2Test {
    private Question2 q2;

    @BeforeEach
    void setUp() {
        q2 = new Question2();
    }

    @Test
    @DisplayName("2 / 홍길동 95 / 이순신 77")
    void test1() {
        // given
        int n = 2;
        List<Student> students = new ArrayList<>();
        students.add(new Student("홍길동", 95));
        students.add(new Student("이순신", 77));

        // when
        String[] actual = q2.solve(n, students);
        String[] expected = {"이순신", "홍길동"};

        // then
        assertArrayEquals(expected, actual);
    }
}
