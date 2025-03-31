import java.util.ArrayList;
import java.util.List;

public class OrdenarMatrizRecursivo {

    // Método para ordenar una matriz bidimensional recursivamente
    public static void ordenarMatriz(int[][] matriz, boolean ascendente) {
        // Convertir la matriz en una lista de enteros
        List<Integer> lista = new ArrayList<>();
        for (int[] fila : matriz) {
            for (int valor : fila) {
                lista.add(valor);
            }
        }

        // Ordenar la lista usando QuickSort recursivo
        quickSort(lista, 0, lista.size() - 1, ascendente);

        // Reconstruir la matriz con los elementos ordenados
        int index = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = lista.get(index++);
            }
        }
    }

    // Implementación recursiva de QuickSort
    private static void quickSort(List<Integer> lista, int inicio, int fin, boolean ascendente) {
        if (inicio < fin) {
            int pivoteIndex = particion(lista, inicio, fin, ascendente);
            quickSort(lista, inicio, pivoteIndex - 1, ascendente); // Ordenar izquierda
            quickSort(lista, pivoteIndex + 1, fin, ascendente);   // Ordenar derecha
        }
    }

    // Método para dividir la lista y colocar el pivote en su posición correcta
    private static int particion(List<Integer> lista, int inicio, int fin, boolean ascendente) {
        int pivote = lista.get(fin);
        int i = inicio - 1;

        for (int j = inicio; j < fin; j++) {
            if ((ascendente && lista.get(j) <= pivote) || (!ascendente && lista.get(j) >= pivote)) {
                i++;
                // Intercambiar elementos
                int temp = lista.get(i);
                lista.set(i, lista.get(j));
                lista.set(j, temp);
            }
        }

        // Colocar el pivote en su posición correcta
        int temp = lista.get(i + 1);
        lista.set(i + 1, lista.get(fin));
        lista.set(fin, temp);

        return i + 1;
    }

    // Método para imprimir una matriz
    public static void imprimirMatriz(int[][] matriz) {
        for (int[] fila : matriz) {
            for (int valor : fila) {
                System.out.print(valor + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        // Ejemplo 1
        int[][] matriz1 = {
            {9, 8, 5},
            {4, 2, 1}
        };

        System.out.println("Matriz original 1:");
        imprimirMatriz(matriz1);

        ordenarMatriz(matriz1, false); // Orden descendente
        System.out.println("\nMatriz ordenada descendentemente:");
        imprimirMatriz(matriz1);

        // Ejemplo 2
        int[][] matriz2 = {
            {8, 1, 5},
            {4, 2, 10}
        };

        System.out.println("\nMatriz original 2:");
        imprimirMatriz(matriz2);

        ordenarMatriz(matriz2, true); // Orden ascendente
        System.out.println("\nMatriz ordenada ascendentemente:");
        imprimirMatriz(matriz2);
    }
}