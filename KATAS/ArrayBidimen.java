import java.util.*;

public class ArrayBidimen {
    public static void main(String[] args) throws InterruptedException { 
        // Declaramos y llenamos el array bidimensional
        int[][] n = new int[3][2]; // array de 3 filas por 2 columnas
        
        n[0][0] = 20;
        n[1][0] = 67;
        n[1][1] = 33;
        n[2][1] = 7;
        n[0][1] = 12;
        n[2][0] = 5;

        // Variables para recorrer las filas y columnas
        int fila, columna;

        // Recorrer el array bidimensional e imprimir sus valores
        for (fila = 0; fila < 3; fila++) {
            System.out.print("Fila " + fila + ": ");
            
            for (columna = 0; columna < 2; columna++) {
                // Usamos printf para un formato alineado de los números
                System.out.printf("%8d ", n[fila][columna]);
                Thread.sleep(1000); // Retardo de 1 segundo
            }
            System.out.println(); // Nueva línea después de imprimir cada fila
        }
    }
}