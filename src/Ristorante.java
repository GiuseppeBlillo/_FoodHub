import java.util.ArrayList;
import java.util.List;

public class Ristorante {
    private List<Menu> menuList;

    public Ristorante() {
        this.menuList = new ArrayList<>();
    }

    public void printMenu(){
        for (Menu i : getMenuList()){
            System.out.println(i.getName());

        }
    }
    public void addMenu(Menu m){
        this.menuList.add(m);
    }

    public List<Menu> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<Menu> menuList) {
        this.menuList = new ArrayList<>();
    }

    public static void main(String[] args) {
        //CREAZIONE RISTORANTE

        Ristorante r1 = new Ristorante();

        //CREAZIONE MENU

        Menu menuDiPizza = new Menu("Menu di Pizza");
        Menu m2 = new Menu("Bevande");

        //CREAZIONE PORTATE E BEVANDE

        Portata p1 = new Portata("pizza", 4.50);
        Portata b1 = new Portata("acqua", 2.00);

        //AGGIUNTA PORTATE AI VARI MENU

        m2.addPortata(b1);
        menuDiPizza.addPortata(p1);

        //AGGIUNTA DEI MENU AL RISTORANTE

        r1.addMenu(menuDiPizza);
        r1.addMenu(m2);

        //PRINT FINALE

        System.out.println("\nI menu presenti in questo ristorante sono:");
        r1.printMenu();

        System.out.println("\nI piatti presenti nei menu sono:");
        System.out.println(menuDiPizza.getName() + ": ");
        menuDiPizza.printPortata();
        System.out.println(m2.getName() +": " );
        m2.printPortata();

    }
}
