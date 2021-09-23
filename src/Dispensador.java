public class Dispensador {

    private int cantidadDeBilletes;
    private int valorDeBillete;

    public Dispensador () {
        cantidadDeBilletes = 500;
        valorDeBillete = 20;
    }

    public double cantidadDeDinero () {
        return cantidadDeBilletes * valorDeBillete;
    }

    public void retirarDinero (double monto) {
        cantidadDeBilletes -= monto / 20;
    }
}
