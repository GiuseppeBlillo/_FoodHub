package enumerations;

public enum CotturaCarneEnum {

    AL_SANGUE("Cottura al sangue"),
    COTTURA_MEDIA("Media cottura"),
    BEN_COTTA("Ben cotta");

    String descrizione;

    CotturaCarneEnum(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDescrizione() {
        return descrizione;
    }
}
