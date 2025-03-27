import java.util.Random;

public class NumerosAleatorios {
    public static void main(String[] args) {
        // Crear una instancia de Random
        Random random = new Random();
        
        // Definir cuántos números aleatorios quieres generar
        int cantidadNumeros = 10;

        System.out.println("Números aleatorios generados:");
        for (int i = 0; i < cantidadNumeros; i++) {
            // Generar un número aleatorio entre 0 y 99
            int numeroAleatorio = random.nextInt(100);
            System.out.println(numeroAleatorio);
        }
    }
}