import java.util.Random;

public class NúmerosAleatoriosUnicos {
    public static void main(String[] args) {
        Random random = new Random();
        int cantidadNumeros = 10;
        int[] numerosGenerados = new int[cantidadNumeros];

        for (int i = 0; i < cantidadNumeros; ) {
            int numeroAleatorio = random.nextInt(100); // Generar un número entre 0 y 99
            boolean esUnico = true;

            // Verificar si el número ya fue generado
            for (int j = 0; j < i; j++) {
                if (numerosGenerados[j] == numeroAleatorio) {
                    esUnico = false;
                    break;
                }
            }

            // Si el número es único, se agrega al array
            if (esUnico) {
                numerosGenerados[i] = numeroAleatorio;
                System.out.println(numeroAleatorio);
                i++;
            }
        }
    }
}