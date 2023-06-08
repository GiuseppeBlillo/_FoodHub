package gestione;

/**
 * Classe che gestisce il Tavolo che ha nei propri fields un oggetto Cliente, un Integer id e un oggetto Prenotazione
 */
public class Tavolo {
    private Cliente cliente;
    private Integer id;
    private Prenotazione prenotazione;

    /**
     * costruttore che prende in input un oggetto Cliente, un Integer id e un oggetto Prenotazione e restituisce
     * un oggetto di classe Tavolo
     * @param cliente
     * @param id
     * @param prenotazione
     */
    public Tavolo(Cliente cliente, Integer id, Prenotazione prenotazione) {
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Prenotazione getPrenotazione() {
        return prenotazione;
    }

    public void setPrenotazione(Prenotazione prenotazione) {
        this.prenotazione = prenotazione;
    }
}
