package Enumerations;

/**
 * Classe enum che gestisce i vari tipi di cucina
 */
public enum TipoDiCucinaEnum {
    ITALIANA("Cucina Tipica Italiana"),
    CINESE("Cucina Tipica Cinese"),
    GIAPPONESE("Cucina Tipica Giapponese"),
    INDIANA("Cucina Tipica Indiana"),
    THAILANDESE("Cucina Tipica Thai"),
    MESSICANA("Cucina Tipica Messicana"),
    GOURMET("Gourmet Cuisine"),
    FUSION("Fusion Cuisine"),
    VEGETARIANA("Cucina Vegetariana"),
    VEGANA("Veg Cuisine");

    private String descrizioneCucina;

    /**
     * costruttore della classe TipoDiCucina che prende in imput una Stringa e restituisce un oggetto di classe
     * @param descrizioneCucina
     */
    TipoDiCucinaEnum(String descrizioneCucina) {
        this.descrizioneCucina = descrizioneCucina;
    }

    public String getDescrizioneCucina() {
        return descrizioneCucina;
    }
}
