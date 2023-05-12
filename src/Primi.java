import java.text.DecimalFormat;
import java.util.regex.Pattern;
public class Primi extends Menu implements PriceInterface {
    public Primi(String name, String description, boolean isGlutenFree) {
        super(name, description, isGlutenFree);
    }

    public Primi(String name, String description) {
        super(name, description);
    }

    //TODO niente chiamate statiche e cerchiamo di lavorare con le liste e gli oggetti,
    //TODO questa cosa se mettiamo una lista di enum ingrediente ognuno con il proprio prezzo
    // non c'è bisogno di fare chiamate statiche
    @Override
    public double augPrice() {
        double totPrice = 0.0;
        String[] ingList = Pattern.compile("\\W+").split(description);
        for (String ing : ingList) {
            if (Ingredienti.getIngredients().get(ing) != null) {
                totPrice += Ingredienti.getIngredients().get(ing);
            }
        }
        return totPrice;
    }
    @Override
    public void printPrice() {
        DecimalFormat x = new DecimalFormat("#.00");
        System.out.println(x.format(augPrice()) + "€");
    }
    @Override
    public String finalPrice() {
        double basePrice = augPrice();
        double impPrice = menu.PRIMI.setMenuPrice(basePrice);
        double extraPrice = this.isGlutenFree ? 0.0 : 2.0;
        DecimalFormat x = new DecimalFormat("#.00");
        return x.format(impPrice + extraPrice);
    }
    @Override
    public void printFinalPrice() {
        System.out.println(finalPrice() + "0 €");
    }
}