public class ProgramaPrincipal {
    public static void main(String[] args) {
        // Crear tarjetas
        TarjetaDebito debito = new TarjetaDebito("458796547852", 1000.0);
        TarjetaCredito credito = new TarjetaCredito("789456123654", 3010.0);

        // Mostrar datos iniciales
        System.out.println("--- Mostramos datos de las tarjetas ---");
        System.out.println(debito);
        System.out.println(credito);

        // Realizar operaciones
        debito.realizarAbono(1000.0);
        credito.realizarCargo(500.0);

        // Mostrar datos después de operaciones
        System.out.println("\n--- Realizamos cargos, abonos y mostramos ---");
        System.out.println(debito);
        System.out.println(credito);

        // Aplicar intereses
        debito.calcularIntereses();
        credito.calcularIntereses();

        // Mostrar datos finales
        System.out.println("\n--- Aplicamos intereses ---");
        System.out.println(debito);
        System.out.println(credito);
    }
}