public class ATM {
    // VARIABLES
    private Pantalla pantalla;
    private Teclado teclado;

    // CONSTRUCTOR
    ATM() {
        pantalla = new Pantalla();
        teclado = new Teclado();
    }

    // GETTERS & SETTERS

    public Pantalla getPantalla() {
        return pantalla;
    }

    public void setPantalla(Pantalla pantalla) {
        this.pantalla = pantalla;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public void setTeclado(Teclado teclado) {
        this.teclado = teclado;
    }

    // AUTENTICAR USUARIO
    public boolean autenticarUsuario(int numeroDeCuenta, int numeroDeIdentificacionPersonal) {
        System.out.println("AUTENTICAR USUARIO");
        return true;
    }

    // CONSULTAR SALDO
    public double consultarSaldo() {
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
}
