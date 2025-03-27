public class NumerosAleatorios {
    public static void main(String[] args) {
        // Crear una lista para almacenar los 100 numeros aleatorios
        List<Integer> numeros = new ArrayList<>(100);
        Random random = new Random();

        // Generar 100 numeros aleatorios entre 0 y 20
        for (int i = 0; i < 100; i++) {
            numeros.add(random.nextInt(101)); // 101 es exclusivo, por lo que genera numeros entre 0 y 100
        }

        // Mostrar los numeros generados separados por espacios
        System.out.println(numeros);

        // Solicitar al usuario los dos numeros a cambiar
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce el primer numero (a cambiar): ");
        int numero1 = scanner.nextInt();
        System.out.print("Introduce el segundo numero (nuevo valor): ");
        int numero2 = scanner.nextInt();

        // Realizar el cambio de numeros
        realizarCambio(numeros, numero1, numero2);

        // Mostrar la lista después de los cambios
        System.out.println("Numeros despues de realizar los cambios:");
        for (Integer numero : numeros) {
            if (numero == numero2) {
                System.out.print("\"" + numero + "\", "); // Mostrar el numero cambiado entrecomillado
            } else {
                System.out.print(numero + ", ");
            }
        }
        scanner.close();
    }
    // Método que realiza el cambio en la lista
    public static void realizarCambio(List<Integer> numeros, int numero1, int numero2) {
        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) == numero1) {
                numeros.set(i, numero2); // Cambiar el valor en la lista
            }
        }
    }
}