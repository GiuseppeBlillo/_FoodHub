package gestione;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe che gestisce un elenco di clienti organizzato in una lista e un Integer id utilizzato per assegnare un
 * numero ai clienti in ordine di inserimento nella lista
 */
public class ElencoClienti {
    private Integer id;
    private List<Cliente> clienteList;

    /**
     * costruttore che prende in imput un Integer id e una lista che restituisce un oggetto di classe ElencoClienti con
     * una lista vuota all'interno
     * @param id
     * @param clienteList
     */
    public ElencoClienti(Integer id, List<Cliente> clienteList) {
        this.id = id;
        this.clienteList = new ArrayList<>();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public List<Cliente> getClienteList() {
        return clienteList;
    }

    public void setClienteList(List<Cliente> clienteList) {
        this.clienteList = clienteList;
    }

    public void addCliente(Cliente c){
        this.clienteList.add(c);
    }
    public void removeCliente(Cliente c){
        this.clienteList.remove(c);
    }

}
