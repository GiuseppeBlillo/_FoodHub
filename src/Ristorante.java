import ProdottiInVendita.Bevanda;
import ProdottiInVendita.Portata;
import ProdottiInVendita.Prodotto;
import ProdottiInVendita.TipoPortata;

import java.util.ArrayList;
import java.util.List;

public class Ristorante {
    private String name;
    private List<Menu> menu;

    public Ristorante(String name) {
        this.name = name;
        this.menu = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Menu> getMenu() {
        return menu;
    }

    public void setMenu(List<Menu> menu) {
        this.menu = menu;
    }

    public void addMenu(Menu x){
        this.menu.add(x);
    }

    public void printAllMenu(){
        System.out.println(String.format("%-60s %-80s", "", this.name));
        System.out.println("");
        for (Menu i : menu) {
            System.out.println("\033[0;1m" + "\u001B[33m" + i.getName().toUpperCase() + "\u001B[0m");
            System.out.println("");
            for (Prodotto x : i.getProdottoList()) {
                if(x instanceof Portata){
                    System.out.print(String.format("%-50s %-80s %9s\n", x.getName().toUpperCase(), " ", String.format("%.2f",x.getPrice()) + " €"));
                    System.out.println("\033[3m" + x.getDescription() + "\033[0m");
                    System.out.println("");
                }
            }
            for (Prodotto y : i.getProdottoList()) {
                if (y.getClass()== Bevanda.class) {
                    System.out.print(String.format("%-50s %-80s %9s\n", y.getName().toUpperCase(), " ", String.format("%.2f",y.getPrice()) + " €"));
                    System.out.println("\033[3m" + y.getDescription() + "\033[0m");
                    System.out.println("");
                }
            }
        }
    }

    public void printPlateByType(TipoPortata p){
        for (Menu i : menu){
            for (Prodotto x : i.getProdottoList()){
                if (x.getTipoPortata()== p){
                    System.out.println("");
                    System.out.print(String.format("%-50s %-80s %9s\n", x.getName(), " ", String.format("%.2f",x.getPrice()) + " €"));
                    System.out.println("\033[3m" + x.getDescription() + "\033[0m");
                }
            }
        }
    }

}


