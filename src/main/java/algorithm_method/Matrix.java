package algorithm_method;

public class Matrix {
    private final int[][] map;

    public Matrix(int[][] map) {
        this.map = map;
    }

    /**
     * 정방형 행렬을 90 * n 만큼 회전시킬 수 있다.
     */
    public int[][] rotate(int degree) {
        int[][] answer = new int[map[0].length][map.length];
        for (int i = 0; i < answer.length; i++) {
            for (int j = 0; j < answer[i].length; j++) {
                switch (degree) {
                    case 90:
                        answer[i][j] = map[map.length - 1 - j][i];
                        break;
                    case 180:
                        answer[i][j] = map[map.length - 1 - i][map.length - 1 - j];
                        break;
                    case 270:
                        answer[i][j] = map[j][map.length - 1 - i];
                        break;
                }
            }
        }
        return answer;
    }

    private String print(int[][] map) {
        StringBuilder answer = new StringBuilder();
        for (int[] ints : map) {
            for (int anInt : ints) {
                answer.append(anInt).append(" ");
            }
            answer.append("\n");
        }
        return answer.toString();
    }
}
