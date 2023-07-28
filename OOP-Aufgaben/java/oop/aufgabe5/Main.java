package oop.aufgabe5;

public class Main {
    public static void main(String[] args) {
        // Erstellen eines Radio-Objekts mit den gegebenen Parametern
        Radio radio = new Radio(true, 5, 98.4);
        // Ausgabe des internen Zustands des Radios
        System.out.println(radio); // Ausgabe: Radio an: Freq: 98.4, Laut=5
        // Erhöhen der Lautstärke zweimal
        radio.lauter();
        radio.lauter();
        System.out.println(radio); // Ausgabe: Radio an: Freq: 98.4, Laut=7

        // Verringern der Lautstärke einmal
        radio.leiser();
        System.out.println(radio); // Ausgabe: Radio an: Freq: 98.4, Laut=6

        // Ausschalten des Radios
        radio.aus();
        System.out.println(radio); // Ausgabe: Radio an: Freq: 98.4, Laut=6

        // Einschalten des Radios
        radio.an();
        System.out.println(radio); // Ausgabe: Radio an: Freq: 98.4, Laut=6

        // Wählen eines Senders mit einer nicht erlaubten Frequenz (120.0)
        radio.waehleSender(120.0);
        System.out.println(radio); // Ausgabe: Radio an: Freq: 99.9, Laut=6

        // Wählen eines Senders mit einer erlaubten Frequenz (100.5)
        radio.waehleSender(100.5);
        System.out.println(radio); // Ausgabe: Radio an: Freq: 100.5, Laut=6
    }
}
