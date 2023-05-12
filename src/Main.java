import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
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

        //AGGIUNTA DELLE LISTE PER LE PORTATE
        List<Primi> primiPiatti = new ArrayList<>();
        List<Secondi> listaSecondi = new ArrayList<>();
        List<Desserts> listaDesserts = new ArrayList<>();
        List<Bevande> listaBevande = new ArrayList<>();

        //AGGIUNTA DEI PRIMI
        Primi spaghetti = new Primi("Spaghetti aglio,olio e peperoncino","Spaghetti saltati su olio extravergine, con base di aglio e peperoncino", false);
        Primi amalfitana = new Primi("Spaghetti all'Amalfitana","Spaghetti con posa di pomodoro, insaporiti di erbe domestiche", false);
        Primi orechiette = new Primi("Orecchiette con porcini e seitan","Tipica pasta fresca fatta in casa, con porcini raccolti nei nostri boschi. Il tutto arricchito del nostro miglior seitan", true);
        Primi arcobaleno = new Primi("Risotto Arcobaleno","Risotto con verdure colorate, ricoperto da una soffice creme fraiche di soia", true);

        //AGGIUNTA DEI SECONDI
        Secondi felafel = new Secondi("Felafel di Ceci", "Polpette di legumi speziate e fritte in olio alto-oleico", true );
        Secondi tempeh = new Secondi("Tempeh Croccanti","Semi di soia fermentati avvolti in foglie di banano", true );
        Secondi polpette = new Secondi("Polpette di Muscolo","Polpette di farina di grano e verdure di stagione", false );
        Secondi tofu = new Secondi("Tofu alla Siciliana","Tofu marinato, con aggiunta di melanzane, pomodoro ciliegino e olive nere", true);

        //AGGIUNTA DEI DESSERTS
        Desserts tortini = new Desserts("Tortino di Agrumi","Tortino di agrumi realizzate con olio di girasole ed olio essenziale di arancio",false);
        Desserts crostata = new Desserts("Crostata di Frutta","Composto da una base di pasta frolla senza glutine ricoperto con confettura",true);
        Desserts tiramisu = new Desserts("Tiramisu Vegano","alternativa preparata con crema di cocco, caffè, biscotti vegan e cacao.",true);
        Desserts torta = new Desserts("Torta al Cioccolato fondente e Pera","sublime fusione di cioccolato fondente e dolcezza della pera in una torta",false);

        // AGGIUNTA DELLE BEVANDE
        Bevande b1 = new Bevande("Acqua", "acqua minerale o gassata", 1.50);
        Bevande b2 = new Bevande("Vino", "vino bianco o rosso", 4.50);
        Bevande b3 = new Bevande("Tisane", "tisane al ginseng, ", 2.50);
        Bevande b4 = new Bevande("Birra", "birra artigianale, a km 0", 3.50);

        primiPiatti.add(spaghetti);
        primiPiatti.add(amalfitana);
        primiPiatti.add(orechiette);
        primiPiatti.add(arcobaleno);
        listaSecondi.add(felafel);
        listaSecondi.add(tempeh);
        listaSecondi.add(polpette);
        listaSecondi.add(tofu);
        listaDesserts.add(tortini);
        listaDesserts.add(crostata);
        listaDesserts.add(tiramisu);
        listaDesserts.add(torta);
        listaBevande.add(b1);
        listaBevande.add(b2);
        listaBevande.add(b3);
        listaBevande.add(b4);

        //AGGIUNTA DI UN PRINT PER CAPIRE (lol)
        polpette.printFinalPrice();
        spaghetti.printPrice();
        for (Primi prim: primiPiatti){
            System.out.println(prim.getName() + " " + prim.finalPrice() + "€");
        }

        for (Secondi sec: listaSecondi){
            System.out.println(sec.getName() + " " + sec.finalPrice() + "€");
        }

        for (Desserts des: listaDesserts){
            System.out.println(des.getName() + " " + des.finalPrice() + "€");
        }

        for (Bevande bev: listaBevande){
            System.out.println(bev.getName() + " " + bev.finalPrice() + "€");
        }
        Desserts desert = new Desserts("sss","sss");
        Desserts desserts2 = new Desserts("sss", "ddd",true);

        boolean isGlutenFree = desert.isGlutenFree;

        boolean isGlutenFree1 = desserts2.isGlutenFree;
    }
}
