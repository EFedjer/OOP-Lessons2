package oop.aufgabe3;

// Die Bankkonto-Klasse repräsentiert ein Bankkonto mit Vorname, Nachname, Kontonummer, Kontostand und KontoLimit.
public class Bankkonto {
    private String vorname;     // Vorname des Kontoinhabers
    private String nachname;    // Nachname des Kontoinhabers
    private String kontonummer; // Kontonummer
    private double kontostand;  // Kontostand
    private double kontoLimit;  // Limit, bis zu dem das Konto überzogen werden darf

    // Konstruktor für Bankkonto mit Angabe von Kontoname, Kontonummer, Kontostand und KontoLimit
    public Bankkonto(String vorname, String nachname, String kontonummer, double kontostand, double kontoLimit) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.kontonummer = kontonummer;
        this.kontostand = kontostand;
        this.kontoLimit = kontoLimit;
    }

    // Methode zur Ausgabe der Kontodaten
    public String toString() {
        return "Kontoinhaber: " + vorname + " " + nachname + "\n" +
                "Kontonummer: " + kontonummer + "\n" +
                "Kontostand: " + kontostand + " EUR\n" +
                "Konto-Limit: " + kontoLimit + " EUR";
    }

    // Methode zur Einzahlung
    public void einzahlen(double betrag) {
        kontostand += betrag; // Den eingezahlten Betrag zum Kontostand hinzufügen
    }

    // Methode zur Auszahlung
    public void auszahlen(double betrag) {
        // Überprüfen, ob genug Guthaben auf dem Konto vorhanden ist (Kontostand + KontoLimit)
        if (betrag <= kontostand + kontoLimit) {
            kontostand -= betrag; // Den ausgezahlten Betrag vom Kontostand abziehen
        } else {
            System.out.println("Nicht genug Guthaben auf dem Konto.");
            // Wenn nicht genug Guthaben vorhanden ist, wird die Auszahlung abgelehnt
        }
    }
    // Methode zur Abfrage des Kontostandes
    public double getKontostand() {
        return kontostand; // Den aktuellen Kontostand zurückgeben
    }
}



