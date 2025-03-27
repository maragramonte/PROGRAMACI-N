public class EdificiosVistaSolPoniente {

    public static int contarEdificiosConVista(int[] alturas) {
        if (alturas == null || alturas.length == 0) {
            return 0;
        }

        int contador = 0;
        int maxAltura = 0;

        // Recorremos el array de derecha a izquierda (oeste a este)
        for (int i = alturas.length - 1; i >= 0; i--) {
            if (alturas[i] > maxAltura) {
                contador++;
                maxAltura = alturas[i];
            }
        }

        return contador;
    }

    public static void main(String[] args) {
        int[] alturas = {3, 7, 8, 3, 6, 1};
        int resultado = contarEdificiosConVista(alturas);
        System.out.println("Número de edificios con vista al sol poniente: " + resultado);
    }
}

/* public class EdificiosVistaSolPoniente {

    public static int contarEdificiosConVista(int[] alturas) {
        if (alturas == null || alturas.length == 0) {
            return 0;
        }

        int contador = 0;
        int maxAltura = 0;

        // Recorremos el array de derecha a izquierda (oeste a este)
        for (int i = alturas.length - 1; i >= 0; i--) {
            if (alturas[i] < 0) {
                throw new IllegalArgumentException("Las alturas deben ser números positivos.");
            }
            if (alturas[i] > maxAltura) {
                contador++;
                maxAltura = alturas[i];
            }
        }

        return contador;
    }

    public static void main(String[] args) {
        int[] alturas = {3, 7, 8, 3, 6, 1};
        try {
            int resultado = contarEdificiosConVista(alturas);
            System.out.println("Número de edificios con vista al sol poniente: " + resultado);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
} */