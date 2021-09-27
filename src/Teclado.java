import java.util.*;

public class Teclado {
    private final Scanner scanner;

    Teclado() {
        scanner = new Scanner(System.in);
    }

    public int numeroInt(){
        int ingreso = 0;
        boolean tipoDeDatoCorrecto = false;
        do {
            try{
                ingreso = scanner.nextInt();
                tipoDeDatoCorrecto = true;
            } catch(InputMismatchException e){
                System.out.println("\n!ERROR. Ingrese un valor valido");
                scanner.nextLine();
            }
        } while (!tipoDeDatoCorrecto);

        return ingreso;
    }

    public double numeroDouble(){
        double ingreso = 0.0;
        boolean tipoDeDatoCorrecto = false;
        do {
            try {
                ingreso = scanner.nextDouble();
                tipoDeDatoCorrecto = true;
            } catch (InputMismatchException e) {
                System.out.println("\n!ERROR. Ingrese un valor valido");
                scanner.nextLine();
            }
        } while (!tipoDeDatoCorrecto);

        return ingreso;
    }
}
