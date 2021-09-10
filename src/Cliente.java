public class Cliente {
    private static int id;
    private String nombre;
    private String apellido;
    private int documento;
    private Cuenta cuenta;

    Cliente(String nombre, String apellido, int documento, Cuenta cuenta) {
        id++;
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.cuenta = cuenta;
    }

    public static int getId() {
        return id;
    }

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

    public int getDocumento() {
        return documento;
    }

    public void setDocumento(int documento) {
        this.documento = documento;
    }

    public Cuenta getCuenta() { return cuenta; }

    public void setCuenta(Cuenta cuenta) { this.cuenta = cuenta; }

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nApellido: " + apellido + "\nDocumento: " + documento + "\n" + cuenta;
    }
}
