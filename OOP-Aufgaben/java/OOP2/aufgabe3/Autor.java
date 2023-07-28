package OOP2.aufgabe3;

// Die Klasse Autor
class Autor {
    // Attribute
    private String name;
    private String synonym;
    private double gage;

    // Konstruktor
    public Autor(String name) {
        this.name = name;
    }

    // Getter und Setter für Synonym und Gage
    public String getSynonym() {
        return synonym;
    }

    public void setSynonym(String synonym) {
        this.synonym = synonym;
    }

    public double getGage() {
        return gage;
    }

    public void setGage(double gage) {
        this.gage = gage;
    }

    // toString-Methode für die Ausgabe der Autor-Daten
    public String toString() {
        return "Autor: " + name + ", Synonym: " + synonym + ", Gage: " + gage;
    }
}

// Die Klasse Buch
class Buch {
    // Attribute
    private String titel;
    private String isbn;
    private double preis;

    //In der Klasse Buch wird ein Attribut vom Typ "Autor" erstellt, das dazu dient, den Autor für ein bestimmtes
    // Buch zu speichern. Dieses Attribut wird üblicherweise als eine Referenz auf ein Objekt der Klasse Autor angelegt.
    // Dadurch wird eine Beziehung zwischen der Klasse Buch und der Klasse Autor hergestellt.
    private Autor autor; // Referenz auf das Autor-Objekt

    // Konstruktor
    public Buch(String titel, String isbn) {
        this.titel = titel;
        this.isbn = isbn;
    }

    // Getter und Setter für den Preis
    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }
     //Um den Autor für ein Buch festzulegen, wird in der Klasse Buch eine Methode erstellt, die es ermöglicht,
    // ein Autor-Objekt zu übergeben und das Attribut "autor" mit diesem Wert zu aktualisieren. Diese Methode wird
    // üblicherweise als Setter-Methode bezeichnet

    //Durch die Bereitstellung der Methode setAuthor wird es möglich, den Autor eines Buches von außen zu setzen,
    // indem ein entsprechendes Autor-Objekt übergeben wird. Auf diese Weise können wir den Autor für jedes Buch individuell festlegen.

    //Die Kombination aus dem Attribut "autor" und der Methode setAuthor ermöglicht es uns, die Information über
    // den Autor mit dem jeweiligen Buch zu verknüpfen und somit die Beziehung zwischen Buch und Autor herzustellen.
    public void setAuthor(Autor autor) {  // Methode zum Setzen des Autors
        this.autor = autor;
    }

    // toString-Methode für die Ausgabe der Buch-Daten
    public String toString() {
        String authorInfo = autor != null ? "\n" + autor.toString() : ""; // Wenn es einen Autor gibt, füge die Autor-Informationen hinzu
        return "Titel: " + titel + ", ISBN: " + isbn + ", Preis: " + preis + authorInfo;
    }
}

