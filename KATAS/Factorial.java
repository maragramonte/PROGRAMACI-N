public class Factorial {
    public static long factorial(int n) {
        // Caso base: el factorial de 0 o 1 es 1
        if (n <= 1) {
            return 1;
        } else {
            // Caso recursivo: n! = n * (n-1)!
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Factorial de 5: " + factorial(5)); // Salida esperada: 120
        System.out.println("Factorial de 0: " + factorial(0)); // Salida esperada: 1
    }
}