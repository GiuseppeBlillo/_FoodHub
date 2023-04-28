public class Bevande {
    String descrizione;
    double prezzo;
    public Bevande(String descrizione, double prezzo) {
        this.descrizione=descrizione;
        this.prezzo=prezzo;
    }
    public void getPrezzo(){
        System.out.println( "€ "+prezzo);
    }

    public void getDescrizione() {
        System.out.println(descrizione);
    }

    public void lol(){
        System.out.println("Al modico prezzo di € " + prezzo + " viene servito " + descrizione + ".");
    }
}
