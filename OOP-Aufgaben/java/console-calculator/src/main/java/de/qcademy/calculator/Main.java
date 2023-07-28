package de.qcademy.calculator;

//Der Code importiert den „ScannerScannerKlasse zum Lesen von Benutzereingaben und die Klassen Patternund Matcher zum
// Arbeiten mit regulären Ausdrücken.
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Benutzereingaben lesen

        //Variablen Muster initialisieren. Das plusOppatternist ein reguläres Ausdrucksmuster, das arithmetische Ausdrücke mit Addition ( +) abgleicht.
        Pattern plusOppattern = Pattern.compile("\\s*(\\d+)\\s*\\+\\s*(\\d+)|\\s*\\+\\s*(\\d+)|\\s*(\\d+)");     //Addition
        Pattern multiplyOppattern = Pattern.compile("\\s*(\\d+)\\s*\\*\\s*(\\d+)|\\s*\\*\\s*(\\d)|\\s+(\\d+)"); // Multiplikation
        Pattern subtractOppattern = Pattern.compile("\\s*(\\d+)\\s*\\-\\s*(\\d+)|\\s*\\-\\s*(\\d)|\\s+(\\d+)"); // Subtraktion
        Pattern divideOppattern = Pattern.compile("\\s*(\\d+)\\s*\\/\\s*(\\d+)|\\s*\\/\\s*(\\d)|\\s+(\\d+)");   // Division
        Pattern moduloOppattern = Pattern.compile("\\s*(\\d+)\\s*%\\s*(\\d+)|\\s*%\\s*(\\d)|\\s+(\\d+)");   // Modulo

        Pattern quitPattern = Pattern.compile("^\\s*:q\\s*$");

        boolean calculaterStopped = false; // Die calculaterStoppedVariable ist ein boolesches Flag, das zur Steuerung der Schleife verwendet wird.
        while (! calculaterStopped) { //Der Rechner läuft in einer Schleife, bis das calculaterStopped Flag auf true gesetzt wird.

            System.out.println("Ausdruck eingeben: "); //Das Programm fordert den Benutzer zur Eingabe eines arithmetischen Ausdrucks auf und liest ihn von der Konsole.
            String input = scanner.nextLine();

            Matcher plusOpMatcher = plusOppattern.matcher(input);               //Addition  //Das MatcherObjekt wird durch Anwenden des plusOppatternauf den Benutzereingabeausdruck erstellt.
            Matcher multiplyOpMatcher = multiplyOppattern.matcher(input);       // Multiplikation
            Matcher subtractOpMatcher = subtractOppattern.matcher(input);       // Subtraktion
            Matcher divideOpMatcher = divideOppattern.matcher(input);           // Division
            Matcher moduloOpMatcher = moduloOppattern.matcher(input);           // Modulo
            Matcher quitMatcher = quitPattern.matcher(input);

            if (plusOpMatcher.matches()) {            //Addition //Wenn die Eingabe mit dem Additionsmuster übereinstimmt, wird der Code in der Anweisung ausgeführt.
                if (plusOpMatcher.group(4) != null) {
                    double result = Double.parseDouble(plusOpMatcher.group(4)); //Der Code prüft, welche Gruppe im regulären Ausdrucksmuster übereinstimmt,
                    System.out.println(input + "=" + result);                   //um die Anzahl der Operanden zu bestimmen, und führt die entsprechende Addition durch.
                } else if (plusOpMatcher.group(3) != null) {
                    double result = Double.parseDouble(plusOpMatcher.group(3));
                    System.out.println(input + "=" + result);
                } else {
                    double ersterOperand = Double.parseDouble(plusOpMatcher.group(1));
                    double zweiterOperand = Double.parseDouble(plusOpMatcher.group(2));
                    double result = ersterOperand + zweiterOperand;
                    System.out.println(input + " = " + result);
                }
            }
            else if (multiplyOpMatcher.matches()) {                         // Multiplikation
                if (multiplyOpMatcher.group(4) != null) {
                    double result = Double.parseDouble(multiplyOpMatcher.group(4));
                    System.out.println(input + " = " + result);
                } else if (multiplyOpMatcher.group(3) != null) {
                    double result = Double.parseDouble(multiplyOpMatcher.group(3));
                    System.out.println(input + " = " + result);
                } else {
                    double ersterOperand = Double.parseDouble(multiplyOpMatcher.group(1));
                    double zweiterOperand = Double.parseDouble(multiplyOpMatcher.group(2));
                    double result = ersterOperand * zweiterOperand;
                    System.out.println(input + " = " + result);
                }
            }
                     else if (subtractOpMatcher.matches()) {                              // Subtraktion
                        if (subtractOpMatcher.group(4) != null) {
                            double result = Double.parseDouble(subtractOpMatcher.group(4));
                            System.out.println(input + " = " + result);
                        } else if (subtractOpMatcher.group(3) != null) {
                            double result = Double.parseDouble(subtractOpMatcher.group(3));
                            System.out.println(input + " = " + result);
                        } else {
                            double ersterOperand = Double.parseDouble(subtractOpMatcher.group(1));
                            double zweiterOperand = Double.parseDouble(subtractOpMatcher.group(2));
                            double result = ersterOperand - zweiterOperand;
                            System.out.println(input + " = " + result);
                }
            }

            else if (divideOpMatcher.matches()) {                                // Division
                if (divideOpMatcher.group(4) != null) {
                    double result = Double.parseDouble(divideOpMatcher.group(4));
                    System.out.println(input + " = " + result);
                } else if (divideOpMatcher.group(3) != null) {
                    double result = Double.parseDouble(divideOpMatcher.group(3));
                    System.out.println(input + " = " + result);
                } else {
                    double ersterOperand = Double.parseDouble(divideOpMatcher.group(1));
                    double zweiterOperand = Double.parseDouble(divideOpMatcher.group(2));
                    double result = ersterOperand / zweiterOperand;
                    System.out.println(input + " = " + result);
                }
            }

            else if (moduloOpMatcher.matches()) {                                // Modulo
                if (moduloOpMatcher.group(4) != null) {
                    double result = Double.parseDouble(moduloOpMatcher.group(4));
                    System.out.println(input + " = " + result);
                } else if (moduloOpMatcher.group(3) != null) {
                    double result = Double.parseDouble(moduloOpMatcher.group(3));
                    System.out.println(input + " = " + result);
                } else {
                    double ersterOperand = Double.parseDouble(moduloOpMatcher.group(1));
                    double zweiterOperand = Double.parseDouble(moduloOpMatcher.group(2));
                    double result = ersterOperand % zweiterOperand;
                    System.out.println(input + " = " + result);
                }
            }

            else if (quitMatcher.matches()) {   //Wenn der Benutzer eine bestimmte Eingabe eingibt, die mit quitMatcher übereinstimmt,
                System.out.println("Taschenrechner wird gestopped ..."); //wird die Rechnerschleife angehalten und das Programm zeigt eine Meldung an.
                calculaterStopped = true;

            } else { //Wenn die Benutzereingabe keinem Vorgang entspricht, wird eine Fehlermeldung angezeigt.
                System.err.println("Operation:" + input + "nicht erkannt!");
            }
        }
    }
}


