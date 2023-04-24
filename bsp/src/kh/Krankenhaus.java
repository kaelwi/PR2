package kh;

import java.util.ArrayList;

public class Krankenhaus {
    ArrayList<Arzt> aerzte = new ArrayList<>();

    public void add(Arzt a) {
        aerzte.add(a);
    }

    public ArrayList<Arzt> getAerzte() {
        return aerzte;
    }

    public void print() {
        for (Arzt a : aerzte) {
            System.out.println(a.getName() + " verdient " + a.getGehalt());
        }
    }
}
