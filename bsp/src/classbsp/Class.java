package classbsp;

public class Class {
    private String name;
    private int hours;
    private int maxCapacity;
    private int enrolledStudents;
    private Wochentag tag;

    public Class(String name, int hours, int maxCapacity) {
        this.name = name;
        this.hours = hours;
        this.maxCapacity = maxCapacity;
        enrolledStudents = 0;
    }

    public Class(String name, int hours, int maxCapacity, Wochentag tag) {
        this.name = name;
        this.hours = hours;
        this.maxCapacity = maxCapacity;
        enrolledStudents = 0;
        this.tag = tag;
    }

    public Wochentag getTag() {
        return tag;
    }

    public void enroll() {
        if (maxCapacityReached()) {
            System.out.println("Schon voll!");
        } else {
            System.out.println("Angemeldet");
            enrolledStudents++;
        }
    }

    public boolean maxCapacityReached() {
        return enrolledStudents >= maxCapacity;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getEnrolledStudents() {
        return enrolledStudents;
    }

    @Override
    public String toString() {
        return "Class{" +
                "name='" + name + '\'' +
                '}';
    }
}
