public class ATM {
    private double dineroEnATM;
    private BaseDeDatos cuentas;

    ATM (double dineroEnATM, BaseDeDatos cuentas) {
        this.dineroEnATM = dineroEnATM;
        this.cuentas = cuentas;
    }

    public double getDineroEnATM() {
        return dineroEnATM;
    }

    public void setDineroEnATM(double dineroEnATM) {
        this.dineroEnATM = dineroEnATM;
    }

    public BaseDeDatos getCuentas() {
        return cuentas;
    }

    public void setCuentas(BaseDeDatos cuentas) {
        this.cuentas = cuentas;
    }

    public boolean autenticarUsuario(){
        return true;
    }

    public double consultarSaldo () {
        return 1;
    }

    public double depositarSaldo () {
        return 1;
    }

    public double retirarEfectivo () {
        return 1;
    }

    @Override
    public String toString() {
        return " ";
    }
}
