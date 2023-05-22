package Gestione;

public class Fornitore {
    private String nomeAzienda;
    private IndirizzoRecord address;

    public Fornitore(String nomeAzienda, IndirizzoRecord address) {
        this.nomeAzienda = nomeAzienda;
        this.address = address;
    }

    public String getNomeAzienda() {
        return nomeAzienda;
    }

    public void setNomeAzienda(String nomeAzienda) {
        this.nomeAzienda = nomeAzienda;
    }

    public IndirizzoRecord getAddress() {
        return address;
    }

    public void setAddress(IndirizzoRecord address) {
        this.address = address;
    }
}
