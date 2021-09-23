public class Retiro {
    Retiro () {}

    public double retirarDinero(double saldo, double monto) {
        if(saldo > monto) {
            return saldo - monto;
        } else {
            return 0.0;
        }
    }
}
