public class Menu {
    private String description;
    private double price;

    public Menu(String description, double price) {
        this.description = description;
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void printDescription(){
        System.out.println(this.description);
    }
    public void printPrice(){
        System.out.println(this.price);
    }
}