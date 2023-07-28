package OOP2.aufgabe4;

//import java.util.ArrayList;
//import java.util.List;
import java.util.Scanner;

// Hauptklasse AppBuch
public class AppBuch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bibliothek bibliothek = new Bibliothek(); // Erstellt ein neues Bibliothek-Objekt

        while (true) {
            // Menüoptionen anzeigen
            System.out.println("Befehle: ");
            System.out.println("1 - Buch hinzufügen");
            System.out.println("2 - Buch ausleihen");
            System.out.println("3 - Buch zurückgeben");
            System.out.println("4 - Buch löschen");
            System.out.println("0 - Programm beenden");
            System.out.print("Bitte wählen Sie eine Option: ");
            int option = scanner.nextInt(); // Liest die Benutzereingabe ein
            scanner.nextLine(); // Leere den Scanner-Puffer

            switch (option) {
                case 1:
                    // Buch hinzufügen
                    System.out.print("Titel des Buches: ");
                    String titel = scanner.nextLine(); // Liest den Titel des Buches ein
                    System.out.print("ISBN des Buches: ");
                    String isbn = scanner.nextLine(); // Liest die ISBN des Buches ein
                    System.out.print("Preis des Buches: ");
                    double preis = scanner.nextDouble(); // Liest den Preis des Buches ein
                    scanner.nextLine(); // Leere den Scanner-Puffer

                    System.out.print("Autor des Buches: ");
                    String autorName = scanner.nextLine(); // Liest den Namen des Autors ein
                    System.out.print("Synonym des Autors: ");
                    String synonym = scanner.nextLine(); // Liest das Synonym des Autors ein
                    System.out.print("Gage des Autors: ");
                    double gage = scanner.nextDouble(); // Liest die Gage des Autors ein
                    scanner.nextLine(); // Leere den Scanner-Puffer

                    // Erstelle den Autor und das Buch
                    Autor autor = new Autor(autorName); // Erstellt ein Autor-Objekt mit dem eingegebenen Namen
                    autor.setSynonym(synonym); // Setzt das Synonym des Autors
                    autor.setGage(gage); // Setzt die Gage des Autors

                    Buch buch = new Buch(titel, isbn); // Erstellt ein Buch-Objekt mit dem eingegebenen Titel und ISBN
                    buch.setPreis(preis); // Setzt den Preis des Buches
                    buch.setAuthor(autor); // Setzt den Autor des Buches

                    // Füge das Buch zur Bibliothek hinzu
                    bibliothek.buchHinzufuegen(buch);

                    System.out.println("Buch: " + buch.toString() + " erzeugt."); // Gibt die Bestätigung der Bucherstellung aus
                    break;
                case 2:
                    // Buch ausleihen
                    System.out.print("Titel des auszuleihenden Buches: ");
                    String auszuleihenderTitel = scanner.nextLine(); // Liest den Titel des Buches, das ausgeliehen werden soll, ein

                    // Versuche, das Buch auszuleihen
                    Buch auszuleihendesBuch = bibliothek.buchAusleihen(auszuleihenderTitel); // Ruft die Methode zum Ausleihen des Buches auf

                    if (auszuleihendesBuch != null) {
                        System.out.println("Buch ausgeliehen: " + auszuleihendesBuch.toString());
                    } else {
                        System.out.println("Buch nicht gefunden oder bereits ausgeliehen.");
                    }
                    break;
                case 3:
                    // Buch zurückgeben
                    System.out.print("Titel des zurückzugebenden Buches: ");
                    String zurueckzugebenderTitel = scanner.nextLine(); // Liest den Titel des Buches, das zurückgegeben werden soll, ein

                    // Versuche, das Buch zurückzugeben
                    Buch zurueckzugebendesBuch = bibliothek.buchZurueckgeben(zurueckzugebenderTitel); // Ruft die Methode zum Zurückgeben des Buches auf

                    if (zurueckzugebendesBuch != null) {
                        System.out.println("Buch zurückgegeben: " + zurueckzugebendesBuch.toString());
                    } else {
                        System.out.println("Buch nicht gefunden oder nicht ausgeliehen.");
                    }
                    break;
                case 4:
                    // Buch löschen
                    System.out.print("Titel des zu löschenden Buches: ");
                    String zuLoeschenderTitel = scanner.nextLine(); // Liest den Titel des Buches, das gelöscht werden soll, ein

                    // Versuche, das Buch zu löschen
                    boolean buchGeloescht = bibliothek.buchLoeschen(zuLoeschenderTitel); // Ruft die Methode zum Löschen des Buches auf

                    if (buchGeloescht) {
                        System.out.println("Buch gelöscht: " + zuLoeschenderTitel);
                    } else {
                        System.out.println("Buch nicht gefunden.");
                    }
                    break;
                case 0:
                    // Programm beenden
                    System.out.println("Programm wird beendet.");
                    scanner.close(); // Schließe den Scanner
                    return;
                default:
                    // Ungültige Option
                    System.out.println("Ungültige Option. Bitte wählen Sie eine gültige Option.");
            }
        }
    }
}