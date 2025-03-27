import java.util.Scanner;

public class Multiples {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueProgram = true;

        while (continueProgram) {
            System.out.print("Ingrese un número: ");
            int number = scanner.nextInt();
            System.out.print("Ingrese el límite superior: ");
            int limit = scanner.nextInt();

            printMultiples(number, limit);

            System.out.print("¿Quieres calcular los múltiplos de otro número? (s/n): ");
            char response = scanner.next().charAt(0);
            continueProgram = (response == 's' || response == 'S');
        }

        scanner.close();
    }

    private static void printMultiples(int number, int limit) {
        System.out.println("Múltiplos de " + number + " hasta " + limit + ":");
        for (int i = 1; i * number <= limit; i++) {
            System.out.println(i * number);
        }
    }
}