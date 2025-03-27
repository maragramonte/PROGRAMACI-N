import java.util.Scanner;

public class MaxMinNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        
        // Solicitar 10 números al usuario
        System.out.println("Por favor, ingresa 10 números:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
        }

        // Calcular máximo y mínimo
        int maximo = numeros[0];
        int minimo = numeros[0];
        
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maximo) {
                maximo = numeros[i];
            }
            if (numeros[i] < minimo) {
                minimo = numeros[i];
            }
        }

        // Mostrar los números junto con el máximo y mínimo
        System.out.println("Los números ingresados son:");
        for (int numero : numeros) {
            System.out.println(numero);
        }
        
        System.out.println("Máximo: " + maximo);
        System.out.println("Mínimo: " + minimo);
        
        // Cerrar el escáner
        scanner.close();
    }
}