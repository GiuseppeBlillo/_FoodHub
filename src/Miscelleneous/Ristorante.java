package Miscelleneous;
import ProdottiInVendita.Portata;
import java.util.ArrayList;
import java.util.List;

public class Ristorante {
    private String name;

  /*  private String indirizzo;
    private String provincia;
    private int CAP;
    private int prezzoMedio;

    private Enum tipoDiCucina;*/
    private List<MenuAllaCarta> menuList;

    public Ristorante(String name) {
        this.name = name;
        this.menuList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<MenuAllaCarta> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<MenuAllaCarta> menuList) {
        this.menuList = menuList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<MenuAllaCarta> getMenu() {
        return menuList;
    }

    public void setMenu(List<MenuAllaCarta> menuAllaCarta) {
        this.menuList = menuAllaCarta;
    }

    private String stringFormat(String name, String description, double price) {
        return String.format("%-50s %-80s %9s\n", name.toUpperCase(), " ", String.format("%.2f", price) + " €") + "\033[3m" + description + "\033[0m\n\n";
    }

    public void addMenu(MenuAllaCarta x) {
        this.menuList.add(x);
    }

    public void printAllMenu() {
        System.out.println(this.name);
        for (MenuAllaCarta i : menuList) {
            System.out.println("\033[0;1m" + "\u001B[33m" + i.getName().toUpperCase() + "\u001B[0m");
            System.out.println("");
            for (Portata x : i.getPortataList()) {
                System.out.println(stringFormat(x.getName(), x.getDescription(), x.getPrice()));
            }
        }
    }
}
