package person;

public class Adresse {
    private String strasse;
    private int hausnummer;
    private String stadt;
    private int postleitzahl;

    public Adresse(String strasse, int hausnummer, String stadt, int postleitzahl) {
        this.strasse = strasse;
        this.hausnummer = hausnummer;
        this.stadt = stadt;
        this.postleitzahl = postleitzahl;
    }

    @Override
    public String toString() {
        return "person.Adresse{" +
                "strasse='" + strasse + '\'' +
                ", hausnummer=" + hausnummer +
                ", stadt='" + stadt + '\'' +
                ", postleitzahl=" + postleitzahl +
                '}';
    }
}
