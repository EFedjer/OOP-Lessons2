package oop.aufgabe3;

// Die Main-Klasse enthält die main-Methode zum Ausführen des Bankkontos.
public class Main {
    public static void main(String[] args) {

        // Ein Bankkonto-Objekt erstellen und initialisieren
        Bankkonto konto = new Bankkonto("Irgend", "Jemand", "1234567890", 1100.0, 500.0);

        // Kontodaten ausgeben
        System.out.println("Kontodaten:");
        System.out.println(konto);
        // 500 Euro einzahlen
        konto.einzahlen(500.0);
        // 200 Euro auszahlen
        konto.auszahlen(200.0);
        // Neuer Kontostand abrufen und ausgeben
        System.out.println("Neuer Kontostand: " + konto.getKontostand() + " EUR");
    }
}

