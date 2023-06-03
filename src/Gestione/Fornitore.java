package Gestione;

/**
 * Classe pubblica che gestisce il Fornitore che presenta nei propri fields una stringa name e
 * un record dell' indirizzo
 */
public class Fornitore {
    private String nomeAzienda;
    private IndirizzoRecord address;

    /**
     * costruttore che prende in imput una stringa e un record che restituisce un oggetto di classe Fornitore
     * @param nomeAzienda
     * @param address
     */
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
