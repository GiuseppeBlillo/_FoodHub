import Enumerations.TipoDiCucinaEnum;
import Enumerations.TipoDiMenuEnum;
import Enumerations.TipoDiPiattoEnum;
import Gestione.Cliente;
import Gestione.IndirizzoRecord;
import Miscellaneous.MenuAllaCarta;
import Miscellaneous.Ristorante;
import ProdottiInVendita.*;

public class Main {
    public static void main(String[] args)throws Exception {

        Ristorante r1 = new Ristorante("R I S T O R A N T E    D A    L I L L O", TipoDiCucinaEnum.ITALIANA);

        MenuAllaCarta menuCarne = new MenuAllaCarta("Menù di Carne", "Chef Peter Cross", TipoDiMenuEnum.CARNE);
        Antipasto a5 = new Antipasto("Bruschetta", "Tipica bruschetta con aglio tritato fino, origano, olio e pomodorini", 6.00, TipoDiPiattoEnum.ANTIPASTO);
        Antipasto a8 = new Antipasto("Tagliere Salumi E Formaggi", "Salumi di stagione con tipici formaggi locali", 16.00,TipoDiPiattoEnum.ANTIPASTO);
        Antipasto a9 = new Antipasto("Insalata Mista", "Insalata mista di radicchio, rucola e lattuga iceberg", 6.50, TipoDiPiattoEnum.ANTIPASTO);
        Antipasto a10 = new Antipasto("Patatine Fritte", "Frittura di patate con buccia", 6.00, TipoDiPiattoEnum.ANTIPASTO);

        menuCarne.addPortata(a5);
        menuCarne.addPortata(a8);
        menuCarne.addPortata(a9);
        menuCarne.addPortata(a10);

        Primo pt1 = new Primo("Carbonara", "Pasta con uovo, formaggio e guanciale", 10.00, TipoDiPiattoEnum.PRIMO);
        Primo pt2 = new Primo("Cacio e Pepe", "Pasta condita con cacio e pepe", 10.00, TipoDiPiattoEnum.PRIMO);
        Primo pt3 = new Primo("Tagliatelle di Cinghiale", "Tagliatelle al ragu di cinghiale e formaggio", 12.00, TipoDiPiattoEnum.PRIMO);
        Primo pt4 = new Primo("Tagliatelle ai Funghi Porcini", "Tagliatelle con porcini e una grattuggiata di formaggio", 14.00, TipoDiPiattoEnum.PRIMO);
        Primo pt5 = new Primo("Gnocchetti alla Campidanese", "Gnocchi con ragù di salsiccia e pecorino sardo", 15.00,TipoDiPiattoEnum.PRIMO);
        Primo pt6 = new Primo("Tortelli di Manzo", "Tortelli allo stracotto di manzo e radice di Daikon", 16.00, TipoDiPiattoEnum.PRIMO);

        menuCarne.addPortata(pt1);
        menuCarne.addPortata(pt2);
        menuCarne.addPortata(pt3);
        menuCarne.addPortata(pt4);
        menuCarne.addPortata(pt5);
        menuCarne.addPortata(pt6);



        Secondo st1 = new Secondo("Tagliata di Manzo", "Tagliato di manzo con taglio largo ai ferri", 14.00, TipoDiPiattoEnum.SECONDO);
        Secondo st2 = new Secondo("Controfiletto", "Controfiletto di manzo cotto a bassa temperatura, crema di patate al tartufo e fondo bruno",22.00, TipoDiPiattoEnum.SECONDO);
        Secondo st3 = new Secondo("Tomahawk", "Tomahawk bistecca servita con verdure grigliate", 65.00, TipoDiPiattoEnum.SECONDO);
        Secondo st4 = new Secondo("Pancetta Tesa", "Pancia di maiale sardo cotto a bassa temperatura, crema di finocchi, belga scottata", 17.00, TipoDiPiattoEnum.SECONDO);
        Secondo st5 = new Secondo("Grigliata Mista", "Grigliata mista di maiale, pollo e manzo", 17.00, TipoDiPiattoEnum.SECONDO);

        menuCarne.addPortata(st1);
        menuCarne.addPortata(st2);
        menuCarne.addPortata(st3);
        menuCarne.addPortata(st4);
        menuCarne.addPortata(st5);

        MenuAllaCarta menuPesce = new MenuAllaCarta("Menù di Pesce", "Chef Joseph Blondelil", TipoDiMenuEnum.PESCE);

        Antipasto a1 = new Antipasto("Insalata di Mare", "Insalata di mare con seppie, gamberi e verdure", 12.00, TipoDiPiattoEnum.ANTIPASTO);
        Antipasto a2 = new Antipasto("Cozze E Vongole", "Impepata di cozze e vongole", 10.00, TipoDiPiattoEnum.ANTIPASTO);
        Antipasto a3 = new Antipasto("Scampi", "Crudità di scampi, 3 pz", 8.00, TipoDiPiattoEnum.ANTIPASTO);
        Antipasto a4 = new Antipasto("Gratinato di Pesce", "Pescato del giorno al gratin, con aggiunta di scampi", 14.00, TipoDiPiattoEnum.ANTIPASTO);
        Antipasto a6 = new Antipasto("Frittura Mista di Mare", "Frittura di mare con calamaretti, gamberetti e cipolla fritta", 10.00, TipoDiPiattoEnum.ANTIPASTO);
        Antipasto a7 = new Antipasto("Salmone e Alici Marinate", "Un filetto di salmone fresco affumicato servito con alici marinate", 9.00, TipoDiPiattoEnum.ANTIPASTO);

        menuPesce.addPortata(a1);
        menuPesce.addPortata(a2);
        menuPesce.addPortata(a3);
        menuPesce.addPortata(a4);
        menuPesce.addPortata(a6);
        menuPesce.addPortata(a7);
/*

        Primo pm1 = new Primo("Spaghettti al cartoccio", "Spaghetti al cartoccio ai frutti di mare", 14.00, TipoDiPiattoEnum.PRIMO);
        Primo pm2 = new Primo("Ravioli", "Ravioli di branzino con bottarga di tonno", 14.00, TipoDiPiattoEnum.PRIMO);
        Primo pm3 = new Primo("Cavatelli", "Cavatelli al ragu di gambero e pistacchio", 14.00, TipoDiPiattoEnum.PRIMO);
        Primo pm4 = new Primo("Linguine allo scoglio", "Linguine con cozze, vongole, cannolicchi, gamberi e calamari", 16.00, TipoDiPiattoEnum.PRIMO);
        Primo pm5 = new Primo("Linguine vongole E Limone", "Linguine con vongole con grattata di scorza di limone", 12.00, TipoDiPiattoEnum.PRIMO);
        Primo pm6 = new Primo("Mezzi paccheri con Gambero rosso", "Mezzi paccheri con gambero rosso e crema di zucchine.", 20.00, TipoDiPiattoEnum.PRIMO);

        menuPesce.addPortata(pm1);
        menuPesce.addPortata(pm2);
        menuPesce.addPortata(pm3);
        menuPesce.addPortata(pm4);
        menuPesce.addPortata(pm5);
        menuPesce.addPortata(pm6);

        Secondo sm1 = new Secondo("Fritto Misto", "La nostra frittura di calamari, gamberi e paranza con maionese", 20.00, TipoDiPiattoEnum.SECONDO);
        Secondo sm2 = new Secondo("Ombrina", "Ombrina alla piastra, crema di fave, bietola scottata, millefoglie di patate", 25.00, TipoDiPiattoEnum.SECONDO);
        Secondo sm3 = new Secondo("Tonno", "Tonno scottato, caponata, patate dauphine", 22.00, TipoDiPiattoEnum.SECONDO);
        Secondo sm4 = new Secondo("Grigliata di pesce", "Pescato del giorno grigliato con gamberoni, tranci di calamaro e gamberonni", 17.00, TipoDiPiattoEnum.SECONDO);
        Secondo sm5 = new Secondo("Polpo alla brace", "Tenero polpo cotto alla brace", 15.00, TipoDiPiattoEnum.SECONDO);

        menuPesce.addPortata(sm1);
        menuPesce.addPortata(sm2);
        menuPesce.addPortata(sm3);
        menuPesce.addPortata(sm4);
        menuPesce.addPortata(sm5);

        Dessert d1 = new Dessert("Cassata siciliana", "Leggerissimo dolce siciliano", 4.00, TipoDiPiattoEnum.DESSERT);
        Dessert d2 = new Dessert("Cannolo siciliano", "Dolce con chantillea, pistacchio e granella di pistacchio", 5.00, TipoDiPiattoEnum.DESSERT);
        Dessert d3 = new Dessert("Semifreddo al Torrone", "Morbido torrone con ricattura di cacao", 6.00, TipoDiPiattoEnum.DESSERT);
        Dessert d4 = new Dessert("Tortino al cioccolato", "Tortino al cioccolato con cuore fondente caldo", 9.00, TipoDiPiattoEnum.DESSERT);
        Dessert d5 = new Dessert("Tiramisu", "Tiramisu classico", 9.00, TipoDiPiattoEnum.DESSERT);
        Dessert d6 = new Dessert("Millefoglie", "Millefoglie, crema pasticcera, frutta fresca", 9.00, TipoDiPiattoEnum.DESSERT);
        Dessert d7 = new Dessert("Seada Sarda", "Seada tradizionale sarda, miele, croccante alle mandorle", 9.00, TipoDiPiattoEnum.DESSERT);

        menuCarne.addPortata(d1);
        menuCarne.addPortata(d2);
        menuCarne.addPortata(d3);
        menuCarne.addPortata(d4);
        menuCarne.addPortata(d5);
        menuCarne.addPortata(d6);
        menuCarne.addPortata(d7);

        menuPesce.addPortata(d1);
        menuPesce.addPortata(d2);
        menuPesce.addPortata(d3);
        menuPesce.addPortata(d4);
        menuPesce.addPortata(d5);
        menuPesce.addPortata(d6);
        menuPesce.addPortata(d7);
*/
        Bevanda b1 = new Bevanda("Sardinian Pale Ale", "Pale Ale 0,50cl", 12.00, TipoDiPiattoEnum.BEVANDA);
        Bevanda b2 = new Bevanda("Sardinian Ipa", "IPA 0,50cl", 12.00, TipoDiPiattoEnum.BEVANDA);
        Bevanda b3 = new Bevanda("Sexy Pompia", "Fruit Beer 0,50cl", 12.00, TipoDiPiattoEnum.BEVANDA);
        Bevanda b4 = new Bevanda("Frieska", "Bière Blanche 0,75cl", 22.00, TipoDiPiattoEnum.BEVANDA);
        Bevanda b5 = new Bevanda("BB Verblonde", "Italian Grape Ale (IGA), alla sapa da uve Vermentino 0,75cl", 22.00, TipoDiPiattoEnum.BEVANDA);

        menuCarne.addPortata(b1);
        menuCarne.addPortata(b2);
        menuCarne.addPortata(b3);
        menuCarne.addPortata(b4);
        menuCarne.addPortata(b5);
/*
        menuPesce.addPortata(b1);
        menuPesce.addPortata(b2);
        menuPesce.addPortata(b3);
        menuPesce.addPortata(b4);
        menuPesce.addPortata(b5);

        Bevanda b6 = new Bevanda("Carbonare Inama", "Soave", 40.00, TipoDiPiattoEnum.BEVANDA);
        Bevanda b7 = new Bevanda("Vulcaia Naia", "Sauvignon Veneto", 34.00, TipoDiPiattoEnum.BEVANDA);
        Bevanda b8 = new Bevanda("Frus bianco", "Friuli", 35.00, TipoDiPiattoEnum.BEVANDA);
        Bevanda b9 = new Bevanda("Carricante Calabretta", "Sicilia", 30.00, TipoDiPiattoEnum.BEVANDA);
        Bevanda b10 = new Bevanda("Sauvignon Oberkerschbaum J. Hoffstatter", "Sauvignon - Trentino Alto Adige", 45.00, TipoDiPiattoEnum.BEVANDA);
        Bevanda b11 = new Bevanda("Vogelmaier Moscato giallo A. Lageder", "Moscato giallo - Magré Trentino Alto Adige", 30.00, TipoDiPiattoEnum.BEVANDA);
        Bevanda b12 = new Bevanda("Am Sand Gewurztraminer A. Lagerer", "Magré Trentino Alto Adige", 40.00, TipoDiPiattoEnum.BEVANDA);
        Bevanda b13 = new Bevanda("Derthona Vigneti Massa", "Timorasso - Monleale Piemonte", 40.00, TipoDiPiattoEnum.BEVANDA);
        Bevanda b14 = new Bevanda("Fiano d'Avellino- G.Marsella", "Fiano di Avellino", 40.00, TipoDiPiattoEnum.BEVANDA);

        menuCarne.addPortata(b6);
        menuCarne.addPortata(b7);
        menuCarne.addPortata(b8);
        menuCarne.addPortata(b9);
        menuCarne.addPortata(b10);
        menuCarne.addPortata(b11);
        menuCarne.addPortata(b12);
        menuCarne.addPortata(b13);
        menuCarne.addPortata(b14);

        menuPesce.addPortata(b6);
        menuPesce.addPortata(b7);
        menuPesce.addPortata(b8);
        menuPesce.addPortata(b9);
        menuPesce.addPortata(b10);
        menuPesce.addPortata(b11);
        menuPesce.addPortata(b12);
        menuPesce.addPortata(b13);
        menuPesce.addPortata(b14);

        Bevanda b15 = new Bevanda("Barolo Villero 2012 Oddero", "La Morra - Piemonte", 85.00, TipoDiPiattoEnum.BEVANDA);
        Bevanda b16 = new Bevanda("Barbera d’Alba Eugenio Bocchino", "Piobesi D'Alba", 33.00, TipoDiPiattoEnum.BEVANDA);
        Bevanda b17 = new Bevanda("Pinot nero Trattman Girlan", "Trentino Alto Adige", 65.00, TipoDiPiattoEnum.BEVANDA);
        Bevanda b18 = new Bevanda("Terra di Lavoro 2013/2014 Galardi", "Aglianico, Piedirosso - Sessa Aurunca Campania", 65.00, TipoDiPiattoEnum.BEVANDA);
        Bevanda b19 = new Bevanda("Guido Alberto Tenute San Guido", "Cabernet Sauvignon, Merlot - Bolgheri - Toscana", 75.00, TipoDiPiattoEnum.BEVANDA);
        Bevanda b20 = new Bevanda("Le Volte dell’Ornellaia", "Merlot, Sangiovese, Cabernet Sauvignon - Bolgheri - Toscana", 45.00, TipoDiPiattoEnum.BEVANDA);
        Bevanda b21 = new Bevanda("Le Serre Nuove dell’Ornellaia 2016", "Cabernet Sauvignon, Merlot, Cabernet Franc, Petit Verdot Bolgheri - Toscana", 75.00, TipoDiPiattoEnum.BEVANDA);
        Bevanda b22 = new Bevanda("Ornellaia 2014", "Cabernet Sauvignon, Merlot, Cabernet Franc, Petit Verdot Bolgheri - Toscana", 280.00, TipoDiPiattoEnum.BEVANDA);
        Bevanda b23 = new Bevanda("Solaia Antinori 1999/2008", "Cabernet Sauvignon, Sangiovese, Cabernet Franc San Casciano - Toscana", 350.00, TipoDiPiattoEnum.BEVANDA);

        menuCarne.addPortata(b15);
        menuCarne.addPortata(b16);
        menuCarne.addPortata(b17);
        menuCarne.addPortata(b18);
        menuCarne.addPortata(b19);
        menuCarne.addPortata(b20);
        menuCarne.addPortata(b21);
        menuCarne.addPortata(b22);

        menuCarne.addPortata(b23);

        menuPesce.addPortata(b15);
        menuPesce.addPortata(b16);
        menuPesce.addPortata(b17);
        menuPesce.addPortata(b18);
        menuPesce.addPortata(b19);
        menuPesce.addPortata(b20);
        menuPesce.addPortata(b21);
        menuPesce.addPortata(b22);
        menuPesce.addPortata(b23);
        menuPesce.removePortata(b23);

 */

        r1.addMenu(menuPesce);

        r1.addMenu(menuCarne);

        r1.printRistoranteTotale();

        r1.setCoperto(2);

        menuCarne.printPrezzoMedioListePortate();


        r1.printRistoranteTotale();


        Cliente gino =new Cliente("","",null,0);
        //IndirizzoRecord indirizzoRecord = new IndirizzoRecord("Via Dai Piedi", 10, 1234);
        //gino.setAddress(indirizzoRecord);
        //System.out.println(gino.getAddress());
    }
}
