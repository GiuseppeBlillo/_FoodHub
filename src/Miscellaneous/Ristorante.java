package Miscellaneous;
import Enumerations.ColoriEnum;
import Enumerations.TipoDiCucinaEnum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Ristorante {
    private String name;
    private TipoDiCucinaEnum tipoCucina;
    private List<Menu> menuList;
    private int coperto;


    public Ristorante(String name) {
        this.name = name;
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

    public List<Menu> getMenuList() {
        return menuList;
    }
    public void addMenu(Menu x) {
        this.menuList.add(x);
    }
    public void removeMenu(Menu x) {
        this.menuList.remove(x);
    }

    public int getCoperto() {
        return coperto;
    }

    public void setCoperto(int coperto) {
        this.coperto = coperto;
    }

    public void setTipoCucina(TipoDiCucinaEnum tipoCucina) {
        this.tipoCucina = tipoCucina;
    }
    public TipoDiCucinaEnum getTipoCucina() {
        return tipoCucina;
    }
    public Map<Menu, Double> PrezzoMedioMenuRistorante(){
        Map<Menu,Double> medieDeiMenu = new HashMap<>();

        double sommaPrezziMedi = 0.0;
        for (Menu menu : menuList) {
            sommaPrezziMedi = menu.prezzoMedioListePortate();

            double mediaMenu = sommaPrezziMedi;
            medieDeiMenu.put(menu,mediaMenu);
        }
        return medieDeiMenu;
    }

    public void printPrezzoMedioRistorante(){
        Map<Menu,Double>medieDeiMenu=PrezzoMedioMenuRistorante();
        for (Map.Entry<Menu,Double> entry : medieDeiMenu.entrySet()){
            Menu menu = entry.getKey();
            double mediaMenu = entry.getValue();

            System.out.print(String.format("\n %-40s %-35s %-1s  ", ColoriEnum.CYAN.getANSI_Code(), "Il prezzo medio a persona del " +menu.getName().toLowerCase() +
                    " (bevande escluse, coperto incluso) è:", String.format("%.2f", mediaMenu+getCoperto()))+"€" + ColoriEnum.ANSI_RESET.getANSI_Code());

        }
    }

    public void printRistoranteTotale() {
        System.out.println(String.format("\n %-5s %-35s %-50s %-50s\n",  ColoriEnum.YELLOW_BOLD.getANSI_Code(), " ", this.name, ""));
        System.out.print(String.format("\n %-45s %-50s %-50s\n", "", TipoDiCucinaEnum.ITALIANA.getDescrizioneCucina(), " "));
        System.out.print(ColoriEnum.ANSI_RESET.getANSI_Code());


        for (Menu menuu : menuList) {
            System.out.print(String.format(" \n\n%-5s %-48s %-50s %-50s\n", ColoriEnum.PURPLE_BOLD.getANSI_Code() ," ", menuu.getName().toUpperCase(), " "));
            System.out.print(ColoriEnum.ANSI_RESET.getANSI_Code());

            menuu.printMenu();
        }
        printPrezzoMedioRistorante();
    }
    //Se vogliamo sapere il coperto usiamo questa funzione
    public void printCoperto(){
        System.out.println(getCoperto() + "€");
    }


}


