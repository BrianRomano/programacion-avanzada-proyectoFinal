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

    // CONSULTAR SALDO DE CUENTA
    public double consultarSaldo(){
        return saldoEnCuenta.getSaldo();
    }

    // RETIRAR DINERO DE CUENTA
    public boolean retirarDinero(double monto) {
        if(retiro.retirarDinero(consultarSaldo(), monto) > 0.0){
           saldoEnCuenta.setSaldo(retiro.retirarDinero(consultarSaldo(), monto));
        }
        return false;
    }

    // DEPOSITAR DINERO EN CUENTA
    public boolean depositarDinero(double monto) {
        if(deposito.depositarDinero(consultarSaldo(), monto) > 0.0) {
            saldoEnCuenta.setSaldo(deposito.depositarDinero(consultarSaldo(), monto));
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Numero de cuenta: " + numeroDeCuenta + saldoEnCuenta;
    }
}