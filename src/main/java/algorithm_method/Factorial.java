package algorithm_method;

public class Factorial {
    /**
     * 팩토리얼 개수 구하기 (n!)
     * ex) 5! = 5 * 4 * 3 * 2 * 1
     */
    public static int execute(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * execute(n - 1);
    }
}
