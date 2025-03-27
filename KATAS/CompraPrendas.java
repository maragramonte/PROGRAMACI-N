import java.util.Scanner;

public class CompraPrendas {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Solicitar el número de prendas
        System.out.print("Número de prendas: ");
        int numPrendas = input.nextInt();

        // Solicitar el importe sin descuento
        System.out.print("Importe sin descuento: ");
        float importeInicial = input.nextFloat();

        // Calcular el importe final utilizando un método
        float importeFinal = calcularImporteFinal(numPrendas, importeInicial);

        // Mostrar el total de la compra
        System.out.printf("El total de la compra es: %.2f\n", importeFinal);

        // Cerrar el escáner
        input.close();
    }

    // Método para calcular el importe final
    public static float calcularImporteFinal(int numPrendas, float importeInicial) {
        final int DESCUENTO1 = 25; // Descuento del 25% para 3 o menos prendas
        final int DESCUENTO2 = 50;  // Descuento del 50% para más de 3 prendas

        float importeDescontado;

        // Calcular el importe descontado según el número de prendas
        if (numPrendas <= 3) {
            importeDescontado = importeInicial * DESCUENTO1 / 100.0f;
        } else {
            importeDescontado = importeInicial * DESCUENTO2 / 100.0f;
        }

        // Calcular y devolver el importe final
        return importeInicial - importeDescontado;
    }
}