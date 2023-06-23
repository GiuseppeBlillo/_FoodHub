package enumerations;

public enum TemperaturaDessertEnum {
    CALDO("Servito caldo"),
    TEMPERATURA_AMBIENTE("Servito a temperatura ambiente"),
    FREDDO("Servito freddo");

    private String descrizione;

    TemperaturaDessertEnum(String descrizione) {
        this.descrizione = descrizione;
    }

    public String getDescrizione() {
        return descrizione;
    }
}
