package Person;

public class Person {
    // attribute sollten private sein, zugriff über getter/setter
    private String firstName;
    private int age;

    public Person(String firstName,int age) {
        this.firstName = firstName;
        this.age = validateAge(age);
    }

    // validateAge ist private, weil es nur in dieser Klasse verwendet wird
    private int validateAge(int age) {
        // ternärer operator (wie if/else)
        return age < 0 ? 0 : age;
    }

    public void sayHello() {
        System.out.println("Hello, my name is " + getFirstName());
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void sayHello(String to) {
        System.out.println("Hello " + to + ", my name is " + firstName);
    }
}


