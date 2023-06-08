package gestione;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe pubblica che gestisce il Registro delle prenotazioni del Ristorante. Presenta nei propri fields un Integer id,
 * una stringa surname, una Lista di prenotazioni
 */
public class RegistroPrenotazioni {
    private Integer id;
    private String surname;
    private List<Prenotazione> prenotazioneList;
    private Tavolo tavolo;

    /**
     * costruttore che prende in imput un Integer id, String surname e un oggetto Tavolo e restituisce un oggetto di tipo
     * RegistroPrenotazioni
     * @param id
     * @param surname
     * @param tavolo
     */
    public RegistroPrenotazioni(Integer id, String surname, Tavolo tavolo) {
        this.id = id;
        this.surname = surname;
        this.prenotazioneList = new ArrayList<>();
        this.tavolo = tavolo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
