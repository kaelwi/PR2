package classbsp;

public class Student {

    private static int counter = 0;

    private String firstName;
    private String lastName;
    private int id;
    private Class[] classes;

    public Student(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.classes = new Class[3];
        this.id = counter++;
    }

    public static int getCounter() {
        return counter;
    }

    public int getId() {
        return id;
    }

    public void enroll(Class c) {
        if (alreadyEnrolled(c)) return;

        // Kurs noch frei?
        if (!c.maxCapacityReached()) {
            // array von classes schon voll?
            if (classes[classes.length - 1] != null) {
                classes = increaseClassArray();
                c.enroll();
                classes[classes.length - 1] = c;
            } else {
                // Hat Student noch Platz für einen neuen Kurs?
                // -> Array durchlaufen, schauen, wo im Array noch null steht
                for (int i = 0; i < classes.length; i++) {
                    if(classes[i] == null) {
                        c.enroll();
                        classes[i] = c;
                        System.out.println("Kurs angemeldet");
                        break;
                    }
                }
            }
        } else {
            System.out.println("Keine Anmeldung mehr möglich");
        }
    }

    private Class[] increaseClassArray() {
        // erstelle ein array um 1 größer als das ursprüngliche
        Class[] temp = new Class[classes.length + 1];
        // kopiere inhalt vom alten array in das neue
        for (int i = 0; i < classes.length; i++) {
            temp[i] = classes[i];
        }
        // temp hat hier den selben inhalt wie classes + 1 freie stelle am ende
        return temp;
    }

    private boolean alreadyEnrolled(Class c) {
        for (int i = 0; i < classes.length; i++) {
            if (classes[i] != null) {
                // man könnte hier auch erst String className = classes[i].getName() schreiben und dann className in if Abfrage verwenden
                if (classes[i].getName().equals(c.getName())) {
                    System.out.println(c.getName() + " bereits angemeldet");
                    return true;
                }
            }
        }
        return false;
    }

    public Class[] getClasses() {
        return classes;
    }

    public void printClasses() {
        for (int i = 0; i < classes.length; i++) {
            // null check (mit null kommt man nicht zum getName() von einem Classes-Objekt
            if (classes[i] != null) {
                System.out.println(classes[i].getName());
            } else {
                System.out.println(classes[i]);
            }

        }
    }

    public void printStudyDays() {
        System.out.println("Student " + this.lastName + " has classes on: ");
        for (int i = 0; i < classes.length; i++) {
            if (classes[i] != null) {
                System.out.println(classes[i].getTag() + " (" + classes[i].getName() + ")");
            }
        }
    }

    @Override
    public String toString() {
        return "Student{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }


}
