public class Fibonacci {
    public static long fib(int n) {
        long answer = 0;
        long a = 0;
        long b = 1;
        if (n == 0) {
            answer = 0;
        } else if (n == 1) {
            answer = 1;
        } else {
            for (int i = 2; i <= n; i++) {
                answer = a + b;
                a = b;
                b = answer;
            }
        }
        return answer;
    }
}