package OOP2.aufgabe3;

public class AppBuch {
    public static void main(String[] args) {
        // Erstellen von Autoren
        // Erstelle den ersten Autor mit Namen "Jessy Niada"
        Autor autor1 = new Autor("Jessy Niada");
        autor1.setSynonym("JN"); // Setze ein Synonym für den Autor "Jassy Niada"
        autor1.setGage(5000.0); // Setze die Gage des Autors "Jessy Niada" auf 5000.0

        // Erstelle den zweiten Autor mit Namen "Jon Smith"
        Autor autor2 = new Autor("Jon Smith");
        autor2.setSynonym("JS"); // Setze ein Synonym für den Autor "Jon Smith"
        autor2.setGage(6000.0); // Setze die Gage des Autors "Jon Smith" auf 6000.0

        // Erstelle den dritten Autor mit Namen "Irgend Jemand"
        Autor autor3 = new Autor("Irgend Jemand");
        autor3.setSynonym("IJ"); // Setze ein Synonym für den Autor "Irgend Jemand"
        autor3.setGage(4500.0); // Setze die Gage des Autors "Irgend Jemand" auf 4500.0

        // Erstellen von Büchern mit ihren Autoren
        // Erstelle das erste Buch mit Titel "Java for Beginners" und ISBN "978-1234567890"
        Buch buch1 = new Buch("Java for Beginners", "978-1234567890");
        buch1.setPreis(29.99); // Setze den Preis des Buches "Java for Beginners" auf 29.99
        buch1.setAuthor(autor1); // Setze den Autor des Buches "Java for Beginners" auf den Autor "Jon Smith"

        // Erstelle das zweite Buch mit Titel "Python Fundamentals" und ISBN "978-9876543210"
        Buch buch2 = new Buch("Python Fundamentals", "978-9876543210");
        buch2.setPreis(24.99); // Setze den Preis des Buches "Python Fundamentals" auf 24.99
        buch2.setAuthor(autor2); // Setze den Autor des Buches "Python Fundamentals" auf den Autor "Jane Smith"

        // Erstelle das dritte Buch mit Titel "C++ Programming" und ISBN "978-5678901234"
        Buch buch3 = new Buch("C++ Programming", "978-5678901234");
        buch3.setPreis(34.99); // Setze den Preis des Buches "C++ Programming" auf 34.99
        buch3.setAuthor(autor3); // Setze den Autor des Buches "C++ Programming" auf den Autor "Max Mustermann"

        // Ausgabe der Buch-Daten mit Autoren
        System.out.println(buch1.toString()); // Gib die Daten des ersten Buches aus
        System.out.println(buch2.toString()); // Gib die Daten des zweiten Buches aus
        System.out.println(buch3.toString()); // Gib die Daten des dritten Buches aus
    }
}


