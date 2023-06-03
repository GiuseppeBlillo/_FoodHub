package Gestione;

/**
 * Classe pubblica che gestisce la Prenotazione. Ha due campi/fields all'interno con un int id e un oggetto Cliente
 */
public class Prenotazione {
    private int id;
    private Cliente cliente;

    /**
     * costruttore che prende in imput un id e un oggetto Cliente che restituisce un oggetto di tipo Fornitore
     * @param id
     * @param cliente
     */
    public Prenotazione(int id, Cliente cliente) {
        this.id = id;
        this.cliente = cliente;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
