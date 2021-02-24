package greedy;

import java.util.Arrays;
import java.util.Scanner;

public class BOJ1339 {    // word math

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        char[] word = new char[10];
        int[] weight = new int[10];

        Arrays.fill(word, '0');
        Arrays.fill(weight, 0);

        while (N-- > 0) {
            String tmpStr = scanner.next();
            int w = 1;
            for (int i = tmpStr.length() - 1; 0 <= i; i--) {
                char tmpChar = tmpStr.charAt(i);
                for (int j = 0; j < 10; j++) {
                    if (word[j] == tmpChar) {
                        weight[j] += w;
                        break;
                    } else if (word[j] == '0') {
                        word[j] = tmpChar;
                        weight[j] = w;
                        break;
                    }
                }
                w *= 10;
            }
        }
        Arrays.sort(weight);

        int sum = 0;
        for (int i = 9; 0 <= i; i--) {
            sum += i * weight[i];
        }
        System.out.println(sum);
    }
}