package person;

public class Person {
    private String name;
    private int alter;

    public Person(String name, int alter) {
        this.name = name;
        this.alter = alter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public void hallo() {
        System.out.println("Hallo, ich bin eine person.Person.");
    }

    @Override
    public String toString() {
        return "person.Person{" +
                "name='" + name + '\'' +
                ", alter=" + alter +
                '}';
    }
}
