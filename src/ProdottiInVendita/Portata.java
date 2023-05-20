package ProdottiInVendita;

import java.util.List;

public abstract class Portata {
    protected String name;
    protected String description;
    protected double price;

    public Portata(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
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

    public void printPortata(List<Portata> portate, Class<?> c){
        for(Portata p : portate){
            if (c.isInstance(p)){
                System.out.println(p.getName());
            }
        }
    }
}