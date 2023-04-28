public class SecondiPiatti {
     String descrizione;
     double prezzo;

    public SecondiPiatti(String descrizione, double prezzo) {
        this.descrizione = descrizione;
        this.prezzo = prezzo;
    }

    public void getDescrizione() {
        System.out.println(descrizione);
    }

    public void getPrezzo() {
        System.out.println(prezzo + " €");
    }


}
