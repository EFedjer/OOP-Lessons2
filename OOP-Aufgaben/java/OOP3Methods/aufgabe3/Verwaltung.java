package OOP3Methods.aufgabe3;

import java.util.ArrayList;



public class Verwaltung {
    private ArrayList<Patient> patientenListe;
    private ArrayList<Krankenkasse> krankenkassenListe;

    // Konstruktor
    public Verwaltung() {
        this.patientenListe = new ArrayList<>();
        this.krankenkassenListe = new ArrayList<>();
    }

    // Methode zum Hinzufügen eines neuen Kassen-Patienten
    public void addPatient(int patientNumber, String patientName, String address, String birthDate, String insuredName) {
        Patient newPatient = new Patient(patientNumber, patientName, address, birthDate, insuredName);
        patientenListe.add(newPatient);
    }

    // Methode zum Hinzufügen einer neuen Krankenkasse
    public void addKrankenkasse(int kassennummer, String kassenname) {
        Krankenkasse newKrankenkasse = new Krankenkasse(kassennummer, kassenname);
        krankenkassenListe.add(newKrankenkasse);
    }

    // Methode zum Zuordnen eines Patienten zu einer Krankenkasse (Variante III)
    public void assignPatientToKrankenkasse(int patientNumber, int kassennummer) {
        Patient patient = getPatientByNumber(patientNumber);
        Krankenkasse krankenkasse = getKrankenkasseByNumber(kassennummer);

        if (patient != null && krankenkasse != null) {
            patient.setInsuredName(krankenkasse.getKassenname());
            patient.setInsuranceCardPresent(true);
        } else {
            System.out.println("Fehler: Patient oder Krankenkasse nicht gefunden.");
        }
    }

    // Hilfsmethode zum Suchen eines Patienten anhand der Patienten-Nr.
    public Patient getPatientByNumber(int patientNumber) {
        for (Patient patient : patientenListe) {
            if (patient.getPatientNumber() == patientNumber) {
                return patient;
            }
        }
        return null; // Wenn Patient nicht gefunden wurde.
    }

    // Hilfsmethode zum Suchen einer Krankenkasse anhand der Kassennummer
    private Krankenkasse getKrankenkasseByNumber(int kassennummer) {
        for (Krankenkasse krankenkasse : krankenkassenListe) {
            if (krankenkasse.getKassennummer() == kassennummer) {
                return krankenkasse;
            }
        }
        return null; // Wenn Krankenkasse nicht gefunden wurde.
    }
}
