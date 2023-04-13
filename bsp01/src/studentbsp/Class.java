package studentbsp;

public class Class {
    private String name;
    private int hours;
    private int maxCapacity;
    private int enrolledStudents;

    public Class(String name, int hours, int maxCapacity) {
        this.name = name;
        this.hours = hours;
        this.maxCapacity = maxCapacity;
        this.enrolledStudents = 0;
    }

    public void enrollStudent() {
        this.enrolledStudents++;
    }

    public boolean maxCapacityReached() {
        return enrolledStudents >= maxCapacity;
    }

    public String getName() {
        return name;
    }

    // toString() Methode generiert
    @Override
    public String toString() {
        return "StudentBsp.Class{" +
                "name='" + name + '\'' +
                '}';
    }
}
