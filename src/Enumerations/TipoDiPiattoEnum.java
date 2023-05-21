package Enumerations;

public enum TipoDiPiattoEnum {
   ANTIPASTO("Antipasto"),
    PRIMO("Primo"),
    SECONDO("Secondo"),
    DESSERT("Dessert"),
    BEVANDA("Bevanda");

   private String tipologia;

    TipoDiPiattoEnum(String tipologia) {
        this.tipologia = tipologia;
    }

    public String getTipologia() {
        return tipologia;
    }

}
