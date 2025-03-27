import java.util.Arrays;

public class ArrayEnteros {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4};
        System.out.println(Kata.grow(numbers)); // Debería imprimir 24

        int[] numbers2 = {5, 6, 7};
        System.out.println(Kata.grow(numbers2)); // Debería imprimir 210

        int[] numbers3 = {1, -1, 2};
        System.out.println(Kata.grow(numbers3)); // Debería imprimir -2

        int[] emptyNumbers = {};
        System.out.println(Kata.grow(emptyNumbers)); // Debería imprimir 1 (producto neutro)
    }
}

class Kata {
    public static int grow(int[] numbers) {
        // Manejo de arreglo vacío
        if (numbers.length == 0) {
            return 1; // El producto de un arreglo vacío se puede considerar como 1
        }
        
        return Arrays.stream(numbers) // Crea un stream de los números
                     .reduce(1, (a, b) -> a * b); // Multiplica todos los elementos
    }
}