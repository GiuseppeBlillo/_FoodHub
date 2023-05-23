package Miscellaneous;
import Enumerations.ColoriEnum;
import Enumerations.TipoDiCucinaEnum;
import ProdottiInVendita.Bevanda;
import ProdottiInVendita.Portata;

import javax.sound.sampled.Port;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ristorante {
    private String name;
    private TipoDiCucinaEnum tipoCucina;
    private List<MenuAllaCarta> menuList;
    private int coperto;


    public Ristorante(String name, TipoDiCucinaEnum tipoCucina) {
        this.name = name;
        this.tipoCucina = tipoCucina;
        this.menuList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public TipoDiCucinaEnum getTipo() {
        return tipoCucina;
    }
    public void setTipo(TipoDiCucinaEnum tipoCucina) {
        this.tipoCucina = tipoCucina;
    }

    public List<MenuAllaCarta> getMenuList() {
        return menuList;
    }
    public void addMenu(MenuAllaCarta x) {
        this.menuList.add(x);
    }
    public void removeMenu(MenuAllaCarta x) {
        this.menuList.remove(x);
    }

    public int getCoperto() {
        return coperto;
    }

    public void setCoperto(int coperto) {
        this.coperto = coperto;
    }

    public Map<MenuAllaCarta, Double> PrezzoMedioMenuRistorante(){
        Map<MenuAllaCarta,Double> medieDeiMenu = new HashMap<>();

        double sommaPrezziMedi = 0.0;
        for (MenuAllaCarta menu : menuList) {
            sommaPrezziMedi = menu.prezzoMedioListePortate();

            double mediaMenu = sommaPrezziMedi;
            medieDeiMenu.put(menu,mediaMenu);
        }
        return medieDeiMenu;
    }

    public void printPrezzoMedioRistorante(){
        Map<MenuAllaCarta,Double>medieDeiMenu=PrezzoMedioMenuRistorante();
        for (Map.Entry<MenuAllaCarta,Double> entry : medieDeiMenu.entrySet()){
            MenuAllaCarta menu = entry.getKey();
            double mediaMenu = entry.getValue();

            System.out.print(String.format("\n %-40s %-35s %-1s  ", ColoriEnum.CYAN.getANSI_Code(), "Il prezzo medio a persona del " +menu.getName().toLowerCase() +" (bevande escluse, coperto incluso) è:", String.format("%.2f", mediaMenu+getCoperto()))+"€");

        }
    }

    public void printRistoranteTotale() {
        System.out.println(String.format("\n %-5s %-35s %-50s %-50s\n",  ColoriEnum.YELLOW_BOLD.getANSI_Code(), " ", this.name, ""));
        System.out.print(String.format("\n %-45s %-50s %-50s\n", "", TipoDiCucinaEnum.ITALIANA.getDescrizioneCucina(), " "));
        System.out.print(ColoriEnum.ANSI_RESET.getANSI_Code());


        for (MenuAllaCarta menuu : menuList) {
            System.out.print(String.format(" \n\n%-5s %-48s %-50s %-50s\n", ColoriEnum.PURPLE_BOLD.getANSI_Code() ," ", menuu.getName().toUpperCase(), " "));
            System.out.print(ColoriEnum.ANSI_RESET.getANSI_Code());

            menuu.printMenu();
        }
        printPrezzoMedioRistorante();
    }

    public void printCoperto(){
        System.out.println(getCoperto() + "€");
    }
}


