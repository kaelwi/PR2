package friendlist;

public class Friend {
    // private Attribute name, age, city, country, knownSince
    private String name;
    private int age;
    private String city;
    private String country;
    private int knownSince;

    // Generate Constructor
    public Friend(String name, int age, String city, String country, int knownSince) {
        this.name = name;
        this.age = age;
        this.city = city;
        this.country = country;
        this.knownSince = knownSince;
    }

    // Generate Getter
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getCity() {
        return city;
    }

    public String getCountry() {
        return country;
    }

    public int getKnownSince() {
        return knownSince;
    }

    // Generate toString()
    @Override
    public String toString() {
        return "Friend{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", knownSince=" + knownSince +
                '}';
    }
}
