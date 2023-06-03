package ProdottiInVendita;

import Enumerations.TipoDiPiattoEnum;

/**
 * Classe pubblica che estende la classe Portata, utilizzata per gestire il Primo.
 */
public class Primo extends Portata{
    public Primo(String name, String description, double price, TipoDiPiattoEnum tipoDiPiatto) {
        super(name, description, price, tipoDiPiatto);
    }
}
