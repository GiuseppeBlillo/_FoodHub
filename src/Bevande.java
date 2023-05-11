import java.text.DecimalFormat;

public class Bevande extends Menu implements Methods {
    private double price;
    public Bevande(String name, String description) {
        super(name, description);
    }

    public Bevande(String name, String description, double price) {
        super(name, description);
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double augPrice() {
        return this.price;
    }

    @Override
    public void printPrice() {
        DecimalFormat x = new DecimalFormat("#.00");
        System.out.println(x.format(augPrice()) + "€");
    }

    @Override
    public String finalPrice() {
        double basePrice = augPrice();
        double impPrice = menu.COPERTO.setMenuPrice(basePrice);
        double extraPrice = this.isGlutenFree ? 0.0 : 2.0;
        DecimalFormat x = new DecimalFormat("#.00");
        return x.format(impPrice + extraPrice);
    }

    @Override
    public void printFinalPrice() {
        System.out.println(finalPrice() + "€");
    }
}