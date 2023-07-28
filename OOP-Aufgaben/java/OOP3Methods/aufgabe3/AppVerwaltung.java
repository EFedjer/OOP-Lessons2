package OOP3Methods.aufgabe3;

public class AppVerwaltung {

        public static void main(String[] args) {
            // Schritt 1: Erstellen Sie ein Objekt der Verwaltungsklasse.
            Verwaltung verwaltung = new Verwaltung();

            // Schritt 2: Fügen Sie zwei Beispiel-Patienten hinzu.
            verwaltung.addPatient(1, "Max Mustermann", "Musterstraße 123", "01.01.1985", "MusterKasse AG");
            verwaltung.addPatient(2, "Maria Müller", "Hauptstraße 456", "15.03.1990", "MusterKasse AG");

            // Schritt 3: Fügen Sie zwei Beispiel-Krankenkassen hinzu.
            verwaltung.addKrankenkasse(1001, "MusterKasse AG");
            verwaltung.addKrankenkasse(1002, "GesundPlus GmbH");

            // Schritt 4: Ordnen Sie die Patienten den entsprechenden Krankenkassen zu (Variante III).
            // Hinweis: Patient 1 soll zur Kassennummer 1001 (MusterKasse AG) und Patient 2 zur Kassennummer 1002 (GesundPlus GmbH) zugeordnet werden.

            // Zuerst weisen wir den Patienten 1 der Kassennummer 1001 zu.
            verwaltung.assignPatientToKrankenkasse(1, 1001);

            // Dann weisen wir den Patienten 2 der Kassennummer 1002 zu.
            verwaltung.assignPatientToKrankenkasse(2, 1002);

            // Schritt 5: Überprüfen Sie die Zuordnung der Patienten zu den Krankenkassen und geben Sie die Ergebnisse aus.

            // Suchen der Patienten in der Verwaltungsklasse anhand ihrer Nummern
            Patient patient1 = verwaltung.getPatientByNumber(1);
            Patient patient2 = verwaltung.getPatientByNumber(2);

            // Ausgabe der Informationen für Patient 1
            System.out.println("Patient 1:");
            System.out.println("Name: " + patient1.getPatientName());
            System.out.println("Versichertenname: " + patient1.getInsuredName());
            System.out.println("Versicherten-Karte vorgelegt: " + patient1.isInsuranceCardPresent());
            System.out.println();

            // Ausgabe der Informationen für Patient 2
            System.out.println("Patient 2:");
            System.out.println("Name: " + patient2.getPatientName());
            System.out.println("Versichertenname: " + patient2.getInsuredName());
            System.out.println("Versicherten-Karte vorgelegt: " + patient2.isInsuranceCardPresent());
        }
    }
