package miscellaneous;
import enumerations.ColoriEnum;
import enumerations.TipoDiCucinaEnum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Classe pubblica che gestisce il Ristorante, presenta nei propri fields un String name, un TipoDiCucinaEnum,
 * una lista di menu e un int coperto
 */
public class Ristorante{
    private String name;
    private TipoDiCucinaEnum tipoCucina;
    private List<Menu> menuList;
    private int coperto;

    /**
     * costruttore che prende in input un String name e restituisce un oggetto di classe di tipo Ristorante
     * e una lista vuota.
     * @param name
     */
    public Ristorante(String name){
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
    /**
     * funzione che aggiunge un menu alla lista menu
     * @param x
     */
    public void addMenu(Menu x) {
        this.menuList.add(x);
    }

    /**
     * funzione che elimina un menu dalla lista menu
     * @param x
     */
    public void removeMenu(Menu x) {
        this.menuList.remove(x);
    }

    /**
     * funzione che serve per calcolare il prezzo medio di un menu del ristorante. Al proprio interno avrà una mappa
     * vuota per le medie dei menu e un double sommaPrezziMedi indicizzato a 0.0. Dopodichè va a ciclare nella
     * lista menu, prendendo il prezzo medio delle portate in ogni menu che, sommate tra loro, si ottiene la
     * sommaPrezziMedi.
     * @return la mediaDeiMenu
     */
    public Map<Menu, Double> PrezzoMedioMenuRistorante(){
        Map<Menu,Double> medieDeiMenu = new HashMap<>();

        double sommaPrezziMedi = 0.0;
        for(Menu menu : menuList) {
            sommaPrezziMedi = menu.prezzoMedioListePortate();

            double mediaMenu = sommaPrezziMedi;
            medieDeiMenu.put(menu,mediaMenu);
        }
        return medieDeiMenu;
    }

    /**
     * funzione utilizzata per calcolare la media tra tutti i menu.
     */
    public void printPrezzoMediodeiMenuRistorante(){
        Map<Menu,Double>medieDeiMenu= PrezzoMedioMenuRistorante();
        for(Map.Entry<Menu,Double> entry : medieDeiMenu.entrySet()){
            Menu menu = entry.getKey();
            double mediaMenu = entry.getValue();

            System.out.print("Il prezzo medio a persona del " + menu.getName().toLowerCase() + " (bevande escluse, coperto incluso) è:" + String.format("%.2f", mediaMenu+getCoperto())+"€" + "\n");

        }
    }

    /**
     * funzione utilizzata per stampare il menu completo del ristorante.Essa cicla all'interno della lista menu
     * stampando le portate con i rispettivi prezzi in differenti colori, con un prezzo medio di ogni tipologia
     * di menu presente
     */
    public void printRistoranteTotale(){
        System.out.println(String.format("\n %-5s %-35s %-50s %-50s\n",  ColoriEnum.YELLOW_BOLD.getANSI_Code(), " ", this.name, ""));
        System.out.print(String.format("\n %-45s %-50s %-50s\n", "", TipoDiCucinaEnum.ITALIANA.getDescrizioneCucina(), " "));
        System.out.print(ColoriEnum.ANSI_RESET.getANSI_Code());

        for(Menu menuu : menuList){
            System.out.print(String.format(" \n\n%-5s %-48s %-50s %-50s\n", ColoriEnum.PURPLE_BOLD.getANSI_Code() ," ", menuu.getName().toUpperCase(), " "));
            menuu.printPrezzoMedioListePortate();
            System.out.print(ColoriEnum.ANSI_RESET.getANSI_Code());
            menuu.printMenu();
        }
    }
    /**
     * funzione utilizzata per conoscere il coperto
     */
    public void printCoperto(){
        System.out.println(getCoperto() + "€");
    }
}


