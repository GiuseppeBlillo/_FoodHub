public class Main {

    public static void main(String[] args) {
        Secondi();
    }

    public static void Secondi(){
        SecondiPiatti felafelDiCeci = new SecondiPiatti("Polpette di legumi speziate e fritte in olio alto-oleico", 9.99);
        SecondiPiatti tempehCroccanti = new SecondiPiatti("Semi di soia fermentati avvolti in foglie di banano", 11);
        SecondiPiatti polpetteDiMuscolo = new SecondiPiatti("Polpette di farina di grano e verdure di stagione", 12.99);
        SecondiPiatti tofuAllaSiciliana = new SecondiPiatti("Tofu marinato, con aggiunta di melanzane, pomodoro ciliegino e olive nere", 9);

        felafelDiCeci.getDescrizione();
        felafelDiCeci.getPrezzo();
        tempehCroccanti.getDescrizione();
        tempehCroccanti.getPrezzo();
        polpetteDiMuscolo.getDescrizione();
        polpetteDiMuscolo.getPrezzo();
        tofuAllaSiciliana.getDescrizione();
        tofuAllaSiciliana.getPrezzo();
    }
}