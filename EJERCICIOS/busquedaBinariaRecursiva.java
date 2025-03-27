public class BusquedaBinariaRecursiva {

    public static int busquedaBinariaRecursiva(int[] arr, int target, int izquierda, int derecha) {
        // Caso base: el elemento no está en el array
        if (izquierda > derecha) {
            return -1;
        }

        // Calcula el punto medio
        int medio = izquierda + (derecha - izquierda) / 2;

        // Si el elemento está en el medio, retorna su índice
        if (arr[medio] == target) {
            return medio;
        }

        // Si el elemento es menor que el medio, busca en la mitad izquierda
        if (arr[medio] > target) {
            return busquedaBinariaRecursiva(arr, target, izquierda, medio - 1);
        }

        // Si el elemento es mayor que el medio, busca en la mitad derecha
        return busquedaBinariaRecursiva(arr, target, medio + 1, derecha);
    }

    public static void main(String[] args) {
        int[] arr = {2, 5, 8, 12, 16, 23, 38, 56, 72, 91};
        int target = 23;

        System.out.println("Array:");
        imprimirArray(arr);

        int resultado = busquedaBinariaRecursiva(arr, target, 0, arr.length - 1);

        if (resultado != -1) {
            System.out.println("Elemento " + target + " encontrado en el índice " + resultado);
        } else {
            System.out.println("Elemento " + target + " no encontrado.");
        }
    }

    // Método auxiliar para imprimir el array
    public static void imprimirArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}