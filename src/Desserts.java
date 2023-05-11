import java.text.DecimalFormat;
import java.util.regex.Pattern;
public class Desserts extends Menu implements Methods {
    public Desserts(String name, String description, boolean isGlutenFree) {
        super(name, description, isGlutenFree);
    }

    public Desserts(String name, String description) {
        super(name, description);
    }
    @Override
    public double augPrice() {
        double totPrice = 0.0;
        String[] ingList = Pattern.compile("\\W+").split(description);
        for (String ing : ingList) {
            if (Ingredienti.getIngredients().get(ing) != null) {
                totPrice += Ingredienti.getIngredients().get(ing);
            }
        }return totPrice;
    }
    @Override
    public void printPrice() {
        DecimalFormat x = new DecimalFormat("#.00");
        System.out.println(x.format(augPrice()) + "€");
    }
    @Override
    public String finalPrice() {
        double basePrice = augPrice();
        double impPrice = menu.DESSERT.setMenuPrice(basePrice);
        double extraPrice = this.isGlutenFree ? 0.0 : 2.0;
        DecimalFormat x = new DecimalFormat("#.00");
        return x.format(impPrice + extraPrice);
    }
    @Override
    public void printFinalPrice() {
        System.out.println(finalPrice() + "€");
    }
}

