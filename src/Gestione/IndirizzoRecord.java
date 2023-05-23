package Gestione;

public record IndirizzoRecord(String via, int nC, int cap) {
    public IndirizzoRecord {
    }

    @Override
    public String via() {
        return via;
    }

    @Override
    public int nC() {
        return nC;
    }

    @Override
    public int cap() {
        return cap;
    }
}
