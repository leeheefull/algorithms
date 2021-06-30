package baekjoonOnlineJudge;

import java.io.*;
import java.util.Arrays;

public class BOJ2309 { // bruteforce
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] dwarf = new int[9];
        int sum = 0;

        for (int i = 0; i < dwarf.length; i++) {
            dwarf[i] = Integer.parseInt(br.readLine());
            sum += dwarf[i];
        }
        Arrays.sort(dwarf);

        for (int i = 0; i < dwarf.length; i++) {            // ������ ù ��° ��
            for (int j = i + 1; j < dwarf.length; j++) {    // ������ �� ��° ��
                if (sum - dwarf[i] - dwarf[j] == 100) {
                    for (int k = 0; k < dwarf.length; k++) {
                        if (k != i && k != j) {
                            System.out.println(dwarf[k]);
                        }
                    }
                    return;
                }
            }
        }
    }
}