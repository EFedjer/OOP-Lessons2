package oop.aufgabe2;

public class Auto {
    private String kfzKennzeichen;
    private double kilometerstand;
    private double tankvolumen;
    private double kraftstoffverbrauch;
    private double kraftstoffmenge;

    // Konstruktor für ein Auto ohne Werte
    public Auto() {
        this.kfzKennzeichen = "";
        this.kilometerstand = 0.0;
        this.tankvolumen = 0.0;
        this.kraftstoffverbrauch = 0.0;
        this.kraftstoffmenge = 0.0;
    }

    // Konstruktor für ein Auto mit Startwerten
    public Auto(String kfzKennzeichen, double kilometerstand, double tankvolumen, double kraftstoffverbrauch, double kraftstoffmenge) {
        this.kfzKennzeichen = kfzKennzeichen;
        this.kilometerstand = kilometerstand;
        this.tankvolumen = tankvolumen;
        this.kraftstoffverbrauch = kraftstoffverbrauch;
        this.kraftstoffmenge = kraftstoffmenge;
    }

    // Tanken: Menge an Kraftstoff zum Tanken hinzufügen
    public void tanken(double menge) {
        kraftstoffmenge += menge;
        if (kraftstoffmenge > tankvolumen) {
            kraftstoffmenge = tankvolumen; // Stellt sicher, dass die Tankmenge nicht das Tankvolumen überschreitet
        }
    }
    // Fahren: Eine bestimmte Strecke zurücklegen, verbrauchter Kraftstoff wird berechnet
    public void fahren(double strecke) {
        double verbrauch = strecke / 100 * kraftstoffverbrauch;
        if (verbrauch <= kraftstoffmenge) {
            kraftstoffmenge -= verbrauch;
            kilometerstand += strecke;
        } else {
            // Wenn nicht genug Kraftstoff vorhanden ist, wird das Auto nur so weit fahren, wie der Kraftstoff reicht
            double maxStrecke = kraftstoffmenge * 100 / kraftstoffverbrauch;
            kilometerstand += maxStrecke;
            kraftstoffmenge = 0;
            System.out.println("Warnung: Nicht genug Kraftstoff. Das Auto kann nur " + maxStrecke + " km fahren.");
        }
    }
    // Abfrage des KFZ-Kennzeichens
    public String getKfzKennzeichen() {
        return kfzKennzeichen;
    }
    // Abfrage des Kilometerstands
    public double getKilometerstand() {
        return kilometerstand;
    }
    // Abfrage des Tankvolumens
    public double getTankvolumen() {
        return tankvolumen;
    }
    // Abfrage der aktuellen Kraftstoffmenge
    public double getKraftstoffmenge() {
        return kraftstoffmenge;
    }
}



