import Miscelleneous.MenuAllaCarta;
import Miscelleneous.Ristorante;
import ProdottiInVendita.*;

import javax.sound.sampled.Port;

public class Main {
    public static void main(String[] args) {

        Ristorante r1 = new Ristorante("•._.••´¯``•.¸¸.•`  \uD83C\uDF54 \uD83C\uDF5F \uD83E\uDDC1 \uD83E\uDD54\uD83E\uDD54\uD83E\uDD54  R I S T O R A N T E    D A    L I L L O  \uD83E\uDD54\uD83E\uDD54\uD83E\uDD54 \uD83E\uDDC1 \uD83C\uDF5F \uD83C\uDF54  `•.¸¸.•´´¯`••._.•");

        MenuAllaCarta menuA = new MenuAllaCarta("Antipasti:");

        Antipasto a1 = new Antipasto("Insalata di Mare", "Insalata di mare con seppie, gamberi e verdure", 12.00);
        Antipasto a2 = new Antipasto("Cozze E Vongole", "Impepata di cozze e vongole", 10.00);
        Antipasto a3 = new Antipasto("Scampi", "Crudità di scampi, 3 pz", 8.00);
        Antipasto a4 = new Antipasto("Gratinato di Pesce", "Pescato del giorno al gratin, con aggiunta di scampi", 14.00);
        Antipasto a5 = new Antipasto("Bruschetta", "Tipica bruschetta con aglio tritato fino, origano, olio e pomodorini", 6.00);
        Antipasto a6 = new Antipasto("Frittura Mista di Mare", "Frittura di mare con calamaretti, gamberetti e cipolla fritta", 10.00);
        Antipasto a7 = new Antipasto("Salmone e Alici Marinate", "Un filetto di salmone fresco affumicato servito con alici marinate", 9.00);
        Antipasto a8 = new Antipasto("Tagliere Salumi E Formaggi", "Salumi di stagione con tipici formaggi locali", 16.00);
        Antipasto a9 = new Antipasto("Insalata Mista", "Insalata mista di radicchio, rucola e lattuga iceberg", 6.50);
        Antipasto a10 = new Antipasto("Patatine Fritte", "Frittura di patate con buccia", 6.00);

        menuA.addPortata(a1);
        menuA.addPortata(a2);
        menuA.addPortata(a3);
        menuA.addPortata(a4);
        menuA.addPortata(a5);
        menuA.addPortata(a6);
        menuA.addPortata(a7);
        menuA.addPortata(a8);
        menuA.addPortata(a9);
        menuA.addPortata(a10);

        MenuAllaCarta menuPT = new MenuAllaCarta("Primi Piatti di Terra:");

        Primo pt1 = new Primo("Pasta alla Carbonara", "Pasta con uovo,formaggio e guanciale", 10.00);
        Primo pt2 = new Primo("Pasta cacio e pepe", "Pasta condita con pepe condita con cacio", 10.00);
        Primo pt3 = new Primo("Tagliatelle di cinghiale", "Tagliatelle al ragu di cinghiale e formaggio", 12.00);
        Primo pt4 = new Primo("Tagliatelle con i porcini", "Tagliatelle con porcini e una grattuggiata di formaggio", 14.00);
        Primo pt5 = new Primo("GNOCCHETTI ALLA CAMPIDANESE", "Gnocchi con ragù alla salsiccia di maiale e pecorino sardo", 15.00);
        Primo pt6 = new Primo("Tortelli di Manzo", "Tortelli allo stracotto di manzo, radice daikon", 16.00);

        menuPT.addPortata(pt1);
        menuPT.addPortata(pt2);
        menuPT.addPortata(pt3);
        menuPT.addPortata(pt4);
        menuPT.addPortata(pt5);
        menuPT.addPortata(pt6);

        MenuAllaCarta menuPM = new MenuAllaCarta("Primi Piatti di Mare:");

        Primo pm1 = new Primo("Spaghettti al cartoccio", "Spaghetti al cartoccio ai frutti di mare", 14.00);
        Primo pm2 = new Primo("Ravioli", "Ravioli di branzino con bottarga di tonno", 14.00);
        Primo pm3 = new Primo("Cavatelli", "Cavatelli al ragu di gambero e pistacchio", 14.00);
        Primo pm4 = new Primo("Linguine allo scoglio", "Linguine con cozze, vongole, cannolicchi, gamberi e calamari", 16.00);
        Primo pm5 = new Primo("Linguine vongole E Limone", "Linguine con vongole con grattata di scorza di limone", 12.00);
        Primo pm6 = new Primo("Mezzi paccheri con Gambero rosso", "Mezzi paccheri con gambero rosso e crema di zucchine.", 20.00);

        menuPM.addPortata(pm1);
        menuPM.addPortata(pm2);
        menuPM.addPortata(pm3);
        menuPM.addPortata(pm4);
        menuPM.addPortata(pm5);
        menuPM.addPortata(pm6);

        MenuAllaCarta menuSM = new MenuAllaCarta("Secondi Piatti di Mare:");
        
        Secondo sm1 = new Secondo("Fritto Misto", "La nostra frittura di calamari, gamberi e paranza con maionese", 20.00);
        Secondo sm2 = new Secondo("Ombrina", "Ombrina alla piastra, crema di fave, bietola scottata, millefoglie di patate", 25.00);
        Secondo sm3 = new Secondo("Tonno", "Tonno scottato, caponata, patate dauphine", 22.00);
        Secondo sm4 = new Secondo("Grigliata di pesce", "Pescato del giorno grigliato con gamberoni, tranci di calamaro e gamberonni", 17.00);
        Secondo sm5 = new Secondo("Polpo alla brace", "Tenero polpo cotto alla brace", 15.00);

        menuSM.addPortata(sm1);
        menuSM.addPortata(sm2);
        menuSM.addPortata(sm3);
        menuSM.addPortata(sm4);
        menuSM.addPortata(sm5);

        MenuAllaCarta menuST = new MenuAllaCarta("Secondi Piatti di Terra:");

        Secondo st1 = new Secondo("Tagliata di Manzo", "Tagliato di manzo con taglio largo ai ferri", 14.00);
        Secondo st2 = new Secondo("Controfiletto", "Controfiletto di manzo cotto a bassa temperatura, cipollotto scottato, crema di patate al tartufo, fondo bruno", 22.00);
        Secondo st3 = new Secondo("Tomahawk", "Tomahawk bistecca servita con verdure grigliate", 65.00);
        Secondo st4 = new Secondo("Pancetta Tesa", "Pancia di maiale sardo cotto a bassa temperatura, crema di finocchi, belga scottata", 17.00);
        Secondo st5 = new Secondo("Grigliata Mista", "Grigliata mista di maiale, pollo e manzo", 17.00);

        menuST.addPortata(st1);
        menuST.addPortata(st2);
        menuST.addPortata(st3);
        menuST.addPortata(st4);
        menuST.addPortata(st5);

        MenuAllaCarta menuD = new MenuAllaCarta("Dessert:");

        Dessert d1 = new Dessert("Cassata siciliana", "Leggerissimo dolce siciliano", 4.00);
        Dessert d2 = new Dessert("Cannolo siciliano", "Dolce con chantillea, pistacchio e granella di pistacchio", 5.00);
        Dessert d3 = new Dessert("Semifreddo al Torrone", "Morbido torrone con ricattura di cacao", 6.00);
        Dessert d4 = new Dessert("Tortino al cioccolato", "Tortino al cioccolato con cuore fondente caldo", 9.00);
        Dessert d5 = new Dessert("Tiramisu", "Tiramisu classico", 9.00);
        Dessert d6 = new Dessert("Millefoglie", "Millefoglie, crema pasticcera, frutta fresca", 9.00);
        Dessert d7 = new Dessert("Seada Sarda", "Seada tradizionale sarda, miele, croccante alle mandorle", 9.00);

        menuD.addPortata(d1);
        menuD.addPortata(d2);
        menuD.addPortata(d3);
        menuD.addPortata(d4);
        menuD.addPortata(d5);
        menuD.addPortata(d6);
        menuD.addPortata(d7);

        MenuAllaCarta menuBB = new MenuAllaCarta("Birre Artigianali:");

        Bevanda b1 = new Bevanda("Sardinian Pale Ale", "Pale Ale 0,50cl", 12.00);
        Bevanda b2 = new Bevanda("Sardinian Ipa", "IPA 0,50cl", 12.00);
        Bevanda b3 = new Bevanda("Sexy Pompia", "Fruit Beer 0,50cl", 12.00);
        Bevanda b4 = new Bevanda("Frieska", "Bière Blanche 0,75cl", 22.00);
        Bevanda b5 = new Bevanda("BB Verblonde", "Italian Grape Ale (IGA), alla sapa da uve Vermentino 0,75cl", 22.00);

        menuBB.addPortata(b1);
        menuBB.addPortata(b2);
        menuBB.addPortata(b3);
        menuBB.addPortata(b4);
        menuBB.addPortata(b5);

        MenuAllaCarta menuBVB = new MenuAllaCarta("Vini Bianchi Nazionali:");

        Bevanda bvb1 = new Bevanda("Fiano d'Avellino- G.Marsella", "Fiano di Avellino", 40.00);
        Bevanda bvb2 = new Bevanda("Carbonare Inama", "Soave", 40.00);
        Bevanda bvb3 = new Bevanda("Vulcaia Naia", "Sauvignon Veneto", 34.00);
        Bevanda bvb4 = new Bevanda("Frus bianco", "Friuli", 35.00);
        Bevanda bvb5 = new Bevanda("Carricante Calabretta", "Sicilia", 30.00);
        Bevanda bvb6 = new Bevanda("Sauvignon Oberkerschbaum J. Hoffstatter", "Sauvignon - Trentino Alto Adige", 45.00);
        Bevanda bvb7 = new Bevanda("Vogelmaier Moscato giallo A. Lageder", "Moscato giallo - Magré Trentino Alto Adige", 30.00);
        Bevanda bvb8 = new Bevanda("Am Sand Gewurztraminer A. Lagerer", "Magré Trentino Alto Adige", 40.00);
        Bevanda bvb9 = new Bevanda("Derthona Vigneti Massa", "Timorasso - Monleale Piemonte", 40.00);

        menuBVB.addPortata(bvb1);
        menuBVB.addPortata(bvb2);
        menuBVB.addPortata(bvb3);
        menuBVB.addPortata(bvb4);
        menuBVB.addPortata(bvb5);
        menuBVB.addPortata(bvb6);
        menuBVB.addPortata(bvb7);
        menuBVB.addPortata(bvb8);
        menuBVB.addPortata(bvb9);

        MenuAllaCarta menuBVR = new MenuAllaCarta("Vini Rossi Nazionali:");

        Bevanda bvr1 = new Bevanda("Barolo Villero 2012 Oddero", "La Morra - Piemonte", 85.00);
        Bevanda bvr2 = new Bevanda("Barbera d’Alba Eugenio Bocchino", "Piobesi D'Alba", 33.00);
        Bevanda bvr3 = new Bevanda("Pinot nero Trattman Girlan", "Trentino Alto Adige", 65.00);
        Bevanda bvr4 = new Bevanda("Terra di Lavoro 2013/2014 Galardi", "Aglianico, Piedirosso - Sessa Aurunca Campania", 65.00);
        Bevanda bvr5 = new Bevanda("Guido Alberto Tenute San Guido", "Cabernet Sauvignon, Merlot - Bolgheri - Toscana", 75.00);
        Bevanda bvr6 = new Bevanda("Le Volte dell’Ornellaia", "Merlot, Sangiovese, Cabernet Sauvignon - Bolgheri - Toscana", 45.00);
        Bevanda bvr7 = new Bevanda("Le Serre Nuove dell’Ornellaia 2016", "Cabernet Sauvignon, Merlot, Cabernet Franc, Petit Verdot Bolgheri - Toscana", 75.00);
        Bevanda bvr8 = new Bevanda("Ornellaia 2014", "Cabernet Sauvignon, Merlot, Cabernet Franc, Petit Verdot Bolgheri - Toscana", 280.00);
        Bevanda bvr9 = new Bevanda("Solaia Antinori 1999/2008", "Cabernet Sauvignon, Sangiovese, Cabernet Franc San Casciano - Toscana", 350.00);

        menuBVR.addPortata(bvr1);
        menuBVR.addPortata(bvr2);
        menuBVR.addPortata(bvr3);
        menuBVR.addPortata(bvr4);
        menuBVR.addPortata(bvr5);
        menuBVR.addPortata(bvr6);
        menuBVR.addPortata(bvr7);
        menuBVR.addPortata(bvr8);
        menuBVR.addPortata(bvr9);

        r1.addMenu(menuA);
        r1.addMenu(menuPT);
        r1.addMenu(menuPM);
        r1.addMenu(menuSM);
        r1.addMenu(menuST);
        r1.addMenu(menuD);
        r1.addMenu(menuBB);
        r1.addMenu(menuBVB);
        r1.addMenu(menuBVR);

        r1.printAllMenu();
        menuA.printMenuSpecifico();
    }
}
