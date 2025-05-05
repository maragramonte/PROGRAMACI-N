public abstract class Tarjeta {
    protected String numeroTarjeta;
    protected double saldoDisponible;
    protected static final double interesMensualBasico = 0.025; // 2.5%

    public Tarjeta(String numeroTarjeta, double saldoDisponible) {
        this.numeroTarjeta = numeroTarjeta;
        this.saldoDisponible = saldoDisponible;
    }

    // Getters
    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public double getSaldoDisponible() {
        return saldoDisponible;
    }

    // Métodos para operaciones
    public void realizarCargo(double cantidad) {
        if (cantidad > 0) {
            añadir(-cantidad);
        }
    }

    public void realizarAbono(double cantidad) {
        if (cantidad > 0) {
            añadir(cantidad);
        }
    }

    public void transferirSaldo(Tarjeta destino, double cantidad) {
        if (cantidad > 0 && this.saldoDisponible >= cantidad) {
            this.realizarCargo(cantidad);
            destino.realizarAbono(cantidad);
        }
    }

    protected void añadir(double cantidad) {
        this.saldoDisponible += cantidad;
    }

    // Método abstracto para calcular intereses
    public abstract void calcularIntereses();

    @Override
    public String toString() {
        return "Tarjeta Número: " + numeroTarjeta + " Saldo Disponible: " + saldoDisponible;
    }
}