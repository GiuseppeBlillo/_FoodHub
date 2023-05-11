import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //CREARE OGGETTI E STAMPARE TUTTO

        //AGGIUNTA DEGLI INGREDIENTI
        Ingredienti.addIng("olio",0.50);
        Ingredienti.addIng("pomodoro",0.90);
        Ingredienti.addIng("ceci",0.70);
        Ingredienti.addIng("farina",0.50);

        //AGGIUNTA DI UNA LISTA PER LE PORTATE
        //List<Secondi> listaSecondiPiatti = new ArrayList<>();

        //AGGIUNTA DEI SECONDI
        //Secondi p1 = new Secondi("Carne di manzo","deliziosa carne di manzo con olio e pomodoro", true);
        //Secondi p2 = new Secondi("Carne di pollo","sublime carne di pollo con olio, impanata con farina di ceci");

        //listaSecondiPiatti.add(p1);
        //listaSecondiPiatti.add(p2);

        //AGGIUNTA DI UN PRINT PER CAPIRE (lol)
        //p1.printFinalPrice();
       // p2.printPrice();

       // for (Secondi sec: listaSecondiPiatti){
      //      System.out.println(sec.getName() + " " + sec.finalPrice() + "€");
       // }
    }
}
