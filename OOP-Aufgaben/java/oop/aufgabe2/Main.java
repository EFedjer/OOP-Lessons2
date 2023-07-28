package oop.aufgabe2;

public class Main {
    public static void main(String[] args) {
        // Erstelle ein Autoobjekt mit Startwerten
        Auto meinAuto = new Auto("LUEF123", 50000.0, 60.0, 6.5, 40.0);

        // Abfrage von Eigenschaften des Autos
        System.out.println("KFZ-Kennzeichen: " + meinAuto.getKfzKennzeichen());
        System.out.println("Kilometerstand: " + meinAuto.getKilometerstand() + " km");
        System.out.println("Tankvolumen: " + meinAuto.getTankvolumen() + " Liter");

        // Tanken und Fahren
        meinAuto.tanken(30.0); // Tankt 30 Liter Kraftstoff
        meinAuto.fahren(250.0); // Fährt 250 km, verbraucht ca. 16.25 Liter Kraftstoff

        // Aktuelle Werte nach dem Tanken und Fahren abfragen
        System.out.println("Aktuelle Kraftstoffmenge: " + meinAuto.getKraftstoffmenge() + " Liter");
        System.out.println("Kilometerstand nach der Fahrt: " + meinAuto.getKilometerstand() + " km");
    }
}
