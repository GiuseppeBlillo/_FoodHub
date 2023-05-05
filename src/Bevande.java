public class Bevande {

    //TODO qui manca il modificatore di accesso
    String descrizione;
    double prezzo;
    public Bevande(String descrizione, double prezzo) {
        this.descrizione=descrizione;
        this.prezzo=prezzo;
    }



    //TODO il getter non serve a questo, rigurdare
    public void getPrezzo(){
        System.out.println( "€ "+prezzo);
    }

    public void getDescrizione() {
        System.out.println(descrizione);
    }

    //TODO non posso cambiare descr e prezzo dopo che creo l'oggetto, servono ? rivedere

    //TODO eliminare codice morte
    public void lol(){
        System.out.println("Al modico prezzo di € " + prezzo + " viene servito " + descrizione + ".");
    }
}
