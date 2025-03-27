import java.util.HashMap;
import java.util.Map;

public class Factorial2 {
    private static Map<Integer, Long> memo = new HashMap<>();

    public static long factorial(int n) {
        if (n <= 1) {
            return 1;
        }
        if (memo.containsKey(n)) {
            return memo.get(n);
        }
        long resultado = n * factorial(n - 1);
        memo.put(n, resultado);
        return resultado;
    }

    public static void main(String[] args) {
        System.out.println("Factorial de 5: " + factorial(5)); // Salida esperada: 120
        System.out.println("Factorial de 0: " + factorial(0)); // Salida esperada: 1
    }
// }