package ProdottiInVendita;

import Enumerations.ColoriEnum;
import Enumerations.TipoDiPiattoEnum;


public abstract class Portata {
    protected String name;
    protected String description;
    protected double price;
    private TipoDiPiattoEnum tipo;

    public Portata(String name, String description, double price, TipoDiPiattoEnum tipo) {
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

    public TipoDiPiattoEnum getTipo() {
        return tipo;
    }

    public void setTipo(TipoDiPiattoEnum tipo) {
        this.tipo = tipo;
    }

    public void printPortata(ColoriEnum coloreDescrizione, ColoriEnum colorePortata) {
        System.out.print("\n" + (String.format("%-1s %-50s %-60s %9s\n", colorePortata.getANSI_Code(), getName().toUpperCase(), "",  String.format("%.2f", getPrice()) + " €")));
        System.out.print(String.format("%-5s", coloreDescrizione.getANSI_Code() + getDescription()));
    }

}