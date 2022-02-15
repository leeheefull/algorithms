package algorithmMethod;

public class Matrix {
    /**
     * 정방형 행렬을 90 * n 만큼 회전시킬 수 있다.
     *
     * @param map 회전시킬 행렬
     * @return 회전 후 결과 값
     */
    public int[][] rotate90(int[][] map, int degree) {
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

    /**
     * 행렬을 출력 테스트용 문자열
     *
     * @param map 행렬
     * @return 행렬을 출력하기 좋게 만든 문자열
     */
    public String print(int[][] map) {
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
