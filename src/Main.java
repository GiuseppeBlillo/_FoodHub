public class Main {
    public static void main(String[] args) {
        primiPiatti();
        Secondi();
        bevande();
    }
    public static void primiPiatti() {
        Primi_Piatti Spaghetti = new Primi_Piatti("Spaghetti saltati su olio extravergine, con base di aglio e peperoncino", 4.00);
        Primi_Piatti Amalfitana = new Primi_Piatti("Spaghetti con posa di pomodoro, insaporiti di erbe domestiche", 5.00);
        Primi_Piatti Orechiette = new Primi_Piatti("Tipica pasta fresca fatta in casa, con porcini raccolti nei nostri boschi. Il tutto arricchito del nostro miglior seitan", 15.00);
        Primi_Piatti Arcobaleno = new Primi_Piatti("Risotto con verdure colorate, ricoperto da una soffice creme fraiche di soia", 8.00);

        Spaghetti.getDescrizione();
        Spaghetti.getPrezzo();
        Orechiette.getDescrizione();
        Orechiette.getPrezzo();
        Amalfitana.getDescrizione();
        Amalfitana.getPrezzo();
        Arcobaleno.getDescrizione();
        Arcobaleno.getPrezzo();
    }
    public static void Secondi(){
        SecondiPiatti felafelDiCeci = new SecondiPiatti("Polpette di legumi speziate e fritte in olio alto-oleico", 9.99);
        SecondiPiatti tempehCroccanti = new SecondiPiatti("Semi di soia fermentati avvolti in foglie di banano", 11);
        SecondiPiatti polpetteDiMuscolo = new SecondiPiatti("Polpette di farina di grano e verdure di stagione", 12.99);
        SecondiPiatti tofuAllaSiciliana = new SecondiPiatti("Tofu marinato, con aggiunta di melanzane, pomodoro ciliegino e olive nere", 9);

        felafelDiCeci.getDescrizione();
        felafelDiCeci.getPrezzo();
        tempehCroccanti.getDescrizione();
        tempehCroccanti.getPrezzo();
        polpetteDiMuscolo.getDescrizione();
        polpetteDiMuscolo.getPrezzo();
        tofuAllaSiciliana.getDescrizione();
        tofuAllaSiciliana.getPrezzo();
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