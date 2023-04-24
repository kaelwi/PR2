package spielermap;

public class Spieler {
    private String name;

    public Spieler(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Spieler{" +
                "name='" + name + '\'' +
                '}';
    }
}
