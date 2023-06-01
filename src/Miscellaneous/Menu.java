package Miscellaneous;

import Enumerations.ColoriEnum;
import Enumerations.TipoDiPiattoEnum;
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
        return prezzoMedioListePortate();
    }

    public double prezzoMedioListePortate() {

        double mediaTotale = 0.0;

        if (!portataList.isEmpty()) {
            double mediaParziale = 0.0;
            int contaPortata = 0;
            for (Portata p : portataList) {
                if (p instanceof Antipasto) {
                    mediaParziale += p.getPrice();
                    contaPortata++;
                }


                if (p instanceof Primo) {
                    mediaParziale += p.getPrice();
                    contaPortata++;
                }

                if (p instanceof Secondo) {
                    mediaParziale += p.getPrice();
                    contaPortata++;
                }

                if (p instanceof Dessert) {
                    mediaParziale += p.getPrice();
                    contaPortata++;
                }
            }
            mediaParziale /= contaPortata;
            mediaTotale += mediaParziale;
        }

        return mediaTotale;
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
            System.out.println("La portata '" + p.getName().toLowerCase() + " 'è già presente nel menù");
        }
    }

    public void removePortata(Portata p) {
        if (portataList.contains(p)) {
            portataList.remove(p);
        } else {
            System.out.println("La portata '" + p.getName().toLowerCase() + " ' non è presente nel menù");
        }
    }

    public void printMenu() {
        if (!portataList.isEmpty()) {
            System.out.printf("\n%-2s %-50s %-50s", ColoriEnum.GREEN_BOLD.getANSI_Code(), " ", "ANTIPASTI", " " );
            portataList.stream().filter(antipasto -> antipasto.getTipo() == TipoDiPiattoEnum.ANTIPASTO).forEach(antipasto -> antipasto.printPortataFormattata());
            System.out.println(ColoriEnum.ANSI_RESET.getANSI_Code() + "\n");
            System.out.printf("\n%-2s %-50s %-50s", ColoriEnum.RED_BOLD.getANSI_Code(), " ", "PRIMI", " ");
            portataList.stream().filter(primo -> primo.getTipo() == TipoDiPiattoEnum.PRIMO).forEach(primo -> primo.printPortataFormattata());
            System.out.println(ColoriEnum.ANSI_RESET.getANSI_Code() + "\n");
            System.out.printf("\n%-2s %-50s %-50s", ColoriEnum.YELLOW_BOLD.getANSI_Code(), " ", "SECONDI", " ");
            portataList.stream().filter(secondo -> secondo.getTipo() == TipoDiPiattoEnum.SECONDO).forEach(secondo -> secondo.printPortataFormattata());
            System.out.println(ColoriEnum.ANSI_RESET.getANSI_Code() + "\n");
            System.out.printf("\n%-2s %-50s %-50s", ColoriEnum.PURPLE_BOLD.getANSI_Code(), " ", "DESSERT", " ");
            portataList.stream().filter(dessert -> dessert.getTipo() == TipoDiPiattoEnum.DESSERT).forEach(dessert -> dessert.printPortataFormattata());
            System.out.println(ColoriEnum.ANSI_RESET.getANSI_Code() + "\n");
            System.out.printf("\n%-2s %-50s %-50s", ColoriEnum.CYAN_BOLD.getANSI_Code(), " ", "BEVANDE", " ");
            portataList.stream().filter(bevande -> bevande.getTipo() == TipoDiPiattoEnum.BEVANDA).forEach(bevande -> bevande.printPortataFormattata());
            System.out.println(ColoriEnum.ANSI_RESET.getANSI_Code() + "\n" );
        }
    }

    public void printPrezzoMedioListePortate(){
        System.out.println("Il prezzo medio del " + getTipo().getDescrizione().toLowerCase() +" è: " + String.format("%.2f", prezzoMedioListePortate() )+ " €");
    }

}
