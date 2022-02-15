package algorithmMethod;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MatrixTest {
    private Matrix matrix;

    @BeforeEach
    void setUp() {
        this.matrix = new Matrix();
    }

    @Test
    void 외전_90도() {
        // given
        int[][] map = {
                {0, 1, 1, 0, 1, 0, 0},
                {0, 1, 1, 0, 1, 0, 1},
                {1, 1, 1, 0, 1, 0, 1},
                {0, 0, 0, 0, 1, 1, 1},
                {0, 1, 0, 0, 0, 0, 0},
                {0, 1, 1, 1, 1, 1, 0},
                {0, 1, 1, 1, 0, 0, 0},
        };
        int degree = 90;

        // when
        int[][] actual = matrix.rotate90(map, degree);
        int[][] expected = {
                {0, 0, 0, 0, 1, 0, 0},
                {1, 1, 1, 0, 1, 1, 1},
                {1, 1, 0, 0, 1, 1, 1},
                {1, 1, 0, 0, 0, 0, 0},
                {0, 1, 0, 1, 1, 1, 1},
                {0, 1, 0, 1, 0, 0, 0},
                {0, 0, 0, 1, 1, 1, 0}
        };

        // then
        assertArrayEquals(expected, actual);
    }
}
