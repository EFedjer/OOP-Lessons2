package course.String;

public class Polindrom{
    // Main Methode ruft die Methode Polindrom mit dem geschriebenen Text auf.
    public static void main(String[] args) {
        palindrom("Der vor dir stehende Rentner heißt Otto Uwe");
    }
    public static void palindrom(String text) {
        String[] words = text.split("\\s+"); // die split Methode und der Ausdruck "\\s+" teilt den Text
        // erstmal in Wörter auf anhand der Leerzeichen
        for (String word : words) {
            if (isPalindrome(word)) { // in der Schleife wird jedes wort im Array mit der Methode isPalindrome überprüft
                System.out.println(word); // wenn es zutrifft wird es ausgegeben
            }
        }
    }
    public static boolean isPalindrome(String word) {//Die Methode isPalindrome nimmt ein Wort als Parameter entgegen.
        // Sie erstellt einen StringBuilder, der das Wort umgekehrt also reversed enthält, indem es den reverse-Aufruf verwendet.
        StringBuilder reversed = new StringBuilder(word).reverse();//wird überprüft, ob das ursprüngliche Wort und die
        // umgekehrte Version des Wortes übereinstimmen. Falls dies der Fall ist,
        // gibt die Methode true zurück und signalisiert damit, dass das Wort ein Palindrom ist. Andernfalls gibt sie false zurück.
        return word.equalsIgnoreCase(reversed.toString());
    }
}

