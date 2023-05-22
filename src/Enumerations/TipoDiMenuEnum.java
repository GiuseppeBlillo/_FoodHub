package Enumerations;

public enum TipoDiMenuEnum {
    CARNE("Menù di Carne"),
    PESCE("Menù di Pesce"),
    ONNIVORO("Menù Onnivoro"),
    VEGANO("Menù Vegano"),
    VEGETARIANO("Menù Vegetariano"),
    GLUTENFREE("Menù Gluten-Free");
    private String descrizione;

    TipoDiMenuEnum(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDescrizione() {
        return descrizione;
    }
}
