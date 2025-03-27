import java.util.Scanner;

public class Multiple {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero = 0;
        int limite = 0;
        String direccion = "";

        // Solicitar número
        System.out.print("Ingrese un número: ");
        numero = scanner.nextInt();

        // Solicitar límite superior
        System.out.print("Ingrese el límite superior (hasta qué número mostrar los múltiplos): ");
        limite = scanner.nextInt();

        // Solicitar la dirección de los múltiplos
        System.out.print("¿Desea los múltiplos en orden ascendente o descendente? (asc/desc): ");
        direccion = scanner.next().toLowerCase();

        // Mostrar los múltiplos en la dirección seleccionada
        System.out.println("Los múltiplos de " + numero + " hasta " + limite + " son:");
        if (direccion.equals("asc")) {
            for (int i = 1; numero * i <= limite; i++) {
                System.out.println(numero * i);
            }
        } else if (direccion.equals("desc")) {
            for (int i = limite / numero; i >= 1; i--) {
                System.out.println(numero * i);
            }
        } else {
            System.out.println("Dirección no válida. Se utilizará el orden ascendente por defecto.");
            for (int i = 1; numero * i <= limite; i++) {
                System.out.println(numero * i);
            }
        }

        scanner.close();
    }
}