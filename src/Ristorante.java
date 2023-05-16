import java.util.ArrayList;
import java.util.List;

public class Ristorante {
    private String name;
    private List<Menu> MenuRistorante;

    public Ristorante(String name) {
        this.MenuRistorante = new ArrayList<>();
        this.name = name;
    }

    public void addmenu(Menu y){
        this.MenuRistorante.add(y);
    }
    /*public void printMenu(){
        for(Menu i : getMenuRistorante()){
            System.out.println(i.getName());
        }
    }

     */
    public void printAllMenu(){
        System.out.println(String.format("%-60s %-80s","",this.name));
        System.out.println("");
        for(Menu i : getMenuRistorante()){
            System.out.println("\033[0;1m" +"\u001B[33m"+i.getName().toUpperCase()+"\u001B[0m");
            System.out.println("");
            for(Portata x : i.getPortataList()){
                System.out.print(String.format("%-50s %-80s %5s\n",x.getName().toUpperCase()," ",x.getPrice()));
                System.out.println("\033[3m"+x.getDescription()+"\033[0m");
                System.out.println("");
            }
            for(Bevanda y : i.getBevandaList()){
                System.out.print(String.format("%-50s %-80s %5s\n",y.getName().toUpperCase()," ",y.getPrice()));
                System.out.println("\033[3m"+y.getDescription()+"\033[0m");
                System.out.println("");
            }
        }
    }

    public List<Menu> getMenuRistorante() {
        return MenuRistorante;
    }

    public void setMenuRistorante(List<Menu> menuRistorante) {
        MenuRistorante = menuRistorante;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void main(String[] args) {

        Ristorante daLillo = new Ristorante("Da Lillo");

        Menu menuPrimiDiTerra = new Menu("Primi Piatti di terra");
        Portata pastaCarbonara = new Portata("Pasta alla Carbonara", "Pasta con uovo,formaggio e guanciale", 10.00);
        Portata cacioEPepe = new Portata("Pasta cacio e pepe", "Pasta condita con pepe condita con cacio", 10.00);
        Portata tagliatelle = new Portata("Tagliatelle di cinghiale", "Tagliatelle al ragu di cinghiale e formaggio", 12.00);
        Portata tagliatelleFunghi = new Portata("Tagliatelle con i porcini", "Tagliatelle con porcini e una grattuggiata di formaggio", 14.00);
        Portata gnocchetti = new Portata("GNOCCHETTI ALLA CAMPIDANESE", "Gnocchi con ragù alla salsiccia di maiale e pecorino sardo", 15.00);
        Portata tortelli = new Portata("Tortelli di Manzo", "Tortelli allo stracotto di manzo, radice daikon", 16.00);
        menuPrimiDiTerra.addPortata(cacioEPepe);
        menuPrimiDiTerra.addPortata(tagliatelleFunghi);
        menuPrimiDiTerra.addPortata(tagliatelle);
        menuPrimiDiTerra.addPortata(gnocchetti);
        menuPrimiDiTerra.addPortata(tortelli);
        menuPrimiDiTerra.addPortata(pastaCarbonara);
        Menu menuPrimiDiMare = new Menu("Primi piatti di mare");
        Portata spaghettiCartoccio = new Portata("Spaghettti al cartoccio", "Spaghetti al cartoccio ai frutti di mare", 14.00);
        Portata ravioli = new Portata("Ravioli", "Ravioli di branzino con bottarga di tonno", 14.00);
        Portata cavatelli = new Portata("Cavatelli", "Cavatelli al ragu di gambero e pistacchio", 14.00);
        Portata linguineScoglio = new Portata("Linguine allo scoglio", "Linguine con cozze, vongole, cannolicchi, gamberi e calamari", 16.00);
        Portata linguineVongoleELimone = new Portata("Linguine vongole E Limone", "Linguine con vongole con grattata di scorza di limone", 12.00);
        Portata mezziPaccheri = new Portata("Mezzi paccheri con Gambero rosso", "Mezzi paccheri con gambero rosso e crema di zucchine.", 20.00);
        menuPrimiDiMare.addPortata(spaghettiCartoccio);
        menuPrimiDiMare.addPortata(ravioli);
        menuPrimiDiMare.addPortata(cavatelli);
        menuPrimiDiMare.addPortata(linguineScoglio);
        menuPrimiDiMare.addPortata(linguineVongoleELimone);
        menuPrimiDiMare.addPortata(mezziPaccheri);

        daLillo.addmenu(menuPrimiDiTerra);
        daLillo.addmenu(menuPrimiDiMare);


        System.out.println("\nEcco a voi il nostro Menu:");
        daLillo.printAllMenu();

    }
}