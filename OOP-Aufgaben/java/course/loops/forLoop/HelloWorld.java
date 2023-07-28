package course.loops.forLoop;

//Berechnet die Summe aller natürlichen Zahlen von 1 bis n
    public class HelloWorld {
        public static int summe(int n) { //deklariere die methode summe mit den prametr n von Typ int bekommt
            int sum = 0;// initialisiere variable sum mit dem Anfangswert 0
            for (int i = 1; i <= n; i++) { //Schleifen index i hat den Startwert 1 und läuft solange bis i kleiner oder
                // gleich n ist.
                sum += i; // bei jedem Durchlauf wird der Wert von i der aktuellen summe sum addiert.
            }
            return sum; //Am ende der Schleife wird der Wert aus sum ausgegeben
        }
        public static void main(String[] args) {
            // erstelle die Variablen welche die Zahlen enthalten
            int zahl1 = 10; // Variablen werden mit den Zahlen initialisiert
            int zahl2 = 20;// die Zahlen ersetzen den Wert n in dem Fall
            int zahl3 = 45;

            int summe1 = summe(zahl1);// die Methode summe wird mit den unterschiedlichen Zahlen aufgerufen
            int summe2 = summe(zahl2);// und die Werte werden in den variablen summe1 bis 3 gespeichert.
            int summe3 = summe(zahl3);

            System.out.println("Die Summe von 1 bis " + zahl1 + " ist: " + summe1); //  ausgabe der variablen mit
            System.out.println("Die Summe von 1 bis " + zahl2 + " ist: " + summe2);// den berechneten Zahlen
            System.out.println("Die Summe von 1 bis " + zahl3 + " ist: " + summe3);
        }
    }


