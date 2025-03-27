import java.util.Scanner;

public class Operacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Leer los dos números y la operación
        System.out.print("Introduce el primer valor: ");
        double valor1 = scanner.nextDouble();
        
        System.out.print("Introduce el segundo valor: ");
        double valor2 = scanner.nextDouble();
        
        System.out.print("Introduce la operación (+, -, *, /): ");
        String operacion = scanner.next();

        // Realizar la operación según la entrada
        double resultado = 0;
        boolean esOperacionValida = true;

        if (operacion.equals("+")) {
            resultado = valor1 + valor2;
        } else if (operacion.equals("-")) {
            resultado = valor1 - valor2;
        } else if (operacion.equals("*")) {
            resultado = valor1 * valor2;
        } else if (operacion.equals("/")) {
            if (valor2 != 0) {
                resultado = valor1 / valor2;
            } else {
                esOperacionValida = false;
                System.out.println("Error: No se puede dividir por cero.");
            }
        } else {
            esOperacionValida = false;
            System.out.println("Operación no válida.");
        }

        // Si la operación fue válida, mostramos el resultado
        if (esOperacionValida) {
            System.out.println("El resultado es: " + resultado);
        }

        // Cerrar el scanner
        scanner.close();
    }
}
