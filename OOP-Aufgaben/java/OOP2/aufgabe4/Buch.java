package OOP2.aufgabe4;

import java.util.ArrayList;
import java.util.List;
//import java.util.Scanner;


class Buch {
    private String titel;
    private String isbn;
    private double preis;
    private Autor autor;

    public Buch(String titel, String isbn) {
        this.titel = titel;
        this.isbn = isbn;
    }

    public String getTitel() {
        return titel;
    }

    public String getIsbn() {
        return isbn;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public void setAuthor(Autor autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        String authorInfo = autor != null ? "\n" + autor.toString() : "";
        return "Titel: " + titel + ", ISBN: " + isbn + ", Preis: " + preis + authorInfo;
    }
}
// Klasse Autor
class Autor {
    private String name;
    private String synonym;
    private double gage;

    // Konstruktor für einen Autor mit Namen
    public Autor(String name) {
        this.name = name;
    }
    // Getter-Methoden für die Attribute des Autors
    public String getName() {
        return name;
    }

    public String getSynonym() {
        return synonym;
    }
    // Setter-Methode für das Synonym des Autors
    public void setSynonym(String synonym) {
        this.synonym = synonym;
    }

    public double getGage() {
        return gage;
    }
    // Setter-Methode für die Gage des Autors
    public void setGage(double gage) {
        this.gage = gage;
    }
    // Überschriebene toString-Methode zur Darstellung der Autor-Daten
    @Override
    public String toString() {
        return "Autor: " + name + ", Synonym: " + synonym + ", Gage: " + gage;
    }
}
// Klasse Bibliothek
class Bibliothek {
    private List<Buch> buchListe;
    // Konstruktor für die Bibliothek, initialisiert die Liste der Bücher
    public Bibliothek() {
        buchListe = new ArrayList<>();
    }
    // Methode zum Hinzufügen eines Buches zur Bibliothek
    public void buchHinzufuegen(Buch buch) {
        buchListe.add(buch);
    }
    // Methode zum Ausleihen eines Buches aus der Bibliothek
    public Buch buchAusleihen(String titel) {
        for (Buch buch : buchListe) {
            if (buch.getTitel().equals(titel)) {
                buchListe.remove(buch); // Entferne das Buch aus der Liste (als Ausgeliehen markieren)
                return buch;
            }
        }
        return null; // Buch nicht gefunden oder bereits ausgeliehen
    }
    // Methode zum Zurückgeben eines Buches an die Bibliothek
    public Buch buchZurueckgeben(String titel) {
        // Hier könnte man weitere Funktionen implementieren, z.B. wenn man das Buch zurückgeben möchte
        // anstatt es nur aus der Liste zu entfernen. Für die Einfachheit dieses Beispiels entfernen wir es einfach.
        for (Buch buch : buchListe) {
            if (buch.getTitel().equals(titel)) {
                buchListe.add(buch); // Füge das Buch wieder der Liste hinzu (als Zurückgegeben markieren)
                return buch;
            }
        }
        return null; // Buch nicht gefunden oder nicht ausgeliehen
    }
    // Methode zum Löschen eines Buches aus der Bibliothek
    public boolean buchLoeschen(String titel) {
        for (Buch buch : buchListe) {
            if (buch.getTitel().equals(titel)) {
                buchListe.remove(buch); // Entferne das Buch aus der Liste
                return true;
            }
        }
        return false; // Buch nicht gefunden
    }
}
