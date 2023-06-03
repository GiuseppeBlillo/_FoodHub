package Gestione;

/**
 * Classe record che imposta un indirizzo utilizzando in imput una stringa via, un int numero civico
 * e un int cap
 * @param via
 * @param numeroCivico
 * @param cap
 */
//TODO :(
public record IndirizzoRecord(String via, int numeroCivico, int cap) {
    public IndirizzoRecord {
    }

    @Override
    public String via() {
        return via;
    }

    @Override
    public int numeroCivico() {
        return numeroCivico;
    }

    @Override
    public int cap() {
        return cap;
    }
}
