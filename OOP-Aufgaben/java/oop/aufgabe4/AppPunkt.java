package oop.aufgabe4;

//  AppPunkt Klasse zum Testen der Klasse Punkt
public class AppPunkt {
    public static void main(String[] args) {
        // Erstellen von zwei Punkten
        Punkt punkt1 = new Punkt(3, 4);
        Punkt punkt2 = new Punkt(5, 2);

        // Ausgabe der Punkte
        System.out.println("Punkt 1: " + punkt1.toString());
        System.out.println("Punkt 2: " + punkt2.toString());

        // Berechnung und Ausgabe des Abstands der Punkte zum Ursprung
        System.out.println("Abstand von Punkt 1 zum Ursprung: " + punkt1.abstandZumUrsprung());
        System.out.println("Abstand von Punkt 2 zum Ursprung: " + punkt2.abstandZumUrsprung());

        // Spiegelung der Punkte und Ausgabe der Ergebnisse
        Punkt spiegelungPunkt1X = punkt1.spiegelungAnXAchse();
        Punkt spiegelungPunkt1Y = punkt1.spiegelungAnYAchse();
        Punkt spiegelungPunkt1Ursprung = punkt1.spiegelungAmUrsprung();

        System.out.println("Spiegelung von Punkt 1 an der X-Achse: " + spiegelungPunkt1X.toString());
        System.out.println("Spiegelung von Punkt 1 an der Y-Achse: " + spiegelungPunkt1Y.toString());
        System.out.println("Spiegelung von Punkt 1 am Ursprung: " + spiegelungPunkt1Ursprung.toString());

        // Berechnung und Ausgabe des Abstands zwischen den Punkten
        System.out.println("Abstand von Punkt 1 zu Punkt 2: " + punkt1.abstandZuPunkt(punkt2));
    }
}
