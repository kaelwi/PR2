package kh;

public class Arzt {
    private String name;
    private double gehalt;

    public Arzt(String name, double gehalt) {
        this.name = name;
        this.gehalt = gehalt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGehalt() {
        return gehalt;
    }

    public void setGehalt(int gehalt) {
        this.gehalt = gehalt;
    }

    @Override
    public String toString() {
        return "Arzt{" +
                "name='" + name + '\'' +
                '}';
    }
}
