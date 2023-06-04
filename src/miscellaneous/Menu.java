package miscellaneous;

import enumerations.ColoriEnum;
import enumerations.TipoDiPiattoEnum;
import enumerations.TipoEnum;
import prodottiinvendita.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Classe che gestisce la creazione del menù del ristorante. Presenta nei propri fields un String name, String chef
 * (nome dello chef che propone il menu), avrà un double prezzo medio, un TipoEnum e una lista di Portata
 */
public class Menu {
    private String name;
    public String chef;
    private double prezzoMedio;
    private TipoEnum tipo;
    private List<Portata> portataList;

    /**
     * costruttore che prende in input un String name e un TipoEnum e che restituisce un oggetto di classe Menu con
     * all' interno una lista di Portata vuota
     * @param name
     * @param tipo
     */
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

    /**
     * Funzione che calcola il prezzo medio delle portate. Mi va a creare una prima variabile chiamata double
     * mediaTotale indicizzata a 0.0. Se la lista portate non è vuota, mi va a
     * instanziare due variabili: double mediaParziale e un int contaPortata. Mi va a ciclare nella lista Portata
     * e a seconda del TipoDiPiattoEnum, mi va a prendere il suo prezzo e lo aggiunge alla mediaParziale e aumenta
     * anche la contaPortata. Alla fine mi va a dividere la MediaParziale per la contaPortata e avremo la nostra
     * mediaTotale
     * @return la mediaTotale.
     */
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

    /**
     * Funzione che serve per aggiungere una portata alla nostra lista di portate con una condizione interna
     * laddove, se la nostra portata non è presente, viene aggiunta, altrimenti avremo che da errore.
     * @param p
     */
    public void addPortata(Portata p) {
        if (!portataList.contains(p)) {
            portataList.add(p);
        } else {
            System.out.println("La portata '" + p.getName().toLowerCase() + " 'è già presente nel menù");
        }
    }

    /**
     * Funzione che serve per eliminare una portata alla nostra lista di portate con una condizione interna
     * laddove, se la nostra portata è presente, viene eliminata, altrimenti avremo che da errore.
     * @param p
     */
    public void removePortata(Portata p) {
        if (portataList.contains(p)) {
            portataList.remove(p);
        } else {
            System.out.println("La portata '" + p.getName().toLowerCase() + " ' non è presente nel menù");
        }
    }

    /**
     * funzione che serve per stampare il menu. Essa presenta una condizione dove, qualora non vi sia
     * una lista portata vuota mi prende tutti i tipi TipoDiPiattoEnum (ANTIPASTO, PRIMO,SECONDO,ECC ECC)
     * e me li stampa in base a dei colori scelti nella classe ColoriEnum. In seguito, mi va a stampare, tutte
     * le liste dei tipi di portta
     */
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

    /**
     * funzione che stampa il prezzoMedioListePortate
     */
    public void printPrezzoMedioListePortate(){
        System.out.println("Il prezzo medio del " + getTipo().getDescrizione().toLowerCase() +" è: " + String.format("%.2f", prezzoMedioListePortate() )+ " €");
    }

}
