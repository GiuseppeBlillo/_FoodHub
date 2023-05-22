package Gestione;

import java.util.ArrayList;
import java.util.List;

public class RegistroPrenotazioni {
    private int id;
    private String surname;
    private List<Prenotazione> prenotazioneList;
    private Tavolo tavolo;

    public RegistroPrenotazioni(int id, String surname, Tavolo tavolo) {
        this.id = id;
        this.surname = surname;
        this.prenotazioneList = new ArrayList<>();
        this.tavolo = tavolo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public List<Prenotazione> getPrenotazioneList() {
        return prenotazioneList;
    }

    public void setPrenotazioneList(List<Prenotazione> prenotazioneList) {
        this.prenotazioneList = prenotazioneList;
    }

    public Tavolo getTavolo() {
        return tavolo;
    }

    public void setTavolo(Tavolo tavolo) {
        this.tavolo = tavolo;
    }

}
