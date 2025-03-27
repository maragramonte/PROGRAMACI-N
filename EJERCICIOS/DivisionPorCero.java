import java.util.Scanner;

public class DivisionPorCero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el numerador: ");
        int numerador = scanner.nextInt();
        System.out.print("Ingrese el denominador: ");
        int denominador = scanner.nextInt();
        try {
            int resultado = numerador / denominador;
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero.");
        }
    }
}

/* import java.util.Scanner;

public class DivisionPorCero {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean entradaValida = false;
        int numerador = 0, denominador = 0;

        while (!entradaValida) {
            try {
                System.out.print("Ingrese el numerador: ");
                numerador = scanner.nextInt();
                System.out.print("Ingrese el denominador: ");
                denominador = scanner.nextInt();
                int resultado = numerador / denominador;
                System.out.println("Resultado: " + resultado);
                entradaValida = true;
            } catch (ArithmeticException e) {
                System.out.println("Error: División por cero. Intente nuevamente.");
            } catch (Exception e) {
                System.out.println("Error: Entrada inválida. Intente nuevamente.");
                scanner.next(); // Limpiar el buffer del scanner
            }
        }
    }
} */