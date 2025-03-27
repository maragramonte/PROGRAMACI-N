import java.util.*;

public class CombinacionesMatrices {
    
    public static int solve(int[][] matrices) {
        // Contamos el número de combinaciones únicas
        List<int[]> combinaciones = new ArrayList<>();
        
        // Generar todas las combinaciones posibles
        generarCombinaciones(matrices, 0, new int[matrices.length], combinaciones);
        
        // Eliminar duplicados manualmente
        return contarCombinacionesUnicas(combinaciones);
    }

    // Función recursiva para generar todas las combinaciones
    private static void generarCombinaciones(int[][] matrices, int indice, int[] combinacionActual, List<int[]> combinaciones) {
        // Si hemos llenado todas las posiciones en la combinación, la agregamos
        if (indice == matrices.length) {
            combinaciones.add(combinacionActual.clone()); // Agregar copia de la combinación
            return;
        }

        // Iterar sobre los elementos de la submatriz en la posición "indice"
        for (int i = 0; i < matrices[indice].length; i++) {
            combinacionActual[indice] = matrices[indice][i];
            generarCombinaciones(matrices, indice + 1, combinacionActual, combinaciones);
        }
    }

    // Función para contar combinaciones únicas eliminando duplicados
    private static int contarCombinacionesUnicas(List<int[]> combinaciones) {
        // Lista para almacenar combinaciones únicas
        List<int[]> combinacionesUnicas = new ArrayList<>();
        
        for (int[] combinacion : combinaciones) {
            // Si la combinación no existe ya en la lista de combinaciones únicas, la agregamos
            boolean esUnica = true;
            for (int[] c : combinacionesUnicas) {
                if (Arrays.equals(combinacion, c)) {
                    esUnica = false;
                    break;
                }
            }
            if (esUnica) {
                combinacionesUnicas.add(combinacion);
            }
        }
        
        // Retornar la cantidad de combinaciones únicas
        return combinacionesUnicas.size();
    }

    public static void main(String[] args) {
        // Ejemplo de prueba 1
        int[][] matrices1 = {
            {1, 2},
            {4},
            {5, 6}
        };

        // Ejemplo de prueba 2
        int[][] matrices2 = {
            {1, 2},
            {4, 4},
            {5, 6, 6}
        };

        System.out.println("Número de combinaciones únicas (matrices1): " + solve(matrices1)); // Salida: 4
        System.out.println("Número de combinaciones únicas (matrices2): " + solve(matrices2)); // Salida: 4
    }
}