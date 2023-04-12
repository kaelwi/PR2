public class Student {
    private String firstName;
    private String lastName;
    private Class[] classes;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.classes = new Class[3];
    }

    public void enroll(Class c) {
        // extracted method
        if (enrollmentNotPossible(c)) return;

        // wenn array voll ist (sprich auch letzte stelle mit einem Class-Objekt belegt ist) -> increaseArray()
        if (this.classes[classes.length - 1] != null) {
            increaseClassArray();
            classes[classes.length - 1] = c;
            c.enrollStudent();
            System.out.println(this.lastName + " successfully signed in for " + c.getName());
        } else {
            for (int i = 0; i < classes.length; i++) {
                // belegen vom array auf nächster freien stelle
                if (classes[i] == null) {
                    classes[i] = c;
                    c.enrollStudent();
                    System.out.println(this.lastName + " successfully signed in for " + c.getName());
                    break;
                }
            }
        }
    }

    private boolean enrollmentNotPossible(Class c) {
        if (c == null) {
            System.out.println("Invalid class.");
            return true;
        }

        if (c.maxCapacityReached()) {
            System.out.println("Max capacity reached, can't let in new students.");
            return true;
        }

        for (int i = 0; i < classes.length; i++) {
            if (classes[i] != null) {
                if (classes[i].getName().equals(c.getName())) {
                    System.out.println("Already enrolled in this course!");
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * Ein Array mit ursprünglicher Größe + 1 wird angelegt.
     * Elemente aus ursprünglichem Array in das neue kopiert.
     * Attribut mit einer Referenz auf das neue Array updaten.
     */
    private void increaseClassArray() {
        Class[] temp = new Class[classes.length + 1];
        for (int i = 0; i < classes.length; i++) {
            temp[i] = classes[i];
        }
        classes = temp;
        System.out.println("Extra class approved");
    }

    public void printClasses() {
        System.out.println("Student " + this.firstName + " " + this.lastName + " signed in for:");
        for (int i = 0; i < classes.length; i++) {
            // not null überprüfung, weil bei null kein zugriff auf getName() möglich
            if (classes[i] != null) {
                // mit getName() wird nur der Name ausgegeben; ohne wird der Text aus toString ausgegeben
                System.out.println(classes[i].getName());
            }
        }
    }

    // toString() Methode generiert
    // Methode muss nicht nur generierten Text zurückgeben, kann beliebigen String zurückgeben
    @Override
    public String toString() {
        return "Hallo, ich bin " + firstName + " " + lastName;
    }
}
