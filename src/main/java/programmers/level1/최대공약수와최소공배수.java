package programmers.level1;

public class 최대공약수와최소공배수 {
    public int[] solution(int n, int m) {
        int gcd = getGcd(n, m);    // 최대공약수
        int lcm = getLcm(n, m);    // 최소공배수

        return new int[]{gcd, lcm};
    }

    private int getGcd(int n, int m) {
        for (int index = Math.min(n, m); 0 < index; index--) {
            if (n % index == 0 && m % index == 0) {
                return index;
            }
        }
        return 0;
    }

    private int getLcm(int n, int m) {
        int index = Math.max(n, m);
        while (true) {
            if (index % n == 0 && index % m == 0) {
                return index;
            }
            index++;
        }
    }
}
