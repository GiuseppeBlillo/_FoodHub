package ProdottiInVendita;

import Enumerations.TipoDiPiattoEnum;


public class Antipasto extends Portata implements Printable{
    public Antipasto(String name, String description, double price, TipoDiPiattoEnum tipoDiPiatto) {
        super(name, description, price,tipoDiPiatto);
    }


    @Override
    public void printPortatePerTipo() {
        //qui dovremmo poterci stampare tutti gli antipasti all'interno di un menu

    }

    @Override
    public void printPortata() {
        System.out.println(String.format("%-50s %-80s %9s\n", getName().toUpperCase(), " ", String.format("%.2f", getPrice()) + " €") + "\033[3m" + getDescription() + "\033[0m\n\n");
    }
}

