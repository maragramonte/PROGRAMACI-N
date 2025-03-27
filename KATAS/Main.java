import java.util.*;
public class Main {

    public static void main(String[] args) {
        int[][] arrayOpciones = {
                {1, 2},
                {4},
                {5, 6}
        };

        System.out.println("La cantidad de matrices únicas que se pueden formar es: " + contarCombinacionesUnicas(arrayOpciones));
    }

            public static int contarCombinacionesUnicas(int[][] arrays) {
                int cantidadTotal = 1;
        
                for (int i = 0; i < arrays.length; i++) {
                    int[] subarray = arrays[i]; //
                    int cont_opciones = 0;
                    int[] arrayOpciones = new int[subarray.length];
                    int opcionesSize = 0;
        
                    for (int j = 0; j < subarray.length; j++) {
                        int elemento = subarray[j]; // 
                        boolean existe = false;
        
                        for (int k = 0; k < opcionesSize; k++) {
                            if (arrayOpciones[k] == elemento) { //
                                existe = true;
                                break;
                            }
                        }
        
                        if (!existe) {
                            arrayOpciones[opcionesSize++] = elemento;
                            cont_opciones++;
                        }
                    }
        
                    cantidadTotal *= cont_opciones;
                }
                return cantidadTotal;
            }
}