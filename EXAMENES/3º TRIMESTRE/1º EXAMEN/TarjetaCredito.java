public class TarjetaCredito extends Tarjeta {
    public static final double saldoMinimo = 1000.0;

    public TarjetaCredito(String numeroTarjeta, double saldoDisponible) {
        super(numeroTarjeta, saldoDisponible);
    }

    @Override
    public void calcularIntereses() {
        double tasaInteres;
        
        if (saldoDisponible < saldoMinimo) {
            tasaInteres = interesMensualBasico * 2; // Doble del interés básico
        } else {
            tasaInteres = interesMensualBasico / 2; // Mitad del interés básico
        }
        
        double intereses = saldoDisponible * tasaInteres;
        añadir(-intereses); // Se resta porque son intereses a pagar
    }

    @Override
    public String toString() {
        return "Tarjeta Crédito " + super.toString();
    }
}