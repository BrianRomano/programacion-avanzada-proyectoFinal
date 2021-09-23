public class Cuenta{
    // VARIABLES
    private int numeroDeCuenta;
    private Saldo saldoEnCuenta;
    private Retiro retiro;
    private Deposito deposito;

    // CONSTRUCTOR
    Cuenta (int numeroDeCuenta, double saldoEnCuenta) {
        setNumeroDeCuenta(numeroDeCuenta);
        this.saldoEnCuenta = new Saldo(saldoEnCuenta);
        retiro = new Retiro();
        deposito = new Deposito();
    }

    // GETTERS & SETTERS
    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public Saldo getSaldoEnCuenta() {
        return saldoEnCuenta;
    }

    // CONSULTAR SALDO DE CUENTA
    public double consultarSaldo(){
        return saldoEnCuenta.getSaldo();
    }

    // RETIRAR DINERO DE CUENTA
    public boolean retirarDinero(double monto) {
        return true;
    }

    // DEPOSITAR DINERO EN CUENTA
    public boolean depositarDinero(double monto) {
        return true;
    }
}