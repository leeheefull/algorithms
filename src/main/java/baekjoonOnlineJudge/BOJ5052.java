package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class BOJ5052 {// string
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            String[] lines = new String[n];
            boolean isConsistency = true;

            for (int i = 0; i < n; i++) {
                lines[i] = br.readLine();
            }
            Arrays.sort(lines, Comparator.naturalOrder());
            for (int i = 1; i < n; i++) {
                if (lines[i].startsWith(lines[i - 1])) {
                    isConsistency = false;
                    break;
                }
            }
            System.out.println(isConsistency ? "YES" : "NO");
        }
    }
}