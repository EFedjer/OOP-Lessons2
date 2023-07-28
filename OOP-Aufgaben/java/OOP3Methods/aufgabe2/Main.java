package OOP3Methods.aufgabe2;


public class Main {
    public static void main(String[] args) {
        // Erstellen der Warteschlange mit maximaler Kapazität von 10 Autos
        Warteschlange warteschlange = new Warteschlange(10);

        // Hinzufügen von 10 Autos zur Warteschlange
        Auto auto1 = new Auto("ABC123", "VW Golf", "Kompakt", false);
        warteschlange.autoHinzufuegen(auto1);
        Auto auto2 = new Auto("XYZ789", "BMW X5", "SUV", true);
        warteschlange.autoHinzufuegen(auto2);
        Auto auto3 = new Auto("DEF456", "Mercedes E-Class", "Limousine", false);
        warteschlange.autoHinzufuegen(auto3);
        Auto auto4 = new Auto("GHI789", "Toyota Corolla", "Kompakt", false);
        warteschlange.autoHinzufuegen(auto4);
        Auto auto5 = new Auto("JKL012", "Audi A4", "Limousine", false);
        warteschlange.autoHinzufuegen(auto5);
        Auto auto6 = new Auto("MNO345", "Honda CR-V", "SUV", false);
        warteschlange.autoHinzufuegen(auto6);
        Auto auto7 = new Auto("PQR678", "Ford Mustang", "Sportwagen", false);
        warteschlange.autoHinzufuegen(auto7);
        Auto auto8 = new Auto("STU901", "Nissan Rogue", "SUV", false);
        warteschlange.autoHinzufuegen(auto8);
        Auto auto9 = new Auto("VWX234", "Hyundai Sonata", "Limousine", false);
        warteschlange.autoHinzufuegen(auto9);
        Auto auto10 = new Auto("YZA567", "Chevrolet Tahoe", "SUV", false);
        warteschlange.autoHinzufuegen(auto10);

        // Versuch, das 11. Auto zur Warteschlange hinzuzufügen
        Auto auto11 = new Auto("AAA111", "Ferrari 488", "Sportwagen", false);
        if (warteschlange.autoHinzufuegen(auto11)) {
            System.out.println("Das 11. Auto wurde erfolgreich zur Warteschlange hinzugefügt.");
        } else {
            System.out.println("Die Warteschlange ist voll. Das 11. Auto kann nicht hinzugefügt werden.");
        }

        // Autos in der Warteschlange ausgeben
        System.out.println("\nAutos in der Warteschlange:");
        int position = 1;
        for (Auto auto : warteschlange.getWarteschlange()) {
            System.out.println(position + ". " + auto.getKennzeichen() + " - " + auto.getAutomarkeUndModell());
            position++;
        }

        // Das erste Auto in der Warteschlange betritt die Autowaschanlage
        Auto erstesAuto = warteschlange.autoVerlassen();
        erstesAuto.betreteAutowaschanlage();

        System.out.println("\nDas erste Auto wurde zur Autowaschanlage geschickt.");
        System.out.println("Aktueller Status des ersten Autos: " + erstesAuto.getStatus());
        System.out.println("Wartezeit des ersten Autos in Minuten: " + erstesAuto.berechneWartezeitInMinuten());

        // Ein Auto verlässt die Warteschlange und kehrt zur Abfahrt zurück
        Auto verlassenesAuto = warteschlange.autoVerlassen();
        verlassenesAuto.verlasseWarteschlange();

        System.out.println("\nEin Auto hat die Warteschlange verlassen und kehrt zur Abfahrt zurück.");
        System.out.println("Aktueller Status des verlassenen Autos: " + verlassenesAuto.getStatus());

        // Autos in der Warteschlange nach dem Verlassen eines Autos ausgeben
        System.out.println("\nAutos in der Warteschlange nach dem Verlassen eines Autos:");
        position = 1;
        for (Auto auto : warteschlange.getWarteschlange()) {
            System.out.println(position + ". " + auto.getKennzeichen() + " - " + auto.getAutomarkeUndModell());
            position++;
        }

        // Wartezeit für jedes Auto in der Warteschlange berechnen und anzeigen (inkl. 5 Minuten für jedes nachkommende Auto)
        System.out.println("\nWartezeit für jedes Auto in der Warteschlange:");
        position = 1;
        int verzögerung = 0;
        for (Auto auto : warteschlange.getWarteschlange()) {
            long wartezeitInMinuten = auto.berechneWartezeitInMinuten() + verzögerung;
            System.out.println(position + ". " + auto.getKennzeichen() + " - " + auto.getAutomarkeUndModell() + ": " + wartezeitInMinuten + " Minuten");
            position++;
            verzögerung += 5; // Für jedes nachkommende Auto 5 Minuten zur Verzögerung hinzufügen
        }
    }
}

