package gestione;

/**
 * Classe record che imposta un indirizzo utilizzando in imput una stringa via, un Integer numero civico
 * e un Integer cap
 * @param via
 * @param numeroCivico
 * @param cap
 */

public record IndirizzoRecord(String via, Integer numeroCivico, Integer cap) {
    public IndirizzoRecord {
    }

    @Override
    public String via() {
        return via;
    }

    @Override
    public Integer numeroCivico() {
        return numeroCivico;
    }

    @Override
    public Integer cap() {
        return cap;
    }
}
