package enumerations;

public enum CotturaPastaEnum {
    AL_DENTE("Cottura al dente"),
    MEDIA_COTTURA("Media cottura"),
    BEN_COTTA("Ben cotta");

    String descrizione;


    CotturaPastaEnum(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDescrizione() {
        return descrizione;
    }
}
