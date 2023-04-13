package studentbsp;

public class App {
    public static void main(String[] args) {
        Student max = new Student("Max", "Mustermann");

        Class pr = new Class("Programmieren 2", 20, 2);
        Class mod = new Class("Modelle", 15, 2);
        Class db = new Class("Datenbanken", 18, 2);
        Class mob = new Class("Mobile Solutions", 20, 2);

        max.enroll(pr);
        max.enroll(mod);
        max.enroll(db);
        // mit dem nächsten enroll() wird auch increaseArray() aufgerufen
        max.enroll(mob);

        Student anna = new Student("Anna", "Maier");
        Student eva = new Student("Eva", "Neumann");

        anna.enroll(pr);
        //
        eva.enroll(pr);

        max.printClasses();

        System.out.println(max);
    }
}
