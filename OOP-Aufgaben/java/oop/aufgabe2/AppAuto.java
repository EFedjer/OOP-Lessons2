package oop.aufgabe2;

public class AppAuto {

        public static void main(String[] args) {
            // Erstelle ein Autoobjekt mit Startwerten
            Auto auto1 = new Auto("LU1234", 50000.0, 60.0, 6.5, 40.0);
            // Erstelle ein weiteres Autoobjekt mit Startwerten
            Auto auto2 = new Auto("EF2127G", 80000.0, 50.0, 7.4, 15.0);

            // Auto 1 fahren und tanken
            auto1.fahren(100.0); // Fährt 100 km, verbraucht 6.5 Liter Kraftstoff
            auto1.tanken(20.0); // Tankt 20 Liter Kraftstoff

            // Auto 2 fahren und tanken
            auto2.fahren(150.0); // Fährt 150 km, (7.4 Liter/100 km * 150 km)
            auto2.tanken(30.0); // Tankt 30 Liter Kraftstoff

            // Ausgabe der Informationen über die Autos nach dem Fahren und Tanken
            System.out.println("Informationen über Auto 1:");
            System.out.println("KFZ-Kennzeichen: " + auto1.getKfzKennzeichen());
            System.out.println("Kilometerstand: " + auto1.getKilometerstand() + " km");
            System.out.println("Tankvolumen: " + auto1.getTankvolumen() + " Liter");
            System.out.println("Aktuelle Kraftstoffmenge: " + auto1.getKraftstoffmenge() + " Liter");

            System.out.println("\nInformationen über Auto 2:");
            System.out.println("KFZ-Kennzeichen: " + auto2.getKfzKennzeichen());
            System.out.println("Kilometerstand: " + auto2.getKilometerstand() + " km");
            System.out.println("Tankvolumen: " + auto2.getTankvolumen() + " Liter");
            System.out.println("Aktuelle Kraftstoffmenge: " + auto2.getKraftstoffmenge() + " Liter");
        }
    }

