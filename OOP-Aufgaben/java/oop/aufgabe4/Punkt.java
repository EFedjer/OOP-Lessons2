package oop.aufgabe4;


// Die Klasse Punkt repräsentiert einen Punkt im zweidimensionalen Koordinatensystem
class Punkt {
    // Attribute
    private double x; // X-Koordinate
    private double y; // Y-Koordinate

    // Konstruktor, um einen Punkt mit den gegebenen Koordinaten zu erstellen
    public Punkt(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Methode zur Berechnung des Abstands des Punktes zum Ursprung (0, 0)
    public double abstandZumUrsprung() {
        // Verwende den Satz des Pythagoras, um den Abstand zum Ursprung zu berechnen
        return Math.sqrt(x * x + y * y);
    }

    // Methode zur Spiegelung des Punktes an der X-Achse
    public Punkt spiegelungAnXAchse() {
        // Die X-Koordinate bleibt unverändert, während die Y-Koordinate negiert wird
        return new Punkt(x, -y);
    }

    // Methode zur Spiegelung des Punktes an der Y-Achse
    public Punkt spiegelungAnYAchse() {
        // Die Y-Koordinate bleibt unverändert, während die X-Koordinate negiert wird
        return new Punkt(-x, y);
    }

    // Methode zur Spiegelung des Punktes am Ursprung
    public Punkt spiegelungAmUrsprung() {
        // Beide Koordinaten werden negiert, um den Punkt am Ursprung zu spiegeln
        return new Punkt(-x, -y);
    }

    // Methode zur Berechnung des Abstands des Punktes zu einem anderen Punkt
    public double abstandZuPunkt(Punkt andererPunkt) {
        // Berechne die Differenzen der X- und Y-Koordinaten zwischen den beiden Punkten
        double differenzX = this.x - andererPunkt.x;
        double differenzY = this.y - andererPunkt.y;
        // Verwende den Satz des Pythagoras, um den Abstand zwischen den beiden Punkten zu berechnen
        return Math.sqrt(differenzX * differenzX + differenzY * differenzY);
    }

    // Methode, um den Punkt als String zu repräsentieren
    @Override
    public String toString() {
        // Gibt die Koordinaten des Punktes in einem lesbaren Format zurück
        return "(" + x + ", " + y + ")";
    }
}


