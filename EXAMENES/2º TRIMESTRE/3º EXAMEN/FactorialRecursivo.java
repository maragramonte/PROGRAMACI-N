public class FactorialRecursivo {
    
    // Método recursivo para calcular el factorial de un número
    public static int factorial(int n) {
        if (n == 0 || n == 1) { 
            return 1; // Caso base: factorial(0) = factorial(1) = 1
        }
        return n * factorial(n - 1); // Llamada recursiva
    }

    public static void main(String[] args) {
        System.out.println("Factorial de 5: " + factorial(5));  // 120
        System.out.println("Factorial de 7: " + factorial(7));  // 5040
        System.out.println("Factorial de 0: " + factorial(0));  // 1
    }
}