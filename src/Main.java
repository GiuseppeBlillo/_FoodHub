public class Main {
    public static void main(String[] args) {
        primiPiatti();
        Secondi();
        bevande();
    }
















    public static void bevande(){
        Bevande acqua = new Bevande("acqua naturale o gassata", 5.0);
        Bevande vino_rosso = new Bevande ("uva pesta",85.99);
        Bevande vino_bianco = new Bevande("uva pesta", 83.99);
        Bevande birra = new Bevande("3 luppoli", 5.00);
        Bevande bibite = new Bevande("Coca-Cola, Sprite, Fanta", 2.00);

        birra.getPrezzo();

        vino_bianco.getDescrizione();


    }

}