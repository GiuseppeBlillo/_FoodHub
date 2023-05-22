package Gestione;

public record IndirizzoRecord(String via, int nC, int cap) {
    public IndirizzoRecord {
        if (String.valueOf(cap).length() < 5) {
                throw new IllegalArgumentException("Indirizzo non valido, inserisci un cap corretto");
        }
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
