import ProdottiInVendita.Bevanda;
import ProdottiInVendita.Portata;
import ProdottiInVendita.TipoPortata;

public class Main {
    public static void main(String[] args) {

        Ristorante daLillo = new Ristorante("Da Lillo");

        Menu menuAntipasto = new Menu("Antipasti");

        Portata insalataDimare = new Portata("Insalata di Mare", "Insalata di mare con seppie, gamberi e verdure", 12.00, TipoPortata.ANTIPASTO);
        Portata cozzeEVongole = new Portata("Cozze E Vongole", "Impepata di cozze e vongole", 10.00, TipoPortata.ANTIPASTO);
        Portata scampi = new Portata("Scampi", "Crudità di scampi, 3 pz", 8.00, TipoPortata.ANTIPASTO);
        Portata pesceAlGratin = new Portata("Gratinato di Pesce", "Pescato del giorno al gratin, con aggiunta di scampi", 14.00, TipoPortata.ANTIPASTO);
        Portata bruschetta = new Portata("Bruschetta", "Tipica bruschetta con aglio tritato fino, origano, olio e pomodorini", 6.00, TipoPortata.ANTIPASTO);
        Portata fritturaMista = new Portata("Frittura Mista di Mare", "Frittura di mare con calamaretti, gamberetti e cipolla fritta", 10.00, TipoPortata.ANTIPASTO);
        Portata salmoneEAliciMarinate = new Portata("Salmone e Alici Marinate", "Un filetto di salmone fresco affumicato servito con alici marinate", 9.00, TipoPortata.ANTIPASTO);
        Portata tagliereSalumiEFormaggi = new Portata("Tagliere Salumi E Formaggi", "Salumi di stagione con tipici formaggi locali", 16.00, TipoPortata.ANTIPASTO);
        Portata insalataMista = new Portata("Insalata Mista", "Insalata mista di radicchio, rucola e lattuga iceberg", 6.50, TipoPortata.ANTIPASTO);
        Portata patatineFritte = new Portata("Patatine Fritte", "Frittura di patate con buccia", 6.00, TipoPortata.ANTIPASTO);

        menuAntipasto.addProdotto(insalataMista);
        menuAntipasto.addProdotto(insalataDimare);
        menuAntipasto.addProdotto(cozzeEVongole);
        menuAntipasto.addProdotto(scampi);
        menuAntipasto.addProdotto(pesceAlGratin);
        menuAntipasto.addProdotto(bruschetta);
        menuAntipasto.addProdotto(fritturaMista);
        menuAntipasto.addProdotto(salmoneEAliciMarinate);
        menuAntipasto.addProdotto(tagliereSalumiEFormaggi);
        menuAntipasto.addProdotto(patatineFritte);

        Menu menuPrimiDiTerra = new Menu("Primi Piatti di terra");

        Portata pastaCarbonara = new Portata("Pasta alla Carbonara", "Pasta con uovo,formaggio e guanciale", 10.00, TipoPortata.PRIMO);
        Portata cacioEPepe = new Portata("Pasta cacio e pepe", "Pasta condita con pepe condita con cacio", 10.00, TipoPortata.PRIMO);
        Portata tagliatelle = new Portata("Tagliatelle di cinghiale", "Tagliatelle al ragu di cinghiale e formaggio", 12.00, TipoPortata.PRIMO);
        Portata tagliatelleFunghi = new Portata("Tagliatelle con i porcini", "Tagliatelle con porcini e una grattuggiata di formaggio", 14.00, TipoPortata.PRIMO);
        Portata gnocchetti = new Portata("GNOCCHETTI ALLA CAMPIDANESE", "Gnocchi con ragù alla salsiccia di maiale e pecorino sardo", 15.00, TipoPortata.PRIMO);
        Portata tortelli = new Portata("Tortelli di Manzo", "Tortelli allo stracotto di manzo, radice daikon", 16.00, TipoPortata.PRIMO);

        menuPrimiDiTerra.addProdotto(cacioEPepe);
        menuPrimiDiTerra.addProdotto(tagliatelleFunghi);
        menuPrimiDiTerra.addProdotto(tagliatelle);
        menuPrimiDiTerra.addProdotto(gnocchetti);
        menuPrimiDiTerra.addProdotto(tortelli);
        menuPrimiDiTerra.addProdotto(pastaCarbonara);

        Menu menuPrimiDiMare = new Menu("Primi piatti di mare");

        Portata spaghettiCartoccio = new Portata("Spaghettti al cartoccio", "Spaghetti al cartoccio ai frutti di mare", 14.00, TipoPortata.PRIMO);
        Portata ravioli = new Portata("Ravioli", "Ravioli di branzino con bottarga di tonno", 14.00, TipoPortata.PRIMO);
        Portata cavatelli = new Portata("Cavatelli", "Cavatelli al ragu di gambero e pistacchio", 14.00, TipoPortata.PRIMO);
        Portata linguineScoglio = new Portata("Linguine allo scoglio", "Linguine con cozze, vongole, cannolicchi, gamberi e calamari", 16.00, TipoPortata.PRIMO);
        Portata linguineVongoleELimone = new Portata("Linguine vongole E Limone", "Linguine con vongole con grattata di scorza di limone", 12.00, TipoPortata.PRIMO);
        Portata mezziPaccheri = new Portata("Mezzi paccheri con Gambero rosso", "Mezzi paccheri con gambero rosso e crema di zucchine.", 20.00, TipoPortata.PRIMO);

        menuPrimiDiMare.addProdotto(spaghettiCartoccio);
        menuPrimiDiMare.addProdotto(ravioli);
        menuPrimiDiMare.addProdotto(cavatelli);
        menuPrimiDiMare.addProdotto(linguineScoglio);
        menuPrimiDiMare.addProdotto(linguineVongoleELimone);
        menuPrimiDiMare.addProdotto(mezziPaccheri);

        Menu secondiDiMare = new Menu("Secondi piatti di mare");

        Portata frittoMisto = new Portata("Fritto Misto", "La nostra frittura di calamari, gamberi e paranza con maionese", 20.00, TipoPortata.SECONDO);
        Portata ombrina = new Portata("Ombrina", "Ombrina alla piastra, crema di fave, bietola scottata, millefoglie di patate", 25.00, TipoPortata.SECONDO);
        Portata tonno = new Portata("Tonno", "Tonno scottato, caponata, patate dauphine", 22.00, TipoPortata.SECONDO);
        Portata grigliataDiPesce = new Portata("Grigliata di pesce", "Pescato del giorno grigliato con gamberoni, tranci di calamaro e gamberonni", 17.00, TipoPortata.SECONDO);
        Portata polpo = new Portata("Polpo alla brace", "Tenero polpo cotto alla brace", 15.00, TipoPortata.SECONDO);

        secondiDiMare.addProdotto(frittoMisto);
        secondiDiMare.addProdotto(ombrina);
        secondiDiMare.addProdotto(tonno);
        secondiDiMare.addProdotto(grigliataDiPesce);
        secondiDiMare.addProdotto(polpo);

        Menu secondiTerra = new Menu("Secondi terra");

        Portata tagliataDiManzo = new Portata("Tagliata di Manzo", "Tagliato di manzo con taglio largo ai ferri", 14.00, TipoPortata.SECONDO);
        Portata controfiletto = new Portata("Controfiletto", "Controfiletto di manzo cotto a bassa temperatura, cipollotto scottato, crema di patate al tartufo, fondo bruno", 22.00, TipoPortata.SECONDO);
        Portata tomahawk = new Portata("Tomahawk", "Tomahawk bistecca servita con verdure grigliate", 65.00, TipoPortata.SECONDO);
        Portata pancettaTesa = new Portata("Pancetta Tesa", "Pancia di maiale sardo cotto a bassa temperatura, crema di finocchi, belga scottata", 17.00, TipoPortata.SECONDO);
        Portata grigliataMistaDiCarne = new Portata("Grigliata Mista", "Grigliata mista di maiale, pollo e manzo", 17.00, TipoPortata.SECONDO);

        secondiTerra.addProdotto(tagliataDiManzo);
        secondiTerra.addProdotto(controfiletto);
        secondiTerra.addProdotto(tomahawk);
        secondiTerra.addProdotto(pancettaTesa);
        secondiTerra.addProdotto(grigliataMistaDiCarne);

        Menu dessert = new Menu("Dessert");

        Portata cassata = new Portata("Cassata siciliana", "Leggerissimo dolce siciliano", 4.00, TipoPortata.DESSERT);
        Portata cannolo = new Portata("Cannolo siciliano", "Dolce con chantillea, pistacchio e granella di pistacchio", 5.00, TipoPortata.DESSERT);
        Portata semifreddoTorrone = new Portata("Semifreddo al Torrone", "Morbido torrone con ricattura di cacao", 6.00, TipoPortata.DESSERT);
        Portata tortino = new Portata("Tortino al cioccolato", "Tortino al cioccolato con cuore fondente caldo", 9.00, TipoPortata.DESSERT);
        Portata tiramisu = new Portata("Tiramisu", "Tiramisu classico", 9.00, TipoPortata.DESSERT);
        Portata milleFoglie = new Portata("Millefoglie", "Millefoglie, crema pasticcera, frutta fresca", 9.00, TipoPortata.DESSERT);
        Portata seadaSarda = new Portata("Seada Sarda", "Seada tradizionale sarda, miele, croccante alle mandorle", 9.00, TipoPortata.DESSERT);

        dessert.addProdotto(cassata);
        dessert.addProdotto(cannolo);
        dessert.addProdotto(semifreddoTorrone);
        dessert.addProdotto(tortino);
        dessert.addProdotto(tiramisu);
        dessert.addProdotto(milleFoglie);
        dessert.addProdotto(seadaSarda);

        Menu listaBirreArtigianali = new Menu("Birre Artigianali");

        Bevanda sardinian = new Bevanda("Sardinian Pale Ale", "Pale Ale 0,50cl", 12.00, TipoPortata.BEVANDA);
        Bevanda sardinianIpa = new Bevanda("Sardinian Ipa", "IPA 0,50cl", 12.00, TipoPortata.BEVANDA);
        Bevanda sexyPompia = new Bevanda("Sexy Pompia", "Fruit Beer 0,50cl", 12.00, TipoPortata.BEVANDA);
        Bevanda frieska = new Bevanda("Frieska", "Bière Blanche 0,75cl", 22.00, TipoPortata.BEVANDA);
        Bevanda verblonde = new Bevanda("BB Verblonde", "Italian Grape Ale (IGA), alla sapa da uve Vermentino 0,75cl", 22.00, TipoPortata.BEVANDA);

        listaBirreArtigianali.addProdotto(sardinian);
        listaBirreArtigianali.addProdotto(sardinianIpa);
        listaBirreArtigianali.addProdotto(sexyPompia);
        listaBirreArtigianali.addProdotto(frieska);
        listaBirreArtigianali.addProdotto(verblonde);

        Menu viniBianchi = new Menu("Vini Bianchi Nazionali");

        Bevanda fianoDiAvellino = new Bevanda("Fiano d'Avellino- G.Marsella", "Fiano di Avellino", 40.00, TipoPortata.BEVANDA);
        Bevanda carbonareInama = new Bevanda("Carbonare Inama", "Soave", 40.00, TipoPortata.BEVANDA);
        Bevanda vulcaiaNaia = new Bevanda("Vulcaia Naia", "Sauvignon Veneto", 34.00, TipoPortata.BEVANDA);
        Bevanda frusBianco = new Bevanda("Frus bianco", "Friuli", 35.00, TipoPortata.BEVANDA);
        Bevanda carricanteCalabretta = new Bevanda("Carricante Calabretta", "Sicilia", 30.00, TipoPortata.BEVANDA);
        Bevanda sauvignonOberkerschbaum = new Bevanda("Sauvignon Oberkerschbaum J. Hoffstatter", "Sauvignon - Trentino Alto Adige", 45.00, TipoPortata.BEVANDA);
        Bevanda vogelmaierMoscato = new Bevanda("Vogelmaier Moscato giallo A. Lageder", "Moscato giallo - Magré Trentino Alto Adige", 30.00, TipoPortata.BEVANDA);
        Bevanda gewurztraminer = new Bevanda("Am Sand Gewurztraminer A. Lagerer", "Magré Trentino Alto Adige", 40.00, TipoPortata.BEVANDA);
        Bevanda derthonaVignetiMassa = new Bevanda("Derthona Vigneti Massa", "Timorasso - Monleale Piemonte", 40.00, TipoPortata.BEVANDA);

        viniBianchi.addProdotto(fianoDiAvellino);
        viniBianchi.addProdotto(carbonareInama);
        viniBianchi.addProdotto(vulcaiaNaia);
        viniBianchi.addProdotto(frusBianco);
        viniBianchi.addProdotto(carricanteCalabretta);
        viniBianchi.addProdotto(sauvignonOberkerschbaum);
        viniBianchi.addProdotto(vogelmaierMoscato);
        viniBianchi.addProdotto(gewurztraminer);
        viniBianchi.addProdotto(derthonaVignetiMassa);

        Menu viniRossi = new Menu("Vini Rossi Nazionali");

        Bevanda barolo = new Bevanda("Barolo Villero 2012 Oddero", "La Morra - Piemonte", 85.00, TipoPortata.BEVANDA);
        Bevanda barberaDAlba = new Bevanda("Barbera d’Alba Eugenio Bocchino", "Piobesi D'Alba", 33.00, TipoPortata.BEVANDA);
        Bevanda pinotNeroTrattman = new Bevanda("Pinot nero Trattman Girlan", "Trentino Alto Adige", 65.00, TipoPortata.BEVANDA);
        Bevanda galardi = new Bevanda("Terra di Lavoro 2013/2014 Galardi", "Aglianico, Piedirosso - Sessa Aurunca Campania", 65.00, TipoPortata.BEVANDA);
        Bevanda guidoAlbertoSanGuido = new Bevanda("Guido Alberto Tenute San Guido", "Cabernet Sauvignon, Merlot - Bolgheri - Toscana", 75.00, TipoPortata.BEVANDA);
        Bevanda volteOrnellaia = new Bevanda("Le Volte dell’Ornellaia", "Merlot, Sangiovese, Cabernet Sauvignon - Bolgheri - Toscana", 45.00, TipoPortata.BEVANDA);
        Bevanda serreNuoveOrnellaia = new Bevanda("Le Serre Nuove dell’Ornellaia 2016", "Cabernet Sauvignon, Merlot, Cabernet Franc, Petit Verdot Bolgheri - Toscana", 75.00, TipoPortata.BEVANDA);
        Bevanda ornellaia = new Bevanda("Ornellaia 2014", "Cabernet Sauvignon, Merlot, Cabernet Franc, Petit Verdot Bolgheri - Toscana", 280.00, TipoPortata.BEVANDA);
        Bevanda solaiaAntinori = new Bevanda("Solaia Antinori 1999/2008", "Cabernet Sauvignon, Sangiovese, Cabernet Franc San Casciano - Toscana", 350.00, TipoPortata.BEVANDA);

        viniRossi.addProdotto(barolo);
        viniRossi.addProdotto(barberaDAlba);
        viniRossi.addProdotto(pinotNeroTrattman);
        viniRossi.addProdotto(galardi);
        viniRossi.addProdotto(guidoAlbertoSanGuido);
        viniRossi.addProdotto(volteOrnellaia);
        viniRossi.addProdotto(serreNuoveOrnellaia);
        viniRossi.addProdotto(ornellaia);
        viniRossi.addProdotto(solaiaAntinori);

        daLillo.addMenu(menuAntipasto);
        daLillo.addMenu(menuPrimiDiTerra);
        daLillo.addMenu(menuPrimiDiMare);
        daLillo.addMenu(secondiDiMare);
        daLillo.addMenu(secondiTerra);
        daLillo.addMenu(dessert);
        daLillo.addMenu(listaBirreArtigianali);
        daLillo.addMenu(viniBianchi);
        daLillo.addMenu(viniRossi);

        daLillo.printAllMenu();

        daLillo.printPlateByType(TipoPortata.SECONDO);
        
        
        


    }
}
