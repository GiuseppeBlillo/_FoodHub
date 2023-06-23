package prodottiinvendita;

import enumerations.CotturaCarneEnum;
import enumerations.TipoDiPiattoEnum;

/**
 * Classe pubblica che estende la classe Portata, utilizzata per gestire il Secondo.
 */
public class Secondo extends Portata {

    private CotturaCarneEnum cotturaCarne;
    public Secondo(String name, String description, double price, TipoDiPiattoEnum tipoDiPiatto) {
        super(name, description, price, tipoDiPiatto);
    }

    public CotturaCarneEnum getCotturaCarne() {
        return cotturaCarne;
    }

    public void setCotturaCarne(CotturaCarneEnum cotturaCarne) {
        this.cotturaCarne = cotturaCarne;
    }
}
