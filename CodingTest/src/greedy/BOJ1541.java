package greedy;

import java.util.Scanner;

public class BOJ1541 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        String[] splitMinus = data.split("\\-"); // split minus
        int result = plus(splitMinus[0]);

        for (int i = 1; i < splitMinus.length; i++) {
            result -= plus(splitMinus[i]);
        }
        System.out.print(result);
        scanner.close();
    }

    private static int plus(String splitMinus) {
        String[] num = splitMinus.split("\\+"); // split plus
        int result = 0;

        for (String item : num) {
            result += Integer.parseInt(item);
        }
        return result;
    }
}