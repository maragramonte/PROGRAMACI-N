//GUERRA DE ALFABETOS
import java.util.*;

public class AlphabetsWar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Solicitar al usuario que ingrese dos letras
        System.out.println("¡Bienvenido a AlphabetsWar!");
        System.out.print("Por favor ingresa la primera letra: ");
        char letra1 = scanner.next().charAt(0); // Obtener un solo carácter
        
        System.out.print("Por favor ingresa la segunda letra: ");
        char letra2 = scanner.next().charAt(0); // Obtener un solo carácter
        
        // Verificar si las letras son iguales o no
        if (letra1 == letra2) {
            System.out.println("¡Las letras son iguales! ¡Empate!");
        } else {
            // Comparar cuál letra es 'mayor' o 'menor' en el alfabeto
            if (letra1 < letra2) {
                System.out.println("La letra '" + letra1 + "' es menor que '" + letra2 + "' en el alfabeto.");
            } else {
                System.out.println("La letra '" + letra1 + "' es mayor que '" + letra2 + "' en el alfabeto.");
            }
        }
        
        // Cerrar el scanner
        scanner.close();
    }
}