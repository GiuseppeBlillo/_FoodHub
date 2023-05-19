package ProdottiInVendita;

public abstract class Prodotto {
    protected String name;
    protected String description;
    protected double price;

    //TODO sistemare
    private TipoProdottoEnum tipo;

    public Prodotto(String name, String description, double price, String tipo) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.tipo = tipo;
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


    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    //TODO inserire metodo di stampa
}
