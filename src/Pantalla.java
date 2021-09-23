public class Pantalla {

    public Pantalla() {
    }

    public void mensajeBienvenida() {
        System.out.println("***** BIENVENIDO *****");
    }

    public void mensajeNumeroDeCuenta() {
        System.out.print("# Por favor introduzca su numero de cuenta: ");
    }

    public void mensajeErrorNumeroDeCuenta() {
        System.out.println("!ERROR. Por favor ingrese un numero de cuenta valido.");
        System.out.println("____________________________________________________________________________");
    }

    public void mensajeNumeroDeIdentificacionPersonal() {
        System.out.print("# Por favor introduzca su numero de identificacion personal: ");
    }

    public void mensajeErrorNumeroDeIdentificacionPersonal() {
        System.out.println("!ERROR. Por favor ingrese un numero de identificacion personal valido.");
        System.out.println("____________________________________________________________________________");
    }

    public void mensajeErrorAlAutenticar () {
        System.out.println("!ERROR. El cliente ingresado no existe o es erroneo");
        System.out.println("____________________________________________________________________________");
    }

    public void mensajeBienvenidaClienteAutenticado(String nombre, String apellido) {
        System.out.println("***** BIENVENIDO " + nombre.toUpperCase() + " " + apellido.toUpperCase() + " *****");
    }

    public void menuPrincipal() {
        System.out.println("***** Menu Principal *****");
        System.out.println("1. Consultar saldo");
        System.out.println("2. Retirar efectivo");
        System.out.println("3. Depositar efectivo");
        System.out.println("4. Salir");
        System.out.print("# Elija una opcion: ");
    }

    public void mensajeConsultaDeSaldo(double saldo) {
        System.out.println("El saldo en su cuenta es: $" + saldo);
    }

    public void mensajeDineroARetirar() {
        System.out.print("# Ingrese la cantidad de dinero a retirar: $");
    }

    public void mensajeDineroADepositar() {
        System.out.print("# Ingrese la cantidad de dinero a depositar: $");
    }

    public void mensajeDeDespedida() {
        System.out.println("Muchas gracias. Vuelva pronto");
    }

    public void errorMenu() {
        System.out.println("!ERROR. Ingrese una opcion correcta.");
        System.out.println("____________________________________________________________________________");
    }
}
