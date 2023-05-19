package ProdottiInVendita;

public abstract class Prodotto {
    protected String name;
    protected String description;
    protected double price;
    private TipoPortata tipoPortata;

    public Prodotto(String name, String description, double price, TipoPortata tipoPortata) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.tipoPortata=tipoPortata;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public TipoPortata getTipoPortata() {
        return tipoPortata;
    }

    public void setTipoPortata(TipoPortata tipoPortata) {
        this.tipoPortata = tipoPortata;
    }

}
