public class Main {

    public static void main(String[] args) {
    primiPiatti();
    };
    public static void primiPiatti(){
        Primi_Piatti Spaghetti = new Primi_Piatti("Spaghetti saltati su olio extravergine, con base di aglio e pep" +
            "eroncino",4.00);

    Primi_Piatti Amalfitana = new Primi_Piatti("Spaghetti con posa di pomodoro, insaporiti di erbe domestiche"
    ,5.00);

    Primi_Piatti Orechiette = new Primi_Piatti("Tipica pasta fresca fatta in casa, con porcini raccolti nei " +
            "nostri boschi. Il tutto arricchito del nostro miglior seitan", 15.00);

    Primi_Piatti Arcobaleno = new Primi_Piatti("Risotto con verdure colorate, ricoperto da una soffice creme " +
            "fraiche di soia", 8.00);

    Spaghetti.getDescrizione();
    Spaghetti.getPrezzo();
    Orechiette.getDescrizione();
    Orechiette.getPrezzo();
    Amalfitana.getDescrizione();
    Amalfitana.getPrezzo();
    Arcobaleno.getDescrizione();
    Arcobaleno.getPrezzo();
    }
}

