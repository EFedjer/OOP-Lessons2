package OOP3Methods.aufgabe3;

public class Krankenkasse {
    private int kassennummer;   // Kassennummer
    private String kassenname;  // Kassenname

    // Konstruktor für die Krankenkasse-Klasse
    public Krankenkasse(int kassennummer, String kassenname) {
        this.kassennummer = kassennummer;
        this.kassenname = kassenname;
    }

    // Getter Methoden für die Attribute der Krankenkasse-Klasse

    public int getKassennummer() {
        return kassennummer;
    }

    public String getKassenname() {
        return kassenname;
    }
}

