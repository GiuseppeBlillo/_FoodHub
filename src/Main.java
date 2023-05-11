import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //CREARE OGGETTI E STAMPARE TUTTO

        //AGGIUNTA DEGLI INGREDIENTI
        Ingredienti.addIng("olio",0.50);
        Ingredienti.addIng("aglio",0.30);
        Ingredienti.addIng("pomodoro",2.10);
        Ingredienti.addIng("peperoncino",0.50);
        Ingredienti.addIng("erbe",0.40);
        Ingredienti.addIng("porcini",3.20);
        Ingredienti.addIng("seitan",3.50);
        Ingredienti.addIng("verdure",2.80);
        Ingredienti.addIng("soia",3.90);
        Ingredienti.addIng("legumi",1.70);
        Ingredienti.addIng("banano",4.50);
        Ingredienti.addIng("farina",0.50);
        Ingredienti.addIng("tofu",3.40);
        Ingredienti.addIng("melanzane",2.50);
        Ingredienti.addIng("olive",1.70);
        Ingredienti.addIng("agrumi",2.90);
        Ingredienti.addIng("confettura",2.10);
        Ingredienti.addIng("cocco",3.00);
        Ingredienti.addIng("caffe",1.10);
        Ingredienti.addIng("biscotti",3.10);
        Ingredienti.addIng("cacao",0.40);
        Ingredienti.addIng("ciocciolato",4.00);
        Ingredienti.addIng("pera",1.50);
        Ingredienti.addIng("risotto",0.90);
        Ingredienti.addIng("spaghetti",0.70);
        Ingredienti.addIng("pasta",0.60);
        Ingredienti.addIng("polpette",3.10);
        Ingredienti.addIng("arancio",1.90);

        //AGGIUNTA DI UNA LISTA PER LE PORTATE
        List<Primi> primiPiatti = new ArrayList<>();
        //List<Secondi> listaSecondiPiatti = new ArrayList<>();
        Primi spaghetti = new Primi("Spaghetti aglio,olio e peperoncino","Spaghetti saltati su olio extravergine, con base di aglio e peperoncino", false);
        Primi amalfitana = new Primi("Spaghetti all'Amalfitana","Spaghetti con posa di pomodoro, insaporiti di erbe domestiche", false);
        Primi orechiette = new Primi("Orecchiette con porcini e seitan","Tipica pasta fresca fatta in casa, con porcini raccolti nei nostri boschi. Il tutto arricchito del nostro miglior seitan", true);
        Primi arcobaleno = new Primi("Risotto  Arcobaleno","Risotto con verdure colorate, ricoperto da una soffice creme fraiche di soia", true);
        //AGGIUNTA DEI SECONDI
        //Secondi p1 = new Secondi("Carne di manzo","deliziosa carne di manzo con olio e pomodoro", true);
        //Secondi p2 = new Secondi("Carne di pollo","sublime carne di pollo con olio, impanata con farina di ceci");

        primiPiatti.add(spaghetti);
        primiPiatti.add(amalfitana);
        primiPiatti.add(orechiette);
        primiPiatti.add(arcobaleno);
        //listaSecondiPiatti.add(p1);
        //listaSecondiPiatti.add(p2);

        //AGGIUNTA DI UN PRINT PER CAPIRE (lol)
        //p1.printFinalPrice();
       // p2.printPrice();
        System.out.println(spaghetti.augPrice());
       // for (Secondi sec: listaSecondiPiatti){
      //      System.out.println(sec.getName() + " " + sec.finalPrice() + "€");
       // }
    }
}
