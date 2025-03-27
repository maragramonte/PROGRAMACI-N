import java.util.Random;

public class NúmerosAleatoriosRango {
    public static void main(String[] args) {
        Random random = new Random();
        int cantidadNumeros = 10;

        System.out.println("Números aleatorios generados entre 50 y 150:");
        for (int i = 0; i < cantidadNumeros; i++) {
            int numeroAleatorio = 50 + random.nextInt(101); // 50 a 150
            System.out.println(numeroAleatorio);
        }
    }
}