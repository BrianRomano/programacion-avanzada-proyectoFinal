public class Pantalla {

    public Pantalla() {
    }

    // MENSAJES DE BIENVENIDA Y DESPEDIDA
    public void mensajeBienvenida() {
        System.out.println("\n*************** BIENVENIDO ***************");
    }

    public void mensajeBienvenidaClienteAutenticado(String nombre, String apellido) {
        System.out.println("\n********** BIENVENIDO " + nombre.toUpperCase() + " " + apellido.toUpperCase() + " **********");
    }

    public void mensajeDeDespedida() {
        System.out.println("Muchas gracias. Vuelva pronto.");
    }

    // INTERACCIONES
    public void mensajeNumeroDeCuenta() {
        System.out.print("\n# Por favor introduzca su numero de cuenta: ");
    }

    public void mensajeNumeroDeIdentificacionPersonal() {
        System.out.print("\n# Por favor introduzca su numero de identificacion personal: ");
    }

    public void menuPrincipal() {
        System.out.println("\n***** MENÚ PRINCIPAL *****");
        System.out.println("[1] Consultar saldo");
        System.out.println("[2] Retirar efectivo");
        System.out.println("[3] Depositar efectivo");
        System.out.println("[4] Salir");
        System.out.print("\n# Elija una opción: ");
    }

    public void mensajeDineroARetirar() {
        System.out.print("# Ingrese la cantidad de dinero a retirar: $");
    }

    public void mensajeDineroADepositar() {
        System.out.print("# Ingrese la cantidad de dinero a depositar: $");
    }

    public void mensajeConsultaDeSaldo(double saldo) {
        System.out.println("El saldo en su cuenta es: $" + saldo);
    }

    // MENSAJES DE DEPOSITO Y RETIRO
    public void dineroDepositado(double monto){
        System.out.println("\n$DEPOSITO. Se ha depositado " + "$" + monto + " en su cuenta.");
    }

    public void dineroRetirado(double monto){
        System.out.println("\n$RETIRO. Se ha retirado " + "$" + monto + " de su cuenta.");
    }

    // MENSAJES DE ERROR
    public void mensajeErrorNumeroDeCuenta() {
        System.out.println("\n!ERROR. Por favor ingrese un numero de cuenta valido.");
    }

    public void mensajeErrorNumeroDeIdentificacionPersonal() {
        System.out.println("\n!ERROR. Por favor ingrese un numero de identificacion personal valido.");
    }

    public void mensajeErrorAlAutenticar() {
        System.out.println("\n!ERROR. El cliente ingresado no existe o es erroneo.");
    }

    public void mensajeDineroNoSuficiente() {
        System.out.println("\n!ERROR. No cuenta con el dinero suficiente en su cuenta.");
    }

    public void mensajeDineroNoDisponible() {
        System.out.println("\n!ERROR. El cajero automatico no cuenta con suficiente dinero para su retiro.");
    }

    public void mensajeErrorDepositoNoPermitido() {
        System.out.println("\n!ERROR. El monto debe ser mayor a $0.0");
    }

    public void errorMenu() {
        System.out.println("\n!ERROR. Ingrese una opcion correcta.");
    }
}
