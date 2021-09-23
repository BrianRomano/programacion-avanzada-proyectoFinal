public class Cliente {
    // VARIABLES
    private String nombre;
    private String apellido;
    private int NIP;
    private Cuenta Cuenta;

    // CONSTRUCTOR
    Cliente(String nombre, String apellido, int NIP, int numeroDeCuenta, double saldo) {
        setNombre(nombre);
        setApellido(apellido);
        setNIP(NIP);
        setCuenta(numeroDeCuenta, saldo);
    }

    // GETTERS & SETTERS
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getNIP() {
        return NIP;
    }

    public void setNIP(int NIP) {
        this.NIP = NIP;
    }

    public Cuenta getCuenta() {
        return Cuenta;
    }

    public void setCuenta(int numeroDeCuenta, double saldo) {
        this.Cuenta = new Cuenta(numeroDeCuenta, saldo);
    }

    @Override
    public String toString() {
        return "\n\nNombre: " + nombre + "\nApellido: " + apellido + "\nNIP: " + NIP + "\n" + Cuenta;
    }
}
