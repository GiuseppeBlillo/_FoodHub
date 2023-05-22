package Gestione;

import Gestione.Cliente;
import Gestione.Prenotazione;

public class Tavolo {
    private Cliente cliente;
    private int id;
    private Prenotazione prenotazione;

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
