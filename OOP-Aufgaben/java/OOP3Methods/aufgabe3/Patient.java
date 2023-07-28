package OOP3Methods.aufgabe3;

public class Patient {
    private int patientNumber;      // Patienten-Nr.
    private String patientName;     // Patientenname
    private String address;         // Adresse
    private String birthDate;       // Geburtsdatum
    private String insuredName;     // Versichertenname
    private boolean insuranceCardPresent; // Versicherten-Karte vorgelegt (ja/nein)

    // Konstruktor für die Patientenklasse
    public Patient(int patientNumber, String patientName, String address, String birthDate, String insuredName) {
        this.patientNumber = patientNumber;
        this.patientName = patientName;
        this.address = address;
        this.birthDate = birthDate;
        this.insuredName = insuredName;
        this.insuranceCardPresent = true; // Neue Patienten haben die Versicherten-Karte meistens vorgelegt.
    }

    // Getter und Setter Methoden für die Attribute der Patientenklasse

    public int getPatientNumber() {
        return patientNumber;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getAddress() {
        return address;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public String getInsuredName() {
        return insuredName;
    }

    public void setInsuredName(String insuredName) {
        this.insuredName = insuredName;
    }

    public boolean isInsuranceCardPresent() {
        return insuranceCardPresent;
    }

    public void setInsuranceCardPresent(boolean insuranceCardPresent) {
        this.insuranceCardPresent = insuranceCardPresent;
    }
}
