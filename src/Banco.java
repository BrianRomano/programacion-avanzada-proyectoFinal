public class Banco {
    // VARIABLES
    private ATM atm;

    // CONSTRUCTOR ATM
    Banco(ATM atm) {
        this.atm = atm;
    }

    // GETTERS & SETTERS
    public ATM getAtm() {
        return atm;
    }

    public void setAtm(ATM atm) {
        this.atm = atm;
    }
}
