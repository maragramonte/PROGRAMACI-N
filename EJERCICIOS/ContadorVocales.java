import java.util.Scanner;

public class ContadorVocales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena: ");
        String cadena = scanner.nextLine();
        int contador = 0;
        for (char c : cadena.toCharArray()) {
            if (esVocal(c)) {
                contador++;
            }
        }
        System.out.println("Número de vocales: " + contador);
    }

    private static boolean esVocal(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
}

/* import java.util.Scanner;

public class ContadorVocales {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese una cadena: ");
        String cadena = scanner.nextLine();
        long contador = cadena.chars().filter(c -> esVocal((char) c)).count();
        System.out.println("Número de vocales: " + contador);
    }

    private static boolean esVocal(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }
} */