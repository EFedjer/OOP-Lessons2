package course.String;
import java.util.Arrays; // Arrays packet ist nötig um diese zu nutzen

public class AnagramCheck {
    public static boolean isAnagram(String str1, String str2) {
        //  Ich entferne die Leerzeichen und konvertiere zu Kleinbuchstaben beide Strings, somit ist der Vergleich möglich
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        // Überprüfe die Länge der Zeichenketten. Wenn die Längen nicht übereinstimmen, können sie keine Anagramme sein,
        // und die Methode gibt false zurück.
        if (str1.length() != str2.length()) {
            return false;
        }

        // Konvertiere die Zeichenketten zu Arrays, um sie sortieren zu können.
        char[] charArray1 = str1.toCharArray();// Die Methode CharArray wandelt die Zeichenkette in einzelne Zeichen
        char[] charArray2 = str2.toCharArray();

        // Sortiere die Arrays, um die Buchstaben besser zu vergleichen
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Vergleiche die sortierten Arrays
        return Arrays.equals(charArray1, charArray2); // Wenn die Arrays gleich sind, bildet die Zeichenkette
        // ein Anagramm und die Methode gibt true zurück, andernfalls ist es false
    }
    // die Main Methode enthält die Strings die verglischen werden und die Ausgabe der Ergebnisse
    public static void main(String[] args) {
        String str1 = "Desperation";
        String str2 = "A Rope Ends It";

        if (isAnagram(str1, str2)) {
            System.out.println(str1 + " und " + str2 + " bilden ein Anagramm.");
        } else {
            System.out.println(str1 + " und " + str2 + " bilden kein Anagramm.");
        }
    }
}