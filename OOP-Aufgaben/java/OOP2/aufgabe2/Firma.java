package OOP2.aufgabe2;
import java.util.ArrayList;

public class Firma {
    private String name; // Name der Firma
    private String adresse; // Adresse der Firma
    private int anzahlRaeume; // Anzahl der aktuell vorhandenen Räume zur Vermietung
    private int maxAnzahlRaeume; // Maximale Anzahl der möglichen Räume, die die Firma besitzt
    private ArrayList<Integer> raumGroessen; // Liste für die Größen der Räume
    private ArrayList<Boolean> raumBuchungen; // Liste für den Buchungsstatus der Räume

    // Konstruktor der Klasse Firma, um eine neue Firma mit den angegebenen Attributen zu erstellen
    public Firma(String name, String adresse, int maxAnzahlRaeume) {
        this.name = name;
        this.adresse = adresse;
        this.anzahlRaeume = 0; // Zu Beginn gibt es keine Räume
        this.maxAnzahlRaeume = maxAnzahlRaeume;
        this.raumGroessen = new ArrayList<>(); //Liste initialisieren
        this.raumBuchungen = new ArrayList<>();
    }

    // Methode, um einen Raum mit Sitzplatzmenge hinzuzufügen
    public void fuegeRaumHinzu(int plaetze) {
        if (anzahlRaeume < maxAnzahlRaeume) {
            raumGroessen.add(plaetze); // Sitzplatzmenge wird zur Liste der Größen hinzugefügt
            raumBuchungen.add(false); // Der Raum ist zu Beginn nicht gebucht
            anzahlRaeume++; // Die Anzahl der Räume wird erhöht
            System.out.println("Raum " + anzahlRaeume + " mit " + plaetze + " Sitzplätzen wurde hinzugefügt.");
        } else {
            System.out.println("Es können keine weiteren Räume hinzugefügt werden. Die maximale Anzahl ist erreicht.");
        }
    }

    // Methode, um nach einem Raum mit gewünschter Größe zu suchen und dessen Nummer zurückzugeben
    public int sucheRaum(int plaetze) {
        for (int i = 0; i < anzahlRaeume; i++) {
            if (!raumBuchungen.get(i) && raumGroessen.get(i) >= plaetze) {
                // Raum ist nicht gebucht und hat genügend Sitzplätze
                raumBuchungen.set(i, true); // Raum wird als gebucht markiert
                return i + 1; // Raumnummer ist 1-basiert, daher +1
            }
        }
        return -1; // Kein passender Raum gefunden
    }

    // Methode, um die Anzahl der freien (ungebuchten) Räume zu ermitteln und zurückzugeben
    public int anzahlFrei() {
        int frei = 0;
        for (boolean buchung : raumBuchungen) {
            if (!buchung) {
                frei++; // Wenn der Raum nicht gebucht ist, wird der Zähler erhöht
            }
        }
        return frei; // Anzahl der freien Räume wird zurückgegeben
    }
}
