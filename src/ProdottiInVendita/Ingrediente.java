package ProdottiInVendita;

/**
 * Classe pubblica che gestisce l'Ingrediente che presenta nei propri fields un String name e 4 booleani di
 * lactose_free, vegeterian, vegan e gluten_free.
 */
public class Ingrediente {
    private String name;
    private boolean lactose_free;
    private boolean vegeterian;
    private boolean vegan;
    private boolean gluten_free;

    /**
     * costruttore che prende in input un String name e tutti i booleani presenti nei campi e restituisce un oggetto
     * di classe Ingrediente.
     * @param name
     * @param lactose_free
     * @param vegeterian
     * @param vegan
     * @param gluten_free
     */
    public Ingrediente(String name, boolean lactose_free, boolean vegeterian, boolean vegan, boolean gluten_free) {
        this.name = name;
        this.lactose_free = lactose_free;
        this.vegeterian = vegeterian;
        this.vegan = vegan;
        this.gluten_free = gluten_free;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isLactose_free() {
        return lactose_free;
    }

    public void setLactose_free(boolean lactose_free) {
        this.lactose_free = lactose_free;
    }

    public boolean isVegeterian() {
        return vegeterian;
    }

    public void setVegeterian(boolean vegeterian) {
        this.vegeterian = vegeterian;
    }

    public boolean isVegan() {
        return vegan;
    }

    public void setVegan(boolean vegan) {
        this.vegan = vegan;
    }

    public boolean isGluten_free() {
        return gluten_free;
    }

    public void setGluten_free(boolean gluten_free) {
        this.gluten_free = gluten_free;
    }
}
