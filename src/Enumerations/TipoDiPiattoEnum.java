package Enumerations;

/**
 * Classe enum che gestisce i tipi di portate presenti nel menu
 */
public enum TipoDiPiattoEnum {
   ANTIPASTO("Antipasto"),
    PRIMO("Primo"),
    SECONDO("Secondo"),
    DESSERT("Dessert"),
    BEVANDA("Bevanda");

   private String tipologia;

    /**
     * costruttore che prende in imput una Stringa e che restituiusce un oggetto di tipo classe
     * @param tipologia
     */
    TipoDiPiattoEnum(String tipologia) {
        this.tipologia = tipologia;
    }

    public String getTipologia() {
        return tipologia;
    }

}
