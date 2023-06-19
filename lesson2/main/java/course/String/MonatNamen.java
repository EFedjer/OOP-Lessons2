package course.String;

//public class Strings {
   /* public static void main(String[] args) {

        StringBuilder resultB = new StringBuilder(); // resultB soll die Zeichen speichern
        for (int i = 0; i < 10000; i++) {// 10.000 mal wird die Schleife iterieren und
            resultB.append(generateRandomString());// ruft dabei die Methode generateRandomString auf und
            // die Zeichenfolge aus resultB wird an den StringBuilder durch append angehängt
        }
        String result = resultB.toString(); //Am ende der Schleife wird die toString Methode von resultB StringBulder
        // aufgerufen, um es in ein String zu konvertieren. Dieser String wird der variablen result zugewiesen
    }
    private static char[] generateRandomString() {
        return new char[0];
    }*/

    //****************************   Aufgabe 2    ***********************************************************


   /* public static String revert(String str){ //die Methode revert nimmt einen String str als Parameter und
        // gibt das Ergebnis als String zurück
        String result = ""; // varible mit einem leeren Inhalt wird initialisiert
        for (int i = str.length() -1; i>=0; i--){ // die Schleife soll das Ergebnis aus str in umgekehrter folge
            // durchlaufen. str.lenght -1 steht für das letzte Zeichen von wo es anfängt.
            result += str.charAt(i);//jeder Zeichen aus i wird durch die Methode charAt aufgerufen.
            // Der Operator += concatiniert mit der Zeichenfolge aus result
        }
        return result; // der umgekerhrte String wird durch die revert methode als result ausgegeben
    }
    public static void main(String[] args){
        System.out.println("Hallo =>" + revert("Hallo")); // in der main Methode ist der Revert String Hallo eingegen
        //das umgekehrt ausgegebn wird.
    }*/

 //   **************************    Aufgabe 3   *******************************************************

    public class MonatNamen {
        public static String monthAsString(String str) { //definiere die Methode monthAsString mit dem Rückgabetyp String
            // und den Prameter str
            String[] parts = str.split("\\."); //die Zeichenkette aus str wird mit der Methode split  und dem Punkt
            // als Trennzeichen in Teile gteilt
            int month = Integer.parseInt(parts[1]); //der Array parts enthält die geteilten Teile. Die Methode parseInt
            // wandelt die Werte aus dem Array in integer um, damit der Monat als eine Ganzezahl umgewandelt wird.

            String[] monthNames = { // erstelle Array monthName, das die Monatsnamen enthält.
                    "Januar", "Februar", "März", "April",  //Januar hat den index 0 da erter Monat
                    "Mai", "Juni", "Juli", "August",
                    "September", "Oktober", "November", "Dezember"
            };
            return monthNames[month - 1]; //Da die Monatsnummern in der Zeichenkette mit 1 beginnen,
            // muss month - 1 gesetzt werden, um den entsprechenden Index im Array zu erhalten.
        }
        public static void main(String[] args) {
            String date = "06.09.2098";
            String month = monthAsString(date); //die Methode monthAsString mit der Zeichenkette aufgerufen und
            // das Ergebnis ausgegeben.
            System.out.println(month);
        }
    }

//}







