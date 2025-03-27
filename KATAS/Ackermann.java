public class Solution {

    public static Integer Ackermann(int m, int n) {
        // Verificar si los valores son no negativos y enteros
        if (m < 0 || n < 0) {
            return null;
        }

        // Calcular la función de Ackermann
        return ackermannHelper(m, n);
    }

    private static Integer ackermannHelper(int m, int n) {
        if (m == 0) {
            return n + 1;
        } else if (m > 0 && n == 0) {
            return ackermannHelper(m - 1, 1);
        } else if (m > 0 && n > 0) {
            return ackermannHelper(m - 1, ackermannHelper(m, n - 1));
        }
        return null; // Este caso no debería ocurrir si las entradas son válidas
    }

    public static void main(String[] args) {
        // Pruebas
        System.out.println(Ackermann(1, 1)); // Debería imprimir 3
        System.out.println(Ackermann(4, 0)); // Debería imprimir 13
        System.out.println(Ackermann(-1, 1)); // Debería imprimir null
        System.out.println(Ackermann(1, -1)); // Debería imprimir null
    }
}