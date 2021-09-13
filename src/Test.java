import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        // CLASE SCANNER PARA LEER DATOS INGRESADOS POR TECLADO
        Scanner scanner = new Scanner(System.in);

        // OBJETOS ATM Y BANCO
        ATM atm = new ATM();
        Banco banco = new Banco(atm); // CREAR INSTANCIA SINGLETON PARA ATM

        // DINERO DISPONIBLE EN ATM
        banco.getAtm().ingresarEfectivoEnATM(500, 20);

        // CUENTAS REGISTRADAS EN DB DE ATM
        Cuenta cuentaUno = new Cuenta("Brian", "Romano", 12345678, 12345, 12345, 0.0);
        Cuenta cuentaDos = new Cuenta("Lionel", "Messi", 87654321, 54321, 54321, 0.0);
        Cuenta cuentaTres = new Cuenta("Carlos", "Tevez", 98765432, 98765, 98765, 0.0);

        atm.Cuentas.add(cuentaUno);
        atm.Cuentas.add(cuentaDos);
        atm.Cuentas.add(cuentaTres);

        // VARIABLES PARA GUARDAR DATOS DEL USUARIO A INGRESAR
        int numeroDeCuenta;
        int numeroDeIdentificacionPersonal;

        // VARIABLE BANDERA PARA VALIDAR LA CORRECTA AUTENTICACION DEL USUARIO
        boolean usuarioAutenticado = false;

        System.out.println("***** Bienvenido *****");

        do {
            // VARIABLE BANDERA PARA VALIDAR EL CORRECTO INGRESO DE DATOS
            boolean numeroDeCuentaValido = false;

            do {
                System.out.print("# Por favor introduzca su numero de cuenta: ");
                numeroDeCuenta = scanner.nextInt();
                System.out.println("____________________________________________________________________________");
                if (numeroDeCuenta >= 10000 && numeroDeCuenta <= 99999) {
                    numeroDeCuentaValido = true;
                } else {
                    System.out.println("!ERROR. Por favor ingrese un numero de cuenta valido.");
                    System.out.println("____________________________________________________________________________");
                }
            } while (!numeroDeCuentaValido);

            // VARIABLE BANDERA PARA VALIDAR EL CORRECTO INGRESO DE DATOS
            boolean numeroDeIdentificacionPersonalValido = false;

            do {
                System.out.print("# Por favor introduzca su numero de identificacion personal: ");
                numeroDeIdentificacionPersonal = scanner.nextInt();
                System.out.println("____________________________________________________________________________");
                if (numeroDeIdentificacionPersonal >= 10000 && numeroDeIdentificacionPersonal <= 99999) {
                    numeroDeIdentificacionPersonalValido = true;
                } else {
                    System.out.println("!ERROR. Por favor ingrese un numero de identificacion personal valido.");
                    System.out.println("____________________________________________________________________________");
                }
            } while (!numeroDeIdentificacionPersonalValido);

            // VALIDAR NUMERO DE CUENTA Y NUMERO DE IDENTIFICACION PERSONAL
            if (atm.autenticarUsuario(numeroDeCuenta, numeroDeIdentificacionPersonal)) {
                usuarioAutenticado = true;
            }
        } while (!usuarioAutenticado);

        // VARIABLE DONDE SE GUARDARAN LAS OPCIONES QUE EL USUARIO ELIJA
        int opcion;

        do {
            System.out.println("***** Menu Principal *****");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar efectivo");
            System.out.println("3. Depositar efectivo");
            System.out.println("4. Salir");
            System.out.print("# Elija una opcion: ");

            // INGRESAR OPCION ELEGIDA
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("El saldo en su cuenta es: $" + atm.consultarSaldo(numeroDeCuenta, numeroDeIdentificacionPersonal));
                    break;
                case 2:
                    System.out.print("# Ingrese la cantidad de dinero a retirar: $");
                    double dineroARetirar = scanner.nextDouble();
                    atm.retirarDinero(numeroDeCuenta, numeroDeIdentificacionPersonal, dineroARetirar);
                    break;
                case 3:
                    System.out.print("# Ingrese la cantidad de dinero a depositar: $");
                    double dineroADepositar = scanner.nextDouble();
                    atm.depositarDinero(numeroDeCuenta, numeroDeIdentificacionPersonal, dineroADepositar);
                    break;
                case 4:
                    System.out.println("Muchas gracias. Vuelva pronto.");
                    break;
                default:
                    System.out.println("!ERROR. Ingrese una opcion correcta.");
                    System.out.println("____________________________________________________________________________");
            }

        } while (opcion != 4);
    }
}