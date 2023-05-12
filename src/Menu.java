public class Menu {
    private String name;
    public String description;
    public boolean isGlutenFree;

    //TODO ha una portata o un insieme di portate?

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isGlutenFree() {
        return isGlutenFree;
    }

    public void setGlutenFree(boolean glutenFree) {
        isGlutenFree = glutenFree;
    }

    public Menu(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Menu(String name, String description, boolean isGlutenFree) {
        this.name = name;
        this.description = description;
        this.isGlutenFree = isGlutenFree;
    }

    //TODO ragazzi gli enum non servono per questo, la logica va messa dentro il menù che è la classe che calcaloa il prezzo
    //TODO MenuEnum
    public enum menu{
        PRIMI,SECONDI,DESSERT,COPERTO;
        double setMenuPrice(double price){
            switch (this){
                case PRIMI -> {price += 3.00;}
                case SECONDI -> { price += 3.00;}
                case DESSERT ->{price += 2.50;}
                case COPERTO ->{price += 2.50;}
                default -> {price += 1.50;}
            }
            return price;
        }
    }
}
