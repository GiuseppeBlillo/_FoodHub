package prodottiinvendita;

import enumerations.TipoDiPiattoEnum;

/**
 * Classe pubblica che estende la classe Portata utilizzata per gestire l' Antipasto
 */
public class Antipasto extends Portata {
    public Antipasto(String name, String description, double price, TipoDiPiattoEnum tipoDiPiatto) {
        super(name, description, price, tipoDiPiatto);
    }
}

