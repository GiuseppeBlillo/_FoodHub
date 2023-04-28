public class Primi_Piatti {
    String descrizione;
    double prezzo;

    public void getDescrizione() {
        System.out.println(descrizione);
    }

    public void getPrezzo() {
        System.out.println("€ " + prezzo);
    }

    public Primi_Piatti(String descrizione, double prezzo) {
        this.descrizione = descrizione;
        this.prezzo = prezzo;
    }
}
