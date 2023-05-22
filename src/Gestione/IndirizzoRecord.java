package Gestione;

public record IndirizzoRecord(String via, int nC, int cap) {
    public IndirizzoRecord {
        if (String.valueOf(cap).length() < 5){
            try {
                throw new IllegalAccessException("address not valid");
            } catch (IllegalAccessException e) {
                throw new RuntimeException(e);
            }
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
