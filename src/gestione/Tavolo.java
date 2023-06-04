package gestione;

/**
 * Classe che gestisce il Tavolo che ha nei propri fields un oggetto Cliente, un int id e un oggetto Prenotazione
 */
public class Tavolo {
    private Cliente cliente;
    private int id;
    private Prenotazione prenotazione;

    /**
     * costruttore che prende in input un oggetto Cliente, un int id e un oggetto Prenotazione e restituisce
     * un oggetto di classe Tavolo
     * @param cliente
     * @param id
     * @param prenotazione
     */
    public Tavolo(Cliente cliente, int id, Prenotazione prenotazione) {
        this.cliente = cliente;
        this.id = id;
        this.prenotazione = prenotazione;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Prenotazione getPrenotazione() {
        return prenotazione;
    }

    public void setPrenotazione(Prenotazione prenotazione) {
        this.prenotazione = prenotazione;
    }
}
