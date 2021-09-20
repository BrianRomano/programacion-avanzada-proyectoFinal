public class Test {
    public static void main(String[] args) {
        // OBJETO ATM
        ATM atm = new ATM();

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
                case 1:
                    atm.getPantalla().mensajeConsultaDeSaldo(atm.consultarSaldo());
                    break;
                case 2:
                    atm.getPantalla().mensajeDineroARetirar();
                    double dineroARetirar = atm.getTeclado().numeroDouble();
                    atm.retirarDinero(numeroDeCuenta, numeroDeIdentificacionPersonal, dineroARetirar);
                    break;
                case 3:
                    atm.getPantalla().mensajeDineroARetirar();
                    double dineroADepositar = atm.getTeclado().numeroDouble();
                    atm.depositarDinero(numeroDeCuenta, numeroDeIdentificacionPersonal, dineroADepositar);
                    break;
                case 4:
                    atm.getPantalla().mensajeDeDespedida();
                    break;
                default:
                   atm.getPantalla().errorMenu();
            }

        } while (opcion != 4);
    }
}