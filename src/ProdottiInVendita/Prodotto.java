package ProdottiInVendita;

public abstract class Prodotto {
    protected String name;
    protected String description;
    protected double price;

    public Prodotto(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }
}
