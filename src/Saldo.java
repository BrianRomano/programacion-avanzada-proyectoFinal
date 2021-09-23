public class Saldo {
    private double saldo;

    Saldo (double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double monto) {
        if(monto > 0.0) {
            saldo = monto;
        } else {
            System.out.println("!ERROR. El monto debe ser mayor a $0.0");
        }
    }

    @Override
    public String toString() {
        return "\nSaldo: $" + saldo;
    }
}
