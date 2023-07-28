package course.loops.forLoop;

public class Fibonacci {
    public static int fibonacci(int n) {
        if (n <= 1) {//überprüfe ob die Zahl n kleiner oder gleich 1 ist
            return n;// wenn 0 oder 1 wird der Wert zurückgegeben (Fibonacci für diese zahlen sind gleich)
        }
        int fib = 1; // die Variablen mit den wert 1 werden initialisiert
        int vorFib = 1;

        for (int i = 2; i < n; i++) {
            int temp = fib; //erstelle eine temp Variable das den wert von fib initialisiert
            fib += vorFib;// der wert von vorFib wird aktualisiert und auf den wert von fib addiert
            vorFib = temp;// der wert wird in temporeren variable temp gespeichert
        }
        return fib; //der Wert von n wird in fib gespeichert und zurückgegeben
    }
    public static void main(String[] args) {
        int n = 10; //die Variable n wird mit dem Wert 10 initialisiert
        int result = fibonacci(n); //die methode fibonacci wird mit n als argument aufgerufen und
        // das ergebnis wird in result gespeichert
        System.out.println("Die Fibonacci-Zahl für " + n + " ist: " + result);//Ausgabe
    }
}


