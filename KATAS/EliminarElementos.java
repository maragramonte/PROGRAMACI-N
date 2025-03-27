import java.util.Arrays;
import java.util.Scanner;

public class EliminarElementos {
    public static void main(String[] args) {
        int[] numerosFavoritos = {6, 8, 9, 1, 3, 5};
        System.out.println("Números favoritos: " + Arrays.toString(numerosFavoritos));

        Scanner teclado = new Scanner(System.in);
        int posicion;

        while (true) {
            System.out.print("Introduce la posición que deseas eliminar (o un número negativo para salir): ");
            posicion = teclado.nextInt();

            // Salir si la posición es negativa
            if (posicion < 0) {
                break;
            }

            // Comprobar si la posición es válida
            if (posicion >= 0 && posicion < numerosFavoritos.length) {
                numerosFavoritos = eliminarElemento(numerosFavoritos, posicion);
                System.out.println("Números después de la eliminación: " + Arrays.toString(numerosFavoritos));
            } else {
                System.out.println("No existe la posición.");
            }
        }

        System.out.println("Programa terminado.");
        teclado.close();
    }

    // Método para eliminar un elemento en la posición dada
    public static int[] eliminarElemento(int[] array, int posicion) {
        int[] nuevoArray = new int[array.length - 1];
        for (int i = 0, j = 0; i < array.length; i++) {
            if (i != posicion) {
                nuevoArray[j++] = array[i];
            }
        }
        return nuevoArray;
    }
}