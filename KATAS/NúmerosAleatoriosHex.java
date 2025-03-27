import java.util.Random;

public class NúmerosAleatoriosHex {
    public static void main(String[] args) {
        Random random = new Random();
        int cantidadNumeros = 10;

        System.out.println("Números aleatorios en formato hexadecimal:");
        for (int i = 0; i < cantidadNumeros; i++) {
            int numeroAleatorio = random.nextInt(256); // Generar un número entre 0 y 255
            String numeroHex = Integer.toHexString(numeroAleatorio).toUpperCase();
            System.out.println(numeroHex);
        }
    }
}