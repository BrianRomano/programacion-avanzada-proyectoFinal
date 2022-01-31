public class Banco {

    private final Cliente[] cliente;
    private int cantidadDeClientes;

    Banco() {
        cliente = new Cliente[10];
        cantidadDeClientes = 0;
    }

    public int getCantidadDeClientes() {
        return cantidadDeClientes;
    }

    public Cliente getCliente(int index) {
        return cliente[index];
    }

    public void nuevoCliente(String nombre, String apellido, int NIP, int numeroDeCuenta, double saldo) {
        int i = cantidadDeClientes++;
        cliente[i] = new Cliente(nombre, apellido, NIP, numeroDeCuenta, saldo);
    }
}
