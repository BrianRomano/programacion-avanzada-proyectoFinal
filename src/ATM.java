public class ATM {
    // VARIABLES
    private final Pantalla pantalla;
    private final Teclado teclado;
    private final Dispensador dispensador;
    private final Banco banco;
    private Cliente cliente;

    // CONSTRUCTOR
    ATM() {
        banco = new Banco();
        pantalla = new Pantalla();
        teclado = new Teclado();
        dispensador = new Dispensador();
    }

    // GETTERS
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
                    // MOSTRAR MENSAJE DE BIENVENIDA AL CLIENTE
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
        if (monto > getDispensador().cantidadDeDinero()) {
            getPantalla().mensajeDineroNoDisponible();
            return false;
        }
        if (this.cliente.getCuenta().retirarDinero(monto)) {
            getDispensador().retirarDinero(monto);
            getPantalla().dineroRetirado(monto);
            return true;
        }
        getPantalla().mensajeDineroNoSuficiente();
        return false;
    }

    // DEPOSITAR DINERO
    public boolean depositarDinero(double monto) {
        if (monto <= 0.0) {
            getPantalla().mensajeErrorDepositoNoPermitido();
            return false;
        }
        this.cliente.getCuenta().depositarDinero(monto);
        getPantalla().dineroDepositado(monto);
        return true;
    }
}
