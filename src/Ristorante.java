import ProdottiInVendita.Bevanda;
import ProdottiInVendita.Portata;
import ProdottiInVendita.Prodotto;
import ProdottiInVendita.TipoProdotto;

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

    private String stringFormat(String name, String description, double price){
        return String.format("%-50s %-80s %9s\n", name.toUpperCase(), " ", String.format("%.2f", price) + " €") + "\033[3m" + description + "\033[0m\n\n";
    }

    private String stringFormat(String name){
        return String.format("%-60s %-80s", "", name);
    }

    public void addMenu(Menu x){
        this.menu.add(x);
    }

    public void printAllMenu(){

        System.out.println("\n"+stringFormat(this.name) + "\n");

        for (Menu i : menu) {
            System.out.println("\033[0;1m" + "\u001B[33m" + i.getName().toUpperCase() + "\u001B[0m");
            System.out.println("");
            for (Prodotto x : i.getProdottoList()) {
                if(x instanceof Portata){
                    System.out.println(stringFormat(x.getName(), x.getDescription(), x.getPrice()));
                }
            }
            for (Prodotto y : i.getProdottoList()) {
                if (y.getClass()== Bevanda.class) {
                    System.out.println(stringFormat( y.getName(),y.getDescription(),y.getPrice()));
                }
            }
        }
    }

    public void printPlateByType(String p){
        System.out.println("\n" + "Ecco la lista di portate richieste:"+ "\n");
        for (Menu i : menu){
            for (Prodotto x : i.getProdottoList()){
                if (x.getTipo() == p.toLowerCase()){
                    System.out.println(stringFormat(x.getName(), x.getDescription(), x.getPrice()));
                }
            }
        }
    }
}
