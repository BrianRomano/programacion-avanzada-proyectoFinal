public class Cuenta extends Cliente{
    private int numeroDeCuenta;
    private int numeroDeIdentificacionPersonal;
    private double saldoEnCuenta;

    Cuenta (String nombre, String apellido, int documento, int numeroDeCuenta, int numeroDeIdentificacionPersonal, double saldoEnCuenta) {
        super(nombre, apellido, documento);
        this.numeroDeCuenta = numeroDeCuenta;
        this.numeroDeIdentificacionPersonal = numeroDeIdentificacionPersonal;
        this.saldoEnCuenta = saldoEnCuenta;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public int getNumeroDeIdentificacionPersonal() {
        return numeroDeIdentificacionPersonal;
    }

    public void setNumeroDeIdentificacionPersonal(int numeroDeIdentificacionPersonal) {
        this.numeroDeIdentificacionPersonal = numeroDeIdentificacionPersonal;
    }

    public double getSaldoEnCuenta() {
        return saldoEnCuenta;
    }

    public void setSaldoEnCuenta(double saldoEnCuenta) {
        this.saldoEnCuenta = saldoEnCuenta;
    }

    @Override
    public String toString() { return "Numero de cuenta: " + numeroDeCuenta + "\nNumero de identificacion personal: " + numeroDeIdentificacionPersonal + "\nSaldo en cuenta:" + saldoEnCuenta; }
}