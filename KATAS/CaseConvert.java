import java.util.Scanner;

public class CaseConvert {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese un texto
        System.out.println("Debe ingresar un texto:");
        String input = scanner.nextLine();

        // Convertir el texto a mayúsculas
        String upperCase = input.toUpperCase();
        System.out.println("En mayúsculas: " + upperCase);

        // Convertir el texto a minúsculas
        String lowerCase = input.toLowerCase(); 
        System.out.println("En minúsculas: " + lowerCase);

        // Cerrar el scanner para evitar fugas de recursos
        scanner.close();
    }
}
