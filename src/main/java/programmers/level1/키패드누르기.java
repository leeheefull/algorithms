package programmers.level1;

public class 키패드누르기 {
    // 왼손 위치를 *(10)이라고 가정한다.
    private int leftPosition = 10;

    // 오른손 위치를 #(12)이라고 가정한다.
    private int rightPosition = 12;

    public String solution(int[] numbers, String hand) {
        String answer = "";

        for (int number : numbers) {
            int tmp = number;

            // 0의 위치를 11이라고 가정한다.
            if (tmp == 0) {
                tmp = 11;
            }

            // 3, 6, 9를 누를 경우
            if (tmp % 3 == 0) {
                answer += pushBtn(tmp, "R");
            }
            // 1, 4, 7을 누를 경우
            else if (tmp % 3 == 1) {
                answer += pushBtn(tmp, "L");
            }
            // 2, 5, 8, 0(10)을 누를 경우
            else {
                answer += checkAndGetMidBtn(hand, tmp);
            }
        }
        return answer;
    }

    private String checkAndGetMidBtn(String hand, int number) {
        // 오른손 위치와 누를 숫자의 거리 계산
        int rightDistance = getDistance(rightPosition, number);

        // 왼손 위치와 누를 숫자의 거리 계산
        int leftDistance = getDistance(leftPosition, number);

        // 오른손이 가까울 경우
        if (rightDistance < leftDistance) {
            return pushBtn(number, "R");
        }
        // 왼손이 가까울 경우
        else if (rightDistance > leftDistance) {
            return pushBtn(number, "L");
        }
        // 왼손과 오른손의 거리가 같을 경우
        else {
            // 오른손잡이일 경우
            if (hand.equals("right")) {
                return pushBtn(number, "R");
            }
            // 왼손잡이일 경우
            else {
                return pushBtn(number, "L");
            }
        }
    }

    private String pushBtn(int number, String hand) {
        // 오른손으로 누르기
        if (hand.equals("R")) {
            rightPosition = number;
        }
        // 왼손으로 누르기
        else {
            leftPosition = number;
        }
        return hand;
    }

    private int getDistance(int position, int destination) {
        // 나누기 연산을 위한 -1 행위
        position--;
        destination--;

        // 현 위치와 목적지의 행과 열의 거리 차이 구하기
        int columnDis = Math.abs(destination / 3 - position / 3);
        int rowDis = Math.abs(destination % 3 - position % 3);

        // 행과 열의 거리 차 합
        return columnDis + rowDis;
    }
}
