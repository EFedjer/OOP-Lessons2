package course.loops.whileLoop;

public class whileLoop {
   /* public static void main (String[] args) {
        for (int i = 0; i < 10; i++) {
            if ((i % 2) == 0) {
                System.out.println(i + " ist eine gerade Zahl");
            } else {
                System.out.println(i + " ist eine ungerade Zahl");
            }
        }

        System.out.println("************ While Schleife zu Aufgabe 1 B ************");

        int counter = 0;
        while (counter < 10) {
            if (counter % 2 == 0) {  /* modulo / Restwert*/
            /*    System.out.println(counter + " ist eine gerade Zahl");
                counter++;
            } else {
                System.out.println(counter + " ist eine ungerade Zahl");
                counter++;
            }
        }*/

       // System.out.println("************ Arrays zu Aufgabe 2 ************");

   /* public static double array_sum(double[] arr) {
        double sum = 0.0;  // Initialisiere summe auf 0
        int i = 0;  // Initialisiere loop counter

        while (i < arr.length) {  // Iteration bis Ende des array
            sum += arr[i];  // Addiere aktuelle Zahl auf die Summe
            i++;  // Incremeniere/Erhöhe den loop counter
        }

        return sum;  // Berechnete Summe zurück geben
    }
    public static void main(String[] args) {
        double[] arr = {4, 5, 6, 7, 8}; //initialisiere Array mit den Werten
        double result = array_sum(arr);// aufruf der Funktion array_sum und übergabe des arrays
        System.out.println("Sum: " + result); //Summe in der Variable result speichern und ausgeben
    }*/

    // Primzahlen*****************************************************************************************
   /* public static void primeNumbers(int n) {  //statische Methode , kann ohne instanz aufgerufen werden,
        // hat nur den Parameter n Typ int
        int num = 2;  // Beginnen mit der Initialisierung der ersten Primzahl 2
        while (num <= n) {  //Die Funktion wird solange ausgeführt bis num kleiner oder gleich n ist
            boolean Primzahl = true; //innerhalb der Schleife wird die Variable Primzahl mit true initialisiert mit der
            // Voraussetzung das der Wert in num eine Primzahl ist

            // Prüfen ob „num“ durch eine beliebige Zahl von 2 bis sqrt(num) teilbar ist
            for (int i = 2; i <= Math.sqrt(num); i++) { //die for schleife iteriert von 2 bis zur quadratwurzel von num.
                // Variable i ist der Teiler von num.
                if (num % i == 0) {  // Überprüft ob num teilbar oder gleich i ist
                    Primzahl = false; // Wenn der Rest der Division 0 ergibt ist num duch i teilbar und somit keine
                    // Primzahl. Dann wird Primzahl auf false gesetzt und
                    break; // die Schleife beendet
                }
            }
            if (Primzahl) {  // überprüft ob der Wert von Primzahl noch true ist,
                System.out.println(num); //wen ja dann wird es mit num ausgegeben
            }
            num++; // num wird um einz erhöht und die Schleife wiederholt den Vorgang für die nächste Zahl
        }
        System.out.println("Die Primzahlen bis " + n + ":"); // Ausgabe der Primzahlen
    }
    public static void main(String[] args) { // Main Methode
        int n = 20;  // initialisire variable n mit dem Wert 20, damit die Primzahlen bis 20 gesucht werden
        primeNumbers(n); // die Funktion primeNumber wird mit dem Wert von n aufgerufen
    }  */

    // *****************GGT*****************************************************************
    public static int ggt(int n, int m) {
        // diese Methode stellt sicher das der Wert von n positiv ist, berechnet dessen absolut Wert
        n = Math.abs(n);
        // die Methode stellt sicher das der Wert von m positiv ist (absolut Wert)
        m = Math.abs(m);
        // Die Funktion überprüft ob m gleich 0 ist, wenn es 0 ist dann ist der ggt n.
        if (m == 0) {
            return n; // n wird zurückgeliefert
        }
        // Rekursiver fall, ruft den ggt mit m und dem rest von n dividiert durch m auf
        return ggt(m, n % m);
    }
    public static void main(String[] args) { // Main Methode
        int n = 48; // initialisiere zwei ganze Zahlen n und m mit den Werten 48 und 18
        int m = 18;
        int result = ggt(n, m); // ruft die ggt Funktion auf und übergibt die Werte von n und m.
        // Speichert den zurückgegeben ggt in der variable result.
        System.out.println("GGT von " + n + " und " + m + " ist: " + result); // gibt die Berechnung aus
    }
}







