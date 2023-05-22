package Miscellaneous;

import Enumerations.ColoriEnum;
import Enumerations.TipoDiMenuEnum;
import ProdottiInVendita.*;
import java.util.ArrayList;
import java.util.List;

public class MenuAllaCarta {
    private String name;
    public String chef;
    private double prezzoMedio;
    private TipoDiMenuEnum tipo;
    private List<Portata> portataList;

    public MenuAllaCarta(String name, String chef, TipoDiMenuEnum tipo) {
        this.name = name;
        this.chef = chef;
        this.tipo = tipo;
        this.portataList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChef() {
        return chef;
    }

    public void setChef(String chef) {
        this.chef = chef;
    }

    public double getPrezzoMedio() {
        return prezzoMedio;
    }

   /* public void setPrezzoMedio(double prezzoMedio) {
        this.prezzoMedio = prezzoMedio;
    }*/

    public double prezzoMedio() {
        double prezzoMedio = 0.0;
        for (Portata p : portataList) {
            if (!(p instanceof Bevanda)) {
                prezzoMedio += p.getPrice();
            }
        }   return prezzoMedio;
    }

    public TipoDiMenuEnum getTipo() {
        return tipo;
    }

    public void setTipo(TipoDiMenuEnum tipo) {
        this.tipo = tipo;
    }

    public List<Portata> getPortataList() {
        return portataList;
    }

    public void setPortataList(List<Portata> portataList) {
        this.portataList = portataList;
    }

    public void addPortata(Portata p) {
        // if ((!portataList.contains(p))) {
        portataList.add(p);
        //}
        // System.out.println("Portata attualmente già presente nel menù");
    }

    public void removePortata(Portata p) {
        portataList.remove(p);
    }

    private boolean presenzaAntipasto(){
        for (Portata p : portataList){
            if (p instanceof Antipasto){
                return true;
            }
        }   return false;
    }
    private boolean presenzaPrimo(){
        for (Portata p : portataList){
            if (p instanceof Primo){
                return true;
            }
        }   return false;
    }
    private boolean presenzaSecondo(){
        for (Portata p : portataList){
            if (p instanceof Secondo){
                return true;
            }
        }   return false;
    }
    private boolean presenzaDessert(){
        for (Portata p : portataList){
            if (p instanceof Dessert){
                return true;
            }
        }   return false;
    }
    private boolean presenzaBevanda(){
        for (Portata p : portataList){
            if (p instanceof Bevanda){
                return true;
            }
        }   return false;
    }

    public void printMenu() {

        if (!portataList.isEmpty() && presenzaAntipasto()) {
            System.out.println(String.format("\n \n%-2s %-50s %-50s", ColoriEnum.GREEN_BOLD.getANSI_Code(), " ", "ANTIPASTI", " ", "\n"));
            for (Portata p : portataList) {
                if (p instanceof Antipasto) {
                    p.printPortata(ColoriEnum.MAIUSC_GREEN, ColoriEnum.GREEN);
                    System.out.println(ColoriEnum.ANSI_RESET.getANSI_Code());
                }
            }
        }

        if (!portataList.isEmpty() && presenzaPrimo()) {
            System.out.println(String.format("\n \n%-2s %-50s %-50s", ColoriEnum.RED_BOLD.getANSI_Code(), "", "PRIMI", "", "\n"));
            for (Portata p : portataList) {
                if (p instanceof Primo) {
                    p.printPortata(ColoriEnum.MAIUSC_RED, ColoriEnum.RED);
                    System.out.println(ColoriEnum.ANSI_RESET.getANSI_Code());
                }
            }
        }

        if (!portataList.isEmpty() && presenzaSecondo()) {
            System.out.println(String.format("\n \n%-2s %-50s %-50s", ColoriEnum.YELLOW_BOLD.getANSI_Code(), " ", "SECONDI", " ", "\n"));
            for (Portata p : portataList) {
                if (p instanceof Secondo) {
                    p.printPortata(ColoriEnum.MAIUSC_YELLOW, ColoriEnum.YELLOW);
                    System.out.println(ColoriEnum.ANSI_RESET.getANSI_Code());
                }
            }
        }

        if (!portataList.isEmpty() && presenzaDessert()) {
            System.out.println(String.format("\n \n %-2s %-50s %-50s", ColoriEnum.PURPLE_BOLD.getANSI_Code(), "", "DESSERT", "", "\n"));
            for (Portata p : portataList) {
                if (p instanceof Dessert) {
                    p.printPortata(ColoriEnum.MAIUSC_PURPLE, ColoriEnum.PURPLE);
                    System.out.println(ColoriEnum.ANSI_RESET.getANSI_Code());
                }
            }
        }

        if (!portataList.isEmpty() && presenzaBevanda()) {
            System.out.println(String.format("\n \n %-2s %-50s %-50s", ColoriEnum.BLUE_BOLD.getANSI_Code(), "", "BEVANDE", "", "\n"));
            for (Portata p : portataList) {
                if (p instanceof Bevanda) {
                    p.printPortata(ColoriEnum.MAIUSC_BLUE, ColoriEnum.BLUE);
                    System.out.println(ColoriEnum.ANSI_RESET.getANSI_Code());
                }
            }
        }
    }

    public void printPrezzoMedioMenu(){

        System.out.println("Il prezzo medio del " + getTipo().getDescrizione().toLowerCase() +" è: " + String.format("%.2f",prezzoMedio )+ " €");
    }
    public void printMenuSpecifico(){
        System.out.println("\033[0;1m" + "\u001B[33m" + "\"•._.••´¯``•.¸¸.•`La lista di portate scelte è la seguente`•.¸¸.•´´¯`••._.• ".toUpperCase() + "\u001B[0m" + "\n");
        System.out.println("");
      for (Portata p : getPortataList()){
          System.out.println(String.format("%-50s %-80s %9s\n", p.getName().toUpperCase(), " ", String.format("%.2f", p.getPrice()) + " €") + "\033[3m" + p.getDescription() + "\033[0m\n\n");
      }
}

}
