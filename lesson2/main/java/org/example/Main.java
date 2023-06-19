package org.example;

public class Main {
    public static int summe(int n) {
// TODO: Implementierung
        if (n <= 0) {
            return 0;
        } else {
            return n + summe(n - 1);
        }
    }
    public static void main(String[]args){
// TODO: Funktion summe aufrufen und auf der Konsole ausgeben }
        System.out.println("Die Summe von 0 bis 3 ergibt:" + summe(3));
    }
}








