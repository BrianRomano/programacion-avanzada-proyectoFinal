public class Dispensador {

    private final int valorDeBillete;
    private int cantidadDeBilletes;

    public Dispensador() {
        cantidadDeBilletes = 500;
        valorDeBillete = 20;
    }

    public double cantidadDeDinero() {
        return cantidadDeBilletes * valorDeBillete;
    }

    public void retirarDinero(double monto) {
        cantidadDeBilletes -= monto / 20;
    }
}
