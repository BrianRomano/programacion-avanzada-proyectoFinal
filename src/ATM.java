import java.util.ArrayList;

public class ATM {
    // VARIABLES
    private double dineroEnATM = 0.0;
    public ArrayList<Cuenta> Cuentas = new ArrayList<Cuenta>();

    // CONSTRUCTOR
    ATM() {
    }

    // GETTERS & SETTERS
    public double getDineroEnATM() {
        return dineroEnATM;
    }

    public void setDineroEnATM(double dineroEnATM) {
        this.dineroEnATM = dineroEnATM;
    }

    // AUTENTICAR USUARIO
    public boolean autenticarUsuario(int numeroDeCuenta, int numeroDeIdentificacionPersonal) {
        for (Cuenta cuenta : Cuentas) {
            if (cuenta.getNumeroDeCuenta() == numeroDeCuenta && cuenta.getNumeroDeIdentificacionPersonal() == numeroDeIdentificacionPersonal) {
                System.out.println("Bienvenido " + cuenta.getNombre() + " " + cuenta.getApellido());
                return true;
            } else {
                System.out.println("!ERROR. Por favor ingrese un numero de cuenta o nip valido.");
                System.out.println("____________________________________________________________________________");
                return false;
            }
        }
        return false;
    }

    // CONSULTAR SALDO
    public double consultarSaldo(int numeroDeCuenta, int numeroDeIdentificacionPersonal) {
        System.out.println("CONSULTAR SALDO");
        return 1.1;
    }

    // RETIRAR DINERO
    public double retirarDinero(int numeroDeCuenta, int numeroDeIdentificacionPersonal, double dineroARetirar) {
        System.out.println("RETIRAR SALDO");
        return 1.1;
    }

    // DEPOSITAR DINERO
    public double depositarDinero(int numeroDeCuenta, int numeroDeIdentificacionPersonal, double dineroARetirar) {
        System.out.println("DEPOSITAR SALDO");
        return 1.1;
    }

    // DISPENSAR EFECTIVO EN EL ATM
    public boolean ingresarEfectivoEnATM(int cantidadBilletes, int billete) {
        setDineroEnATM(getDineroEnATM() + (cantidadBilletes * billete));
        return true;
    }
}
