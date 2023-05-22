package Miscelleneous;
import Enumerations.ColoriEnum;
import Enumerations.TipoDiCucinaEnum;
import Enumerations.TipoDiMenuEnum;


import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;

public class Ristorante {
    private String name;
    private TipoDiCucinaEnum tipoCucina;
    private List<MenuAllaCarta> menuList;



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

    public double PrezzoMedioRistorante(){
        double sommaPrezziMedi = 0.0;
        for (MenuAllaCarta menu : menuList){
            sommaPrezziMedi += menu.prezzoMedio();
        }
        return sommaPrezziMedi;
    }

    public void printPrezzoMedioRistorante(){
        System.out.print(String.format("\n %-40s %-40s %-6s \n", ColoriEnum.CYAN.getANSI_Code(), "Il prezzo medio a persona (bevande escluse) è:" ,
                String.format("%.2f",PrezzoMedioRistorante())+" €"));
    }

    public void printRistorante() {
        System.out.println(String.format("\n %-5s %-35s %-50s %-50s\n",  ColoriEnum.YELLOW_BOLD.getANSI_Code(), " ", this.name, ""));
        System.out.println(String.format("\n %-45s %-50s %-50s\n", "", TipoDiCucinaEnum.ITALIANA.getDescrizioneCucina(), " "));
        System.out.print(ColoriEnum.ANSI_RESET.getANSI_Code());

        printPrezzoMedioRistorante();

        for (MenuAllaCarta menuu : menuList) {
                System.out.print(String.format(" \n\n%-5s %-48s %-50s %-50s\n", ColoriEnum.PURPLE_BOLD.getANSI_Code() ," ", menuu.getName().toUpperCase(), " "));
            System.out.print(ColoriEnum.ANSI_RESET.getANSI_Code());

            menuu.printMenu();
            }
        }
    }
