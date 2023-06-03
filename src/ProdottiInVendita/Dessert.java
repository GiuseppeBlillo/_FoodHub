package ProdottiInVendita;

import Enumerations.TipoDiPiattoEnum;

/**
 * Classe pubblica che estende la classe Portata, utilizzata per gestire il Dessert.
 */
public class Dessert extends Portata{
    public Dessert(String name, String description, double price, TipoDiPiattoEnum tipoDiPiatto) {
        super(name, description, price, tipoDiPiatto);
    }
}
