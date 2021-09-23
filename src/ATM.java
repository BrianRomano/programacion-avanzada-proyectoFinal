public class ATM {
    // VARIABLES
    private Banco banco;
    private Pantalla pantalla;
    private Teclado teclado;
    private Cliente cliente;
    private Dispensador dispensador;

    // CONSTRUCTOR
    ATM() {
        banco = new Banco();
        pantalla = new Pantalla();
        teclado = new Teclado();
        dispensador = new Dispensador();
    }

    // GETTERS & SETTERS
    public Banco getBanco() {
        return banco;
    }

    public Pantalla getPantalla() {
        return pantalla;
    }

    public Teclado getTeclado() {
        return teclado;
    }

    public Dispensador getDispensador() {
        return dispensador;
    }

    // AUTENTICAR USUARIO
    public boolean autenticarUsuario(int numeroDeCuenta, int numeroDeIdentificacionPersonal) {
        int contador = 0;
        Cliente cliente;
        do {
            cliente = banco.getCliente(contador);
            if (cliente.getCuenta().getNumeroDeCuenta() == numeroDeCuenta) {
                if (cliente.getNIP() == numeroDeIdentificacionPersonal) {
                    // ASIGNAR CLIENTE
                    this.cliente = cliente;
                    // MOSTRAR MENSAJE DE BIENVENIDA
                    getPantalla().mensajeBienvenidaClienteAutenticado(cliente.getNombre(), cliente.getApellido());
                    return true;
                } else {
                    contador++;
                }
            } else {
                contador++;
            }
        } while (contador != banco.getCantidadDeClientes());
        // MOSTRAR MENSAJE DE ERROR
        getPantalla().mensajeErrorAlAutenticar();
        return false;
    }

    // CONSULTAR SALDO
    public double consultarSaldo() {
        return this.cliente.getCuenta().consultarSaldo();
    }

    // RETIRAR DINERO
    public boolean retirarDinero(double monto) {
        if (this.cliente.getCuenta().retirarDinero(monto)) {
            getDispensador().retirarDinero(monto);
            return true;
        }
        return false;
    }

    // DEPOSITAR DINERO
    public boolean depositarDinero(double monto) {
        this.cliente.getCuenta().depositarDinero(monto);
        return false;
    }
}
