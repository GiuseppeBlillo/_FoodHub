package Miscelleneous;
import Enumerations.ColoriEnum;
import Enumerations.TipoDiMenuEnum;
import ProdottiInVendita.Portata;

import java.util.ArrayList;
import java.util.List;

public class Ristorante {
    private String name;
    private TipoDiMenuEnum tipo;
    private List<MenuAllaCarta> menuList;



    public Ristorante(String name, TipoDiMenuEnum tipo) {
        this.name = name;
        this.tipo = tipo;
        this.menuList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public TipoDiMenuEnum getTipo() {
        return tipo;
    }
    public void setTipo(TipoDiMenuEnum tipo) {
        this.tipo = tipo;
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

    private String stringFormatNomeCentrale(String x, String y, String z) {
        return String.format("%-50s %-50s %-50s\n", "", "", "");
    }

    public double PrezzoMedioRistorante(){
        double sommaPrezziMedi = 0.0;
        for (MenuAllaCarta menu : menuList){
            sommaPrezziMedi += menu.PrezzoMedioAAA();
        }
        return sommaPrezziMedi;
    }

    public void printPrezzoMedioRistorante(){
        System.out.print(String.format("\n %-5s %-39s %-40s %5s %-5s %3s \n", ColoriEnum.CYAN.getANSI_Code(), " ", "Il prezzo medio a persona (bevande escluse) è: ", ""  ,
                String.format("%.2f",  PrezzoMedioRistorante()), " €"));
    }

    public void printRistorante() {
        System.out.println(String.format("\n %-5s %-35s %-50s %-50s\n",  ColoriEnum.YELLOW_BOLD.getANSI_Code(), " ", this.name, ""));
        System.out.print(ColoriEnum.ANSI_RESET.getANSI_Code());
        printPrezzoMedioRistorante();

        for (MenuAllaCarta menuu : menuList) {
                System.out.print(String.format(" \n\n%-5s %-48s %-50s %-50s\n", ColoriEnum.PURPLE_BOLD.getANSI_Code() ," ", menuu.getName().toUpperCase(), " "));
            System.out.print(ColoriEnum.ANSI_RESET.getANSI_Code());

            menuu.printMenu();

            }
        }
    }
