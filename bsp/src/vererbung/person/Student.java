package person;

public class Student extends Person {
    private String studium;
    private int matrikelnummer;

    public Student(String name, int alter, String studium, int matrikelnummer) {
        super(name, alter);
        this.studium = studium;
        this.matrikelnummer = matrikelnummer;
    }

    @Override
    public void hallo() {
        System.out.println("Ich bin ein person.Student!");
    }
}
