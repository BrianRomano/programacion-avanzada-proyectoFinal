public class Cliente {
    // VARIABLES
    private static int id;
    private String nombre;
    private String apellido;
    private int documento;

    // CONSTRUCTOR
    Cliente(String nombre, String apellido, int documento) {
        id++;
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
    }

    // GETTERS & SETTERS
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

    @Override
    public String toString() {
        return "Nombre: " + nombre + "\nApellido: " + apellido + "\nDocumento: " + documento;
    }
}
