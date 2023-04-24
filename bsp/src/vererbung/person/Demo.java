package person;

public class Demo {
    public static void main(String[] args) {
        Student student = new Student("Franz", 30, "KF", 111222333);
        student.hallo();

        Arbeitnehmer arbeitnehmer = new Arbeitnehmer("Emanuel", 22, "ÖBB");
        arbeitnehmer.hallo();

        Lektor lektor = new Lektor("Lisa", 40, "FH", "Mathe");
        lektor.hallo();

        Wohngemeinschaft wohngemeinschaft = new Wohngemeinschaft(new Adresse("Strasse", 53, "Graz", 8010));
        wohngemeinschaft.addPerson(student);
        wohngemeinschaft.addPerson(lektor);
        wohngemeinschaft.addPerson(arbeitnehmer);
        System.out.println(wohngemeinschaft.getPersonen());
    }
}
