import java.util.Arrays;
import java.util.Scanner;

public class RotarArray {

    /*
     * Escribe un programa que lea 15 números por teclado y que los almacene en un
     * array. Rota los elementos de ese array, es decir, el elemento de la posición 0
     * debe pasar a la posición 1, el de la 1 a la 2, etc. El número que se
     * encuentra en la última posición debe pasar a la posición 0. Finalmente,
     * muestra el contenido del array.
     */

    // Método para iniciar el array introducido por usuario

    public static int[] obtenerArray(Scanner teclado) {

        System.out.println("Introduce los 15 números del array. ");

        int numeros[] = new int[15];

        for (int contador = 0; contador < numeros.length; contador++) {
            System.out.print("Introduce el número " + (contador + 1) + ": ");
            numeros[contador] = teclado.nextInt();
        }
        return numeros;
    }

    // Método para rotar el array

    public static int[] rotarArray(int[] numeros) {

        int resultado[] = new int[numeros.length]; // Inicializamos el array
        resultado[0] = numeros[numeros.length - 1]; // La última posición pasa a la primera

        for (int contador = 1; contador < numeros.length; contador++) {
            resultado[contador] = numeros[contador - 1];
        }
        return resultado;
    }

    // Método para mostar los arrays

    public static void mostrarArrays(Scanner teclado) {

        int[] numeros = obtenerArray(teclado);

        System.out.println("Array original: " + Arrays.toString(numeros));
        System.out.println("Array rotado: " + Arrays.toString(rotarArray(numeros)));
    }

    // Método principal

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        mostrarArrays(teclado);
        teclado.close();
    }
}