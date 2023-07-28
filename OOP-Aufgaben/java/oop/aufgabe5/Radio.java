package oop.aufgabe5;

public class Radio {
    // Attribut, das angibt, ob das Radio eingeschaltet ist oder nicht
    private boolean eingeschaltet;
    // Attribut für die Lautstärke, die im Bereich von 0 bis 10 liegen kann
    private int lautstaerke;
    // Attribut für die Frequenz des gewählten Senders, im Bereich von 85.0 bis 110.0
    private double frequenz;

    // Konstruktor ohne Parameter (Standardkonstruktor)
    public Radio() {
        // Das Radio ist  ausgeschaltet
        this.eingeschaltet = false;
        // Die Lautstärke ist auf 0
        this.lautstaerke = 0;
        // Die Frequenz ist auf 99.9
        this.frequenz = 99.9;
    }

    // Konstruktor mit Parametern, um das Radio mit bestimmten Werten zu erstellen
    public Radio(boolean istAn, int lautstaerke, double frequenz) {
        // Setzen der eingeschaltet-Flag entsprechend dem übergebenen Parameter
        this.eingeschaltet = istAn;

        // Begrenzen der Lautstärke auf den Bereich von 0 bis 10
        this.lautstaerke = Math.max(0, Math.min(10, lautstaerke));

        // Begrenzen der Frequenz auf den Bereich von 85.0 bis 110.0
        this.frequenz = Math.max(85.0, Math.min(110.0, frequenz));
    }

    // Methode zum Erhöhen der Lautstärke (wenn das Radio eingeschaltet ist)
    public void lauter() {
        // Überprüfen, ob das Radio eingeschaltet ist und ob die Lautstärke kleiner als 10 ist
        if (eingeschaltet && lautstaerke < 10) {
            // Erhöhen der Lautstärke um 1
            lautstaerke++;
        }
    }
    // Methode zum Verringern der Lautstärke (wenn das Radio eingeschaltet ist)
    public void leiser() {
        // Überprüfen, ob das Radio eingeschaltet ist und ob die Lautstärke größer als 0 ist
        if (eingeschaltet && lautstaerke > 0) {
            // Verringern der Lautstärke um 1
            lautstaerke--;
        }
    }
    // Methode zum Einschalten des Radios
    public void an() {
        eingeschaltet = true;
        System.out.println("Radio ist an.");
    }
    // Methode zum Ausschalten des Radios
    public void aus() {
        eingeschaltet = false;
        System.out.println("Radio ist aus.");
    }
    // Methode zur Auswahl eines Senders mit einer bestimmten Frequenz
    public void waehleSender(double frequenz) {
        // Überprüfen, ob die gewählte Frequenz im erlaubten Bereich liegt (85.0 bis 110.0)
        if (frequenz >= 85.0 && frequenz <= 110.0) {
            // Setzen der Frequenz auf die gewählte Frequenz
            this.frequenz = frequenz;
        } else {
            // Wenn die gewählte Frequenz außerhalb des erlaubten Bereichs liegt, setzen wir die Frequenz auf 99.9
            this.frequenz = 99.9;
        }
    }
    // Überschreiben der toString-Methode, um den internen Zustand des Radios als String darzustellen
    @Override
    public String toString() {
        // Erzeugen einer Zeichenkette mit den aktuellen Werten von eingeschaltet, Lautstärke und Frequenz
        return "Radio an: Freq: " + frequenz + ", Laut=" + lautstaerke;
    }
}
