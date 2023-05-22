package Gestione;

import java.util.ArrayList;
import java.util.List;

public class ElencoClienti {
    private int id;
    private List<Cliente> clienteList;

    public ElencoClienti(int id, List<Cliente> clienteList) {
        this.id = id;
        this.clienteList = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
