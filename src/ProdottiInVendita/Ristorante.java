package ProdottiInVendita;

import java.util.ArrayList;
import java.util.List;

public class Ristorante {
    private String name;
    private List<Menu> menu;

    public Ristorante(String name) {
        this.name = name;
        this.menu = new ArrayList<>();
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
                    System.out.print(String.format("%-50s %-80s %5s\n", x.name.toUpperCase(), " ", x.price));
                    System.out.println("\033[3m" + x.description + "\033[0m");
                    System.out.println("");
                }
            }
            for (Prodotto y : i.getProdottoList()) {
                if (y.getClass()==Bevanda.class) {
                    System.out.print(String.format("%-50s %-80s %5s\n", y.name.toUpperCase(), " ", y.price));
                    System.out.println("\033[3m" + y.description + "\033[0m");
                    System.out.println("");
                }
            }
        }
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
}
