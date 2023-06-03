package ProdottiInVendita;

import Enumerations.TipoDiPiattoEnum;

/**
 * Classe astratta che estende i propri campi in tutte le classi presenti nel folder ProdottiInVendita.
 * Presenta nei propri campi un String name, un String description, un double price e un TipodiPiattoEnum
 */
public abstract class Portata {
    protected String name;
    protected String description;
    protected double price;
    private TipoDiPiattoEnum tipo;

    /**
     * costruttore che prende in input un String name, String description, double price e un TipoDiPiattoEnum
     * e restituisce un oggetto di classe astratta Portata, che servirà per le altre classi a cui fa riferimento.
     *
     * @param name
     * @param description
     * @param price
     * @param tipo
     */
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

    /**
     * funzione che permette la stampa della portata in un formato differente
     */
    public void printPortataFormattata(){
        System.out.println("\n");
        System.out.printf("%-50s %60s %n" + this.description, this.name.toUpperCase(), String.format("%.2f", this.price) + " €" );
    }

}