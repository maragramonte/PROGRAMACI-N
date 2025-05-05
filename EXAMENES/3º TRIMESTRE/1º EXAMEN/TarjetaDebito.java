public class TarjetaDebito extends Tarjeta {
    public TarjetaDebito(String numeroTarjeta, double saldoDisponible) {
        super(numeroTarjeta, saldoDisponible);
    }

    @Override
    public void calcularIntereses() {
        // Aplica interés fijo mensual básico sobre los cargos realizados
        double intereses = saldoDisponible * interesMensualBasico;
        añadir(-intereses); // Se resta porque son intereses a pagar
    }

    @Override
    public String toString() {
        return "Tarjeta Débito " + super.toString();
    }
}