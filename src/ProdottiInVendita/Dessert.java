package ProdottiInVendita;

import Enumerations.TipoDiPiattoEnum;

public class Dessert extends Portata{
    public Dessert(String name, String description, double price, TipoDiPiattoEnum tipoDiPiatto) {
        super(name, description, price, tipoDiPiatto);
    }
}
