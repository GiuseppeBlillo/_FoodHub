package Enumerations;

public enum TipoDiMenuEnum {
    CARNE("Carne"),
    PESCE("Pesce"),
    ONNIVORO("Onnivoro"),
    VEGANO("Vegano"),
    VEGETARIANO("Vegetariano"),
    GLUTENFREE("Senza Glutine");
    private String tipologia;

    TipoDiMenuEnum(String tipologia) {
        this.tipologia = tipologia;
    }

    public String getTipologia() {
        return tipologia;
    }
}
