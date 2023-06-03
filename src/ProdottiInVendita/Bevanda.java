package ProdottiInVendita;

import Enumerations.TipoDiPiattoEnum;
/**
 * Classe pubblica che estende la classe Portata utilizzata per gestire la Bevanda.
 */
public class Bevanda extends Portata {

    public Bevanda(String name, String description, double price, TipoDiPiattoEnum tipoDiPiatto) {
        super (name,description,price, tipoDiPiatto);
    }

}
