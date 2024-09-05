package this_is_coding_test.chapter11;

public class Question5 {    // 볼링공 고르기
    public int solve(int n, int maxWeight, int[] balls) {
        int[] weights = new int[maxWeight + 1];
        for (int ball : balls) {
            weights[ball]++;
        }

        int answer = n * (n - 1) / 2;
        for (int weight : weights) {
            if (1 < weight) {
                answer -= weight * (weight - 1) / 2;
            }
        }
        return answer;
    }

//    public int solve(int n, int[] balls) {
//        int answer = n * (n - 1) / 2;
//        for (int i = 0; i < n; i++) {
//            for (int j = i + 1; j < n; j++) {
//                if (balls[i] == balls[j]) {
//                    answer--;
//                }
//            }
//        }
//        return answer;
//    }
}
