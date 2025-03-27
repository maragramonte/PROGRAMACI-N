public class CombiMatriz {

    public static void main(String[] args) {
        String[][] matriz = {
            {"1","2"},
            {"4"},
            {"5","6"}
        };

        // Calcular el número total de combinaciones
        int totalCombinaciones = calcularTotalCombinaciones(matriz);
        String[][] combinaciones = new String[totalCombinaciones][matriz.length];
        
        // Generar combinaciones
        generarCombinaciones(matriz, 0, combinaciones, new String[matriz.length], 0);

        // Imprimir combinaciones
        for (int i = 0; i < totalCombinaciones; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(combinaciones[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static int calcularTotalCombinaciones(String[][] matriz) {
        int total = 1;
        for (String[] fila : matriz) {
            total *= fila.length;
        }
        return total;
    }

    private static void generarCombinaciones(String[][] matriz, int fila, String[][] combinaciones, String[] combinacionActual, int index) {
        // Si hemos llegado al final de la matriz, añadimos la combinación actual a la lista de combinaciones
        if (fila == matriz.length) {
            for (int i = 0; i < combinacionActual.length; i++) {
                combinaciones[index][i] = combinacionActual[i];
            }
            return;
        }

        // Iterar sobre cada elemento de la fila actual
        for (int i = 0; i < matriz[fila].length; i++) {
            combinacionActual[fila] = matriz[fila][i]; // Añadir el elemento actual a la combinación
            generarCombinaciones(matriz, fila + 1, combinaciones, combinacionActual, index + (int) Math.pow(matriz[fila].length, matriz.length - fila - 1)); // Llamada recursiva para la siguiente fila
        }
    }
}