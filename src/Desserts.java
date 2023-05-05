public class Desserts {

    //TODO riguardare il cleaning code: field (prima i final), costruttore, getter e setter e poi il resto
    String descrizione;
    double prezzo;

    public void getDescrizione() {
        System.out.println(descrizione);
    }

    public void getPrezzo() {
        System.out.println("€ " + prezzo);
    }

    public Desserts(String descrizione, double prezzo) {
        this.descrizione = descrizione;
        this.prezzo = prezzo;
    }
}


