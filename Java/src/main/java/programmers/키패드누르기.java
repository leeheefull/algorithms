package programmers;

public class 키패드누르기 {
    String answer = "";
    int leftPosition = 10;
    int rightPosition = 12;

    public String solution(int[] numbers, String hand) {
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];

            if (number == 0) {
                number = 11;
            }
            if (number % 3 == 0) {
                push(number, "R");
            }
            if (number % 3 == 1) {
                push(number, "L");
            }
            if (number % 3 == 2) {
                int rightDistance = getDistance(rightPosition, number);
                int leftDistance = getDistance(leftPosition, number);

                if (rightDistance < leftDistance) {
                    push(number, "R");
                }
                if (rightDistance > leftDistance) {
                    push(number, "L");
                }
                if (rightDistance == leftDistance) {
                    if (hand.equals("right")) {
                        push(number, "R");
                    }
                    if (hand.equals("left")) {
                        push(number, "L");
                    }
                }
            }
        }
        return answer;
    }

    private void push(int number, String hand) {
        answer += hand;
        if (hand.equals("R")) {
            rightPosition = number;
        }
        if (hand.equals("L")) {
            leftPosition = number;
        }
    }

    private int getDistance(int position, int destination) {
        destination--;
        position--;

        int resultColumn = Math.abs(destination / 3 - position / 3);
        int resultRow = Math.abs(destination % 3 - position % 3);

        return resultColumn + resultRow;
    }
}
