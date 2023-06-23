package prodottiinvendita;

import enumerations.TemperaturaDessertEnum;
import enumerations.TipoDiPiattoEnum;

/**
 * Classe pubblica che estende la classe Portata, utilizzata per gestire il Dessert.
 */
public class Dessert extends Portata{

    private TemperaturaDessertEnum temperatura;


    public Dessert(String name, String description, double price, TipoDiPiattoEnum tipoDiPiatto) {
        super(name, description, price, tipoDiPiatto);
    }

    public TemperaturaDessertEnum getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(TemperaturaDessertEnum temperatura) {
        this.temperatura = temperatura;
    }
}
