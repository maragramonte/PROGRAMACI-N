import java.util.*;

public class SunsetViews {
    public static int contarEdificiosConVista(int[] alturas) {
        int contador = 0;
        int alturaMaxima = 0;
        
        // Recorremos de derecha a izquierda (oeste a este)
        for (int i = alturas.length - 1; i >= 0; i--) {
            if (alturas[i] > alturaMaxima) {
                contador++;
                alturaMaxima = alturas[i];
            }
        }
        
        return contador;
    }

    public static void main(String[] args) {
        int[] alturas = {3, 7, 8, 3, 6, 1};
        System.out.println("Edificios con vistas al sol poniente: " + contarEdificiosConVista(alturas));
    }
}
