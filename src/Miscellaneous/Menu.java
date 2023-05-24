package Miscellaneous;

import Enumerations.ColoriEnum;
import Enumerations.TipoEnum;
import ProdottiInVendita.*;
import java.util.ArrayList;
import java.util.List;

public class Menu {
    private String name;
    public String chef;
    private double prezzoMedio;
    private TipoEnum tipo;
    private List<Portata> portataList;

    public Menu(String name, TipoEnum tipo) {
        this.name = name;
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

    public double prezzoMedioListePortate() {

        double mediaTotale = 0.0;

        if (!portataList.isEmpty() && presenzaAntipasto()) {
            double mediaParziale = 0.0;
            int contaPortata = 0;
            for (Portata p : portataList) {
                if (p instanceof Antipasto) {
                    mediaParziale += p.getPrice();
                    contaPortata++;
                }
            }
            mediaParziale /= contaPortata;
            mediaTotale += mediaParziale;
        }

        if (!portataList.isEmpty() && presenzaPrimo()) {
            double mediaParziale = 0.0;
            int contaPortata = 0;
            for (Portata p : portataList) {
                if (p instanceof Primo) {
                    mediaParziale += p.getPrice();
                    contaPortata++;
                }
            }
            mediaParziale /= contaPortata;
            mediaTotale += mediaParziale;
        }

        if (!portataList.isEmpty() && presenzaSecondo()) {
            double mediaParziale = 0.0;
            int contaPortata = 0;
            for (Portata p : portataList) {
                if (p instanceof Secondo) {
                    mediaParziale += p.getPrice();
                    contaPortata++;
                }
            }
            mediaParziale /= contaPortata;
            mediaTotale += mediaParziale;
        }

        if (!portataList.isEmpty() && presenzaDessert()) {
            double mediaParziale = 0.0;
            int contaPortata = 0;
            for (Portata p : portataList) {
                if (p instanceof Dessert) {
                    mediaParziale += p.getPrice();
                    contaPortata++;
                }
            }
            mediaParziale /= contaPortata;
            mediaTotale += mediaParziale;
        }

        //TODO guardare
        double ceil = Math.ceil(mediaTotale);
        return  ceil;
    }

    public TipoEnum getTipo() {
        return tipo;
    }

    public void setTipo(TipoEnum tipo) {
        this.tipo = tipo;
    }

    public List<Portata> getPortataList() {
        return portataList;
    }


    public void addPortata(Portata p) {
        if (!portataList.contains(p)) {
            portataList.add(p);
        } else {
            portataList.add(p);
            portataList.remove(p);
            System.err.println("La portata '" + p.getName().toLowerCase() + " 'è già presente nel menu");
        }
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

    //TODO
    public void printMenu() {
        System.out.println(TextStyleEnum.ANSI_RED_BACKGROUND.getValue() +
                TextStyleEnum.EMOJY_FIRE.getValue() + TextStyleEnum.ANSI_BOLD.getValue() + TextStyleEnum.ANSI_BLACK.getValue() + getRestaurantName() +
                TextStyleEnum.EMOJY_FIRE.getValue() + TextStyleEnum.ANSI_RESET.getValue() + "\n");
        System.out.println("Chef: " + getChefName() + "\n");
        System.out.println(getDescription() + "\n");
        System.out.println("\n PRIMI \n");
        listaPortata.stream().filter(primo -> primo.getTipoPortata() == TipoPortataEnum.PRIMO).forEach(primo -> primo.printInfo());
        System.out.println("\n SECONDI \n");
        listaPortata.stream().filter(secondo -> secondo.getTipoPortata() == TipoPortataEnum.SECONDO).forEach(secondo -> secondo.printInfo());
        System.out.println("\n DESSERT \n");
        listaPortata.stream().filter(dessert -> dessert.getTipoPortata() == TipoPortataEnum.DESSERT).forEach(dessert -> dessert.printInfo());
        System.out.println("\n BEVANDE \n");
        listaPortata.stream().filter(bevanda -> bevanda.getTipoPortata() == TipoPortataEnum.BEVANDA).forEach(bevanda -> bevanda.printInfo());
        System.out.println("\n BUON APPETITO!!!");
    }


    public void printMenu() {


        if (!portataList.isEmpty() && presenzaAntipasto()) {
            System.out.println(String.format("\n \n%-2s %-50s %-50s", ColoriEnum.GREEN_BOLD.getANSI_Code(), " ", "ANTIPASTI", " ", "\n"));
            for (Portata p : portataList) {
                if (p instanceof Antipasto) {
                    p.printPortataColori(ColoriEnum.MAIUSC_GREEN, ColoriEnum.GREEN);
                    System.out.println(ColoriEnum.ANSI_RESET.getANSI_Code());
                }
            }
        }

        if (!portataList.isEmpty() && presenzaPrimo()) {
            System.out.println(String.format("\n \n%-2s %-50s %-50s", ColoriEnum.RED_BOLD.getANSI_Code(), "", "PRIMI", "", "\n"));
            for (Portata p : portataList) {
                if (p instanceof Primo) {
                    p.printPortataColori(ColoriEnum.MAIUSC_RED, ColoriEnum.RED);
                    System.out.println(ColoriEnum.ANSI_RESET.getANSI_Code());
                }
            }
        }

        if (!portataList.isEmpty() && presenzaSecondo()) {
            System.out.println(String.format("\n \n%-2s %-50s %-50s", ColoriEnum.YELLOW_BOLD.getANSI_Code(), " ", "SECONDI", " ", "\n"));
            for (Portata p : portataList) {
                if (p instanceof Secondo) {
                    p.printPortataColori(ColoriEnum.MAIUSC_YELLOW, ColoriEnum.YELLOW);
                    System.out.println(ColoriEnum.ANSI_RESET.getANSI_Code());
                }
            }
        }

        if (!portataList.isEmpty() && presenzaDessert()) {
            System.out.println(String.format("\n \n %-2s %-50s %-50s", ColoriEnum.PURPLE_BOLD.getANSI_Code(), "", "DESSERT", "", "\n"));
            for (Portata p : portataList) {
                if (p instanceof Dessert) {
                    p.printPortataColori(ColoriEnum.MAIUSC_PURPLE, ColoriEnum.PURPLE);
                    System.out.println(ColoriEnum.ANSI_RESET.getANSI_Code());
                }
            }
        }

        if (!portataList.isEmpty() && presenzaBevanda()) {
            System.out.println(String.format("\n \n %-2s %-50s %-50s", ColoriEnum.BLUE_BOLD.getANSI_Code(), "", "BEVANDE", "", "\n"));
            for (Portata p : portataList) {
                if (p instanceof Bevanda) {
                    p.printPortataColori(ColoriEnum.MAIUSC_BLUE, ColoriEnum.BLUE);
                    System.out.println(ColoriEnum.ANSI_RESET.getANSI_Code());
                }
            }
        }
    }

    public void printPrezzoMedioListePortate(){
        System.out.println("Il prezzo medio del " + getTipo().getDescrizione().toLowerCase() +" è: " + String.format("%.2f", prezzoMedioListePortate() )+ " €");
    }

    public void printListePortateSpecifiche(){
        System.out.println("\033[0;1m" + "\u001B[33m" + "\"•._.••´¯``•.¸¸.•`La lista di portate scelte è la seguente`•.¸¸.•´´¯`••._.• ".toUpperCase() + "\u001B[0m" + "\n");
        System.out.println("");
        for (Portata p : getPortataList()){
            System.out.println(String.format("%-50s %-80s %9s\n", p.getName().toUpperCase(), " ", String.format("%.2f", p.getPrice()) + " €") + "\033[3m" + p.getDescription() + "\033[0m\n\n");
        }
    }
}
