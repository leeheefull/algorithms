package algorithm_method;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class MatrixTest {
    private Matrix matrix;

    @Test
    void 회전_90도() {
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
        this.matrix = new Matrix(map);
        int degree = 90;

        // when
        int[][] actual = matrix.rotate(degree);
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
