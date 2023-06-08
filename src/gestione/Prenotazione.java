package gestione;

/**
 * Classe pubblica che gestisce la Prenotazione. Ha due campi/fields all'interno con un Integer id e un oggetto Cliente
 */
public class Prenotazione {
    private Integer id;
    private Cliente cliente;

    /**
     * costruttore che prende in imput un Integer id e un oggetto Cliente che restituisce un oggetto di tipo Fornitore
     * @param id
     * @param cliente
     */
    public Prenotazione(Integer id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
