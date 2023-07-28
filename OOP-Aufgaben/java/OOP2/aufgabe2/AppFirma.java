package OOP2.aufgabe2;

public class AppFirma {

    // Hauptmethode zum Testen der Klasse
    public static void main(String[] args) {
        Firma firma = new Firma("BeispielFirma", "BeispielAdresse", 5); // Neue Firma mit 5 maximalen Räumen erstellen
        firma.fuegeRaumHinzu(20); // Raum mit 20 Sitzplätzen hinzufügen
        firma.fuegeRaumHinzu(30); // Raum mit 30 Sitzplätzen hinzufügen
        firma.fuegeRaumHinzu(15); // Raum mit 15 Sitzplätzen hinzufügen

        int raumNummer = firma.sucheRaum(25); // Nach einem Raum mit 25 Sitzplätzen suchen
        if (raumNummer != -1) {
            System.out.println("Raum " + raumNummer + " wurde gefunden.");
        } else {
            System.out.println("Kein passender Raum gefunden.");
        }

        int frei = firma.anzahlFrei(); // Anzahl der freien Räume ermitteln
        System.out.println("Anzahl freier Räume: " + frei);
    }
}

