package person;

import java.util.ArrayList;

public class Wohngemeinschaft {
    private Adresse adresse;
    private ArrayList<Person> personen;

    public Wohngemeinschaft(Adresse adresse) {
        this.adresse = adresse;
        this.personen = new ArrayList<>();
    }

    public void addPerson(Person p) {
        personen.add(p);
    }

    public ArrayList<Person> getPersonen() {
        return personen;
    }
}
