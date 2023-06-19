package course.loops.forLoop;

public class FakultaetBerechnung {
    public static int fakultaet(int n) {
        int fakultaet = 1; // variable fakultaet wird mit dem Wert 1 initialisert
        for (int i = 1; i <= n; i++) { //die Schleife wird von 1 bis n ausgeführt
            fakultaet *= i;// bei jedem Durchlauf der Schleife wird der Wert von fakutaet
            // mit dem Wert von i multipliziert
        }
        return fakultaet; // die Variable fakultaet beinhaltet das Ergebnis der Berechnung
    }
    public static void main(String[] args) {
        // Testen der Methode
        int zahl = 8; // initialisiere die Variable Zahl mit dem Wert 8
        int ergebnis = fakultaet(zahl); // die Variable ergebnis wird das Ergebnis zugewiesen
        System.out.println("Die Fakultät von " + zahl + " ist: " + ergebnis); // Ausgabe
    }
}
