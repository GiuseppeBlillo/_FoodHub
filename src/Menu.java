public class Menu {
    private String name,description;
    private double price;

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    enum ingredienti{
        POMODORO(0.5);

        private double ingPrice;
        ingredienti (double ingPrice){
            this.ingPrice = ingPrice;
        }
        public double getIngPrice(){
            return ingPrice;
        }
    }
    public static double countPrice(String description){
        double totPrice= 0.0;
        String[] ingredients = description.split("[\\s|;|\n|!|@|#|$|&|%|=]");
        for (String in :ingredients){
            try{
                totPrice+=ingredienti.valueOf(in.trim().toUpperCase()).getIngPrice();
            } catch (Exception e){}
        }
        return totPrice;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void printPrice(){
        System.out.println(countPrice(getDescription()) + " €");
    }
    public void printDescr(){
        System.out.println(getDescription());
    }
    public void printName(){
        System.out.println(getName());
    }
}