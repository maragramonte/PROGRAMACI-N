import java.util.*;

public class HextoDecimal {
    public static void main(String args[]) {
        // Inicializa la variable hex con un valor hexadecimal válido
        String hex = "1A3F"; // Ejemplo de valor hexadecimal
        // Convierte el hexadecimal a decimal
        int decimal = Integer.parseInt(hex, 16);
        // Imprime el resultado
        System.out.println(decimal);
    }
}