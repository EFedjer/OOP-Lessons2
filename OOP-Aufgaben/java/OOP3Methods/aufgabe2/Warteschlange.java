package OOP3Methods.aufgabe2;

import java.util.LinkedList;
import java.util.List;


// Klasse Warteschlange
class Warteschlange {
    private int maxKapazitaet; // Maximale Kapazität der Warteschlange
    private List<Auto> warteschlange; // Liste für die verwalteten Autos in der Warteschlange

    // Konstruktor für die Klasse Warteschlange
    public Warteschlange(int maxKapazitaet) {
        this.maxKapazitaet = maxKapazitaet;
        this.warteschlange = new LinkedList<>(); // Verwendung einer LinkedList für die Warteschlange
    }

    // Methode zum Hinzufügen eines Autos zur Warteschlange
    public boolean autoHinzufuegen(Auto auto) {
        if (warteschlange.size() < maxKapazitaet) {
            warteschlange.add(auto);
            auto.setPosition(warteschlange.size()); // Setze die Position des Autos in der Warteschlange
            return true;
        } else {
            return false; // Die Warteschlange ist voll, das Auto kann nicht hinzugefügt werden
        }
    }

    // Methode zum Entfernen des ersten Autos aus der Warteschlange
    public Auto autoVerlassen() {
        if (!warteschlange.isEmpty()) {
            Auto erstesAuto = warteschlange.remove(0);
            erstesAuto.setPosition(0); // Setze die Position des ersten Autos auf 0 (wenn es keines mehr gibt)
            return erstesAuto;
        } else {
            return null; // Die Warteschlange ist leer, es gibt kein Auto zum Entfernen
        }
    }

    // Getter-Methode für die Warteschlange
    public List<Auto> getWarteschlange() {
        return warteschlange;
    }
}