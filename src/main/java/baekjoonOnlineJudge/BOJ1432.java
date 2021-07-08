package baekjoonOnlineJudge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class BOJ1432 {  // 시리얼 번호
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] serials = new String[n];
        for (int i = 0; i < serials.length; i++) {
            serials[i] = br.readLine();
        }

        Arrays.sort(serials, new Comparator<>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() < o2.length()) {
                    return -1;
                } else if (o1.length() == o2.length()) {
                    if (stringSum(o1) < stringSum(o2)) {
                        return -1;
                    } else if (stringSum(o1) == stringSum(o2)) {
                        return o1.compareTo(o2);
                    }
                }
                return 1;
            }

            private int stringSum(String str) {
                int result = 0;
                for (char c : str.toCharArray()) {
                    if ('0' <= c && c <= '9') {
                        result += c - '0';
                    }
                }
                return result;
            }
        });

        for (String serial : serials) {
            System.out.println(serial);
        }
    }
}
