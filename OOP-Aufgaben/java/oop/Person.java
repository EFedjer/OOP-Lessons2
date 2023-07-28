package oop;

import java.time.LocalDate;

public class Person {
    private String vorName; // Vorname der Person
    private String nachName; // Nachname der Person
    private int alter; // Alter der Person
    private LocalDate geburtDate; // Geburtsdatum der Person (LocalDate wird verwendet)
    private double gewicht; // Gewicht der Person

    // Konstruktor, um eine neue Person zu erstellen
    public Person(String vorName, String nachName, int alter, LocalDate geburtDate, double gewicht) {
        this.vorName = vorName;
        this.nachName = nachName;
        this.alter = alter;
        this.geburtDate = geburtDate;
        this.gewicht = gewicht;
    }
    // Getter und Setter für die Eigenschaften
    public String getVorName() {
        return vorName;
    }
    public void setVorName(String firstName) {
        this.vorName = vorName;
    }
    public String getNachName() {
        return nachName;
    }
    public void setNachName(String nachName) {
        this.nachName = nachName;
    }
    public int getAge() {
        return alter;
    }
    public void setAge(int age) {
        this.alter = age;
    }
    public LocalDate getGeburtDate() {
        return geburtDate;
    }
    public void setGeburtDate(LocalDate geburtDate) {
        this.geburtDate = geburtDate;
    }
    public double getGewicht() {
        return gewicht;
    }
    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }
    // Methoden für Gewichtszunahme und -abnahme
    public void zunahmeGewicht(double amount) {
        gewicht += amount;
    }
    public void abnahmeGewicht(double amount) {
        gewicht -= amount;
    }

    // toString-Methode, um die Informationen der Person zu zeigen
    public String toString() {
        return "Person: " + vorName + " " + nachName +
                "\nAlter: " + alter +
                "\nGeburtsdatum: " + geburtDate +
                "\nGewicht: " + gewicht + " kg";
    }

    // Beispiel für die Verwendung der Klasse
    public static void main(String[] args) {
        // Erzeugung eines LocalDate-Objekts für das Geburtsdatum
        LocalDate birthDate = LocalDate.of(1992, 12, 31);

        // Erzeugung einer neuen Person mit den angegebenen Eigenschaften
        Person person = new Person("Jessy", "Niada", 31, birthDate, 75.5);

        // Ausgabe der Informationen der Person
        System.out.println(person);

        // Gewichtszunahme um 2.5 kg
        person.zunahmeGewicht(2.5);
        System.out.println("Gewicht nach Zunahme: " + person.getGewicht());

        // Gewichtsabnahme um 1.3 kg
        person.abnahmeGewicht(1.3);
        System.out.println("Gewicht nach Abnahme: " + person.getGewicht());
    }
}
