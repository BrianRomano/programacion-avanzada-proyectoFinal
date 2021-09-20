import java.util.Scanner;

public class Teclado {
    private final Scanner scanner;

    Teclado() {
        scanner = new Scanner(System.in);
    }

    public int numeroInt(){
        return scanner.nextInt();
    }

    public double numeroDouble(){
        return scanner.nextDouble();
    }
}
