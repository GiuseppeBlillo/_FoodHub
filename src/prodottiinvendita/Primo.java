package prodottiinvendita;

import enumerations.CotturaPastaEnum;
import enumerations.TipoDiPiattoEnum;

/**
 * Classe pubblica che estende la classe Portata, utilizzata per gestire il Primo.
 */
public class Primo extends Portata{

    private CotturaPastaEnum cotturaPasta;


    public Primo(String name, String description, double price, TipoDiPiattoEnum tipoDiPiatto) {
        super(name, description, price, tipoDiPiatto);
    }

    public CotturaPastaEnum getCotturaPasta() {
        return cotturaPasta;
    }

    public void setCotturaPasta(CotturaPastaEnum cotturaPasta) {
        this.cotturaPasta = cotturaPasta;
    }
}
