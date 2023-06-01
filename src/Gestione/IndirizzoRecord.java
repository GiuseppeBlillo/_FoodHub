package Gestione;

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
