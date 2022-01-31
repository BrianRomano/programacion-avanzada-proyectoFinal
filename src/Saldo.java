public class Saldo {
    private double saldo;

    Saldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double monto) {
        if (monto > 0.0) {
            this.saldo = monto;
        }
    }

    @Override
    public String toString() {
        return "\nSaldo: $" + saldo;
    }
}
