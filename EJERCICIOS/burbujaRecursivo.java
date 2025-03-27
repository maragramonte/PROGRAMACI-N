public class BurbujaRecursivo {

    public static void burbujaRecursivo(int[] arr, int n) {
        // Caso base: si el array tiene 1 o 0 elementos, ya está ordenado
        if (n == 1) {
            return;
        }

        // Realiza una pasada de burbuja
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                // Intercambia arr[i] y arr[i+1]
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
            }
        }

        // Llama recursivamente para ordenar el resto del array
        burbujaRecursivo(arr, n - 1);
    }

    public static void main(String[] args) {
        int[] arr = {64, 34, 25, 12, 22, 11, 90};
        System.out.println("Array original:");
        imprimirArray(arr);

        burbujaRecursivo(arr, arr.length);

        System.out.println("Array ordenado:");
        imprimirArray(arr);
    }

    // Método auxiliar para imprimir el array
    public static void imprimirArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}