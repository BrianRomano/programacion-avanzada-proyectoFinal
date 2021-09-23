public class Test {
    public static void main(String[] args) {
        // OBJETO ATM
        ATM atm = new ATM();

        // INICIAR LOS CLIENTES EN BANCO
        clientesEnBanco(atm.getBanco());

        // VARIABLES PARA GUARDAR DATOS DEL USUARIO A INGRESAR
        int numeroDeCuenta;
        int numeroDeIdentificacionPersonal;

        // VARIABLE BANDERA PARA VALIDAR LA CORRECTA AUTENTICACION DEL USUARIO
        boolean usuarioAutenticado = false;

        // MOSTRAR MENSAJE DE BIENVENIDA AL USUARIO
        atm.getPantalla().mensajeBienvenida();

        do {
            // VARIABLE BANDERA PARA VALIDAR EL CORRECTO INGRESO DE DATOS
            boolean numeroDeCuentaValido = false;

            do {
                atm.getPantalla().mensajeNumeroDeCuenta();
                numeroDeCuenta = atm.getTeclado().numeroInt();
                System.out.println("____________________________________________________________________________");
                if (numeroDeCuenta >= 10000 && numeroDeCuenta <= 99999) {
                    numeroDeCuentaValido = true;
                } else {
                    atm.getPantalla().mensajeErrorNumeroDeCuenta();
                }
            } while (!numeroDeCuentaValido);

            // VARIABLE BANDERA PARA VALIDAR EL CORRECTO INGRESO DE DATOS
            boolean numeroDeIdentificacionPersonalValido = false;

            do {
                atm.getPantalla().mensajeNumeroDeIdentificacionPersonal();
                numeroDeIdentificacionPersonal = atm.getTeclado().numeroInt();
                System.out.println("____________________________________________________________________________");
                if (numeroDeIdentificacionPersonal >= 10000 && numeroDeIdentificacionPersonal <= 99999) {
                    numeroDeIdentificacionPersonalValido = true;
                } else {
                    atm.getPantalla().mensajeErrorNumeroDeIdentificacionPersonal();
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
            // MENU PRINCIPAL
            atm.getPantalla().menuPrincipal();

            // INGRESAR OPCION ELEGIDA
            opcion = atm.getTeclado().numeroInt();

            switch (opcion) {
                case 1 -> atm.getPantalla().mensajeConsultaDeSaldo(atm.consultarSaldo());
                case 2 -> {
                    atm.getPantalla().mensajeDineroARetirar();
                    double dineroARetirar = atm.getTeclado().numeroDouble();
                    atm.retirarDinero(dineroARetirar);
                }
                case 3 -> {
                    atm.getPantalla().mensajeDineroADepositar();
                    double dineroADepositar = atm.getTeclado().numeroDouble();
                    atm.depositarDinero(dineroADepositar);
                }
                case 4 -> atm.getPantalla().mensajeDeDespedida();
                default -> atm.getPantalla().errorMenu();
            }
        } while (opcion != 4);
    }

    // INICIAR CLIENTES Y SUS CUENTAS
    private static void clientesEnBanco(Banco banco) {
        // VALORES DE CLIENTES
        String[] nombre = {"Brian", "Lionel", "Carlos"};
        String[] apellido = {"Romano", "Messi", "Tevez"};
        int[] NIP = {12345, 54321, 56789};
        int[] numeroDeCuenta = {12345, 54321, 56789};
        double[] saldoEnCuenta = {10000.00, 1000000.00, 100000.00};

        // CONTADOR DE CLIENTES E INDEX DE CADA UNO
        int contador = 0;

        // CREAR LOS NUEVOS CLIENTES EN EL BANCO
        do {
            banco.nuevoCliente(nombre[contador], apellido[contador], NIP[contador], numeroDeCuenta[contador], saldoEnCuenta[contador]);
            contador++;
        } while (contador != nombre.length);
    }
}