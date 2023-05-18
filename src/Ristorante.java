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
        Menu menuAntipasto = new Menu("Antipasti");
        Portata insalataDimare = new Portata("Insalata di Mare", "Insalata di mare con seppie, gamberi e verdure", 12.00);
        Portata cozzeEVongole = new Portata("Cozze E Vongole", "Impepata di cozze e vongole", 10.00);
        Portata scampi = new Portata("Scampi", "Crudità di scampi, 3 pz", 8.00);
        Portata pesceAlGratin = new Portata("Gratinato di Pesce", "Pescato del giorno al gratin, con aggiunta di scampi", 14.00);
        Portata bruschetta = new Portata("Bruschetta", "Tipica bruschetta con aglio tritato fino, origano, olio e pomodorini", 6.00);
        Portata fritturaMista = new Portata("Frittura Mista di Mare", "Frittura di mare con calamaretti, gamberetti e cipolla fritta", 10.00);
        Portata salmoneEAliciMarinate = new Portata("Salmone e Alici Marinate", "Un filetto di salmone fresco affumicato servito con alici marinate", 9.00);
        Portata tagliereSalumiEFormaggi = new Portata("Tagliere Salumi E Formaggi", "Salumi di stagione con tipici formaggi locali", 16.00);
        Portata insalataMista = new Portata("Insalata Mista", "Insalata mista di radicchio, rucola e lattuga iceberg", 6.50);
        Portata patatineFritte = new Portata("Patatine Fritte", "Frittura di patate con buccia", 6.00);
        menuAntipasto.addPortata(insalataMista);
        menuAntipasto.addPortata(insalataDimare);
        menuAntipasto.addPortata(cozzeEVongole);
        menuAntipasto.addPortata(scampi);
        menuAntipasto.addPortata(pesceAlGratin);
        menuAntipasto.addPortata(bruschetta);
        menuAntipasto.addPortata(fritturaMista);
        menuAntipasto.addPortata(salmoneEAliciMarinate);
        menuAntipasto.addPortata(tagliereSalumiEFormaggi);
        menuAntipasto.addPortata(patatineFritte);
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
        Menu secondiDiMare = new Menu("Secondi piatti di mare");
        Portata frittoMisto = new Portata("Fritto Misto", "La nostra frittura di calamari, gamberi e paranza con maionese", 20.00);
        Portata ombrina = new Portata("Ombrina", "Ombrina alla piastra, crema di fave, bietola scottata, millefoglie di patate", 25.00);
        Portata tonno = new Portata("Tonno", "Tonno scottato, caponata, patate dauphine", 22.00);
        Portata grigliataDiPesce = new Portata("Grigliata di pesce", "Pescato del giorno grigliato con gamberoni, tranci di calamaro e gamberonni", 17.00);
        Portata polpo = new Portata("Polpo alla brace", "Tenero polpo cotto alla brace", 15.00);
        secondiDiMare.addPortata(frittoMisto);
        secondiDiMare.addPortata(ombrina);
        secondiDiMare.addPortata(tonno);
        secondiDiMare.addPortata(grigliataDiPesce);
        secondiDiMare.addPortata(polpo);
        Menu secondiTerra = new Menu("Secondi terra");
        Portata tagliataDiManzo = new Portata("Tagliata di Manzo", "Tagliato di manzo con taglio largo ai ferri",14.00);
        Portata controfiletto = new Portata("Controfiletto", "Controfiletto di manzo cotto a bassa temperatura, cipollotto scottato, crema di patate al tartufo, fondo bruno",22.00);
        Portata tomahawk = new Portata("Tomahawk", "Tomahawk bistecca servita con verdure grigliate",65.00);
        Portata pancettaTesa = new Portata("Pancetta Tesa", "Pancia di maiale sardo cotto a bassa temperatura, crema di finocchi, belga scottata",17.00);
        Portata grigliataMistaDiCarne = new Portata("Grigliata Mista", "Grigliata mista di maiale, pollo e manzo",17.00);
        secondiTerra.addPortata(tagliataDiManzo);
        secondiTerra.addPortata(controfiletto);
        secondiTerra.addPortata(tomahawk);
        secondiTerra.addPortata(pancettaTesa);
        secondiTerra.addPortata(grigliataMistaDiCarne);
        Menu dessert = new Menu("Dessert");
        Portata cassata = new Portata("Cassata siciliana","Leggerissimo dolce siciliano",4.00);
        Portata cannolo = new Portata("Cannolo siciliano","Dolce con chantillea, pistacchio e granella di pistacchio",5.00);
        Portata semifreddoTorrone = new Portata("Semifreddo al Torrone","Morbido torrone con ricattura di cacao",6.00);
        Portata tortino = new Portata("Tortino al cioccolato","Tortino al cioccolato con cuore fondente caldo",9.00);
        Portata tiramisu = new Portata("Tiramisu","Tiramisu classico",9.00);
        Portata milleFoglie = new Portata("Millefoglie","Millefoglie, crema pasticcera, frutta fresca",9.00);
        Portata seadaSarda = new Portata("Seada Sarda","Seada tradizionale sarda, miele, croccante alle mandorle",9.00);
        dessert.addPortata(cassata);
        dessert.addPortata(cannolo);
        dessert.addPortata(semifreddoTorrone);
        dessert.addPortata(tortino);
        dessert.addPortata(tiramisu);
        dessert.addPortata(milleFoglie);
        dessert.addPortata(seadaSarda);

        daLillo.addmenu(menuAntipasto);
        daLillo.addmenu(menuPrimiDiTerra);
        daLillo.addmenu(menuPrimiDiMare);
        daLillo.addmenu(secondiDiMare);
        daLillo.addmenu(secondiTerra);
        daLillo.addmenu(dessert);






        daLillo.printAllMenu();

    }
}