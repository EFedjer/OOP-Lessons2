package OOP3Methods.aufgabe2;


import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
//import java.util.LinkedList;
//import java.util.List;

// Klasse Auto
class Auto {
    private String kennzeichen; // Eindeutiges Kennzeichen des Fahrzeugs
    private String automarkeUndModell; // Automarke und Modell des Fahrzeugs
    private String fahrzeuggröße; // Informationen zur Fahrzeuggröße
    private boolean prioritaet; // Prioritätsstufe für bestimmte Fahrzeuge
    private LocalDateTime anreisezeitpunkt; // Zeitpunkt, zu dem das Auto in die Warteschlange eingereiht wurde
    private String status; // Aktueller Status des Autos (z.B., wartend, in der Autowaschanlage, abgefahren)
    private int position; // Aktuelle Position des Autos in der Warteschlange

    // Konstruktor für die Klasse Auto
    public Auto(String kennzeichen, String automarkeUndModell, String fahrzeuggröße, boolean prioritaet) {
        this.kennzeichen = kennzeichen;
        this.automarkeUndModell = automarkeUndModell;
        this.fahrzeuggröße = fahrzeuggröße;
        this.prioritaet = prioritaet;
        this.anreisezeitpunkt = LocalDateTime.now(); // Aktueller Zeitpunkt als Anreisezeitpunkt setzen
        this.status = "wartend"; // Neues Auto wird initial als wartend markiert
    }

    // Getter-Methode für das Kennzeichen
    public String getKennzeichen() {
        return kennzeichen;
    }

    // Getter-Methode für die Automarke und das Modell
    public String getAutomarkeUndModell() {
        return automarkeUndModell;
    }

    // Methode zum Betreten der Autowaschanlage
    public void betreteAutowaschanlage() {
        this.status = "in der Autowaschanlage";
    }

    // Methode zum Verlassen der Warteschlange und zur Abfahrt zurückkehren
    public void verlasseWarteschlange() {
        this.status = "abgefahren";
    }

    // Methode zur Berechnung der Wartezeit in Minuten
    public long berechneWartezeitInMinuten() {
        LocalDateTime now = LocalDateTime.now();
        return ChronoUnit.MINUTES.between(anreisezeitpunkt, now);
    }

    // Getter-Methode für den aktuellen Status des Autos
    public String getStatus() {
        return status;
    }

    // Setter-Methode für die Position des Autos in der Warteschlange
    public void setPosition(int position) {
        this.position = position;
    }

    // Getter-Methode für die Position des Autos in der Warteschlange
    public int getPosition() {
        return position;
    }
}