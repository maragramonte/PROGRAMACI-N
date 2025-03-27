import java.util.Random;

public class NúmerosAleatoriosConSemilla {
    public static void main(String[] args) {
        long semilla = 12345L; // Puedes cambiar la semilla
        Random random = new Random(semilla);
        int cantidadNumeros = 10;

        System.out.println("Números aleatorios generados con semilla:");
        for (int i = 0; i < cantidadNumeros; i++) {
            int numeroAleatorio = random.nextInt(100);
            System.out.println(numeroAleatorio);
        }
    }
}