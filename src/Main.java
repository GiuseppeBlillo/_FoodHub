public class Main {
    public static void main(String[] args) {

        //TODO qui dobbiamo creare gli oggetti e stampare il menù

        primiPiatti();
        Secondi();
        Desserts();
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
    public static void Desserts(){

        //TODO mai chiamare in maiscolo gli oggetti e le variabili(scrivere in camelCase)
        Desserts Tortinidiagrumi = new Desserts("Tortino di agrumi realizzate con olio di girasole ed olio essenziale di arancio", 6.00);
        Desserts Crostatadifrutta = new Desserts("Composto da una base di pasta frolla ricoperto con confettura", 7.00);
        Desserts Tiramisùvegano = new Desserts("alternativa preparata con crema di cocco, caffè, biscotti vegan e cacao.", 5.00);
        Desserts Tortacioccolatofondenteepera = new Desserts("sublime fusione di cioccolato fondente e dolcezza della pera in una torta", 8.00);

        Tortinidiagrumi.getDescrizione();
        Tortinidiagrumi.getPrezzo();
        Crostatadifrutta.getDescrizione();
        Crostatadifrutta.getPrezzo();
        Tiramisùvegano.getDescrizione();
        Tiramisùvegano.getPrezzo();
        Tortacioccolatofondenteepera.getDescrizione();
        Tortacioccolatofondenteepera.getPrezzo();
    }




    public static void bevande(){

    Bevande vino_bianco = new Bevande("Vino della cantina","uva pesta");
    Bevande birra = new Bevande("Becks","3 l,uppoli e con pomodoro, pomo'doro e l'aria di pomodoro");

    birra.printPrice();
    vino_bianco.printDescr();
    vino_bianco.printName();
    }
}