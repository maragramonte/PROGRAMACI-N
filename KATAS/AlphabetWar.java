import java.util.*;

public class AlphabetWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continuar = true;

        System.out.println("¡Bienvenido a AlphabetsWar!");
        
        // Bucle para que el usuario pueda jugar varias rondas
        while (continuar) {
            System.out.print("Por favor ingresa la primera letra: ");
            char letra1 = obtenerLetra(scanner);  // Llamada a función para validar y obtener la letra

            System.out.print("Por favor ingresa la segunda letra: ");
            char letra2 = obtenerLetra(scanner);  // Llamada a función para validar y obtener la letra

            // Comparar las letras basándonos en su valor ASCII
            if (letra1 == letra2) {
                System.out.println("¡Las letras son iguales! ¡Empate!");
            } else if (letra1 < letra2) {
                System.out.println("La letra '" + letra1 + "' es menor que '" + letra2 + "' en el alfabeto.");
            } else {
                System.out.println("La letra '" + letra1 + "' es mayor que '" + letra2 + "' en el alfabeto.");
            }

            // Preguntar al usuario si desea continuar
            System.out.print("¿Quieres jugar otra ronda? (sí/no): ");
            String respuesta = scanner.next();
            if (respuesta.equalsIgnoreCase("no")) {
                continuar = false;
            }
        }
        
        System.out.println("¡Gracias por jugar AlphabetsWar!");
        scanner.close();
    }

    // Método para validar que la entrada sea una letra
    private static char obtenerLetra(Scanner scanner) {
        char letra;
        while (true) {
            String input = scanner.next();
            if (input.length() == 1 && Character.isLetter(input.charAt(0))) {
                letra = input.charAt(0);
                break;
            } else {
                System.out.print("Entrada no válida. Por favor ingresa una letra: ");
            }
        }
        return letra;
    }
}