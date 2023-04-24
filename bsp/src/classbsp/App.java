package classbsp;

import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) {
        Class c = new Class("PR2", 20, 3, Wochentag.FRIDAY);

        Student s = new Student("Max", "M");

        // enroll wird hier auf dem studenten aufgerufen (methode ist in der klasse Student)
        s.enroll(c);
        s.printClasses();

        Class m = new Class("Modelle", 20, 3, Wochentag.TUESDAY);
        s.enroll(m);

        // hier holen wir uns die classes vom studenten
        // ein array von Class-Objekten wird zurückgeliefert
        Class[] cs = s.getClasses();
        // durchlauf und ausgabe mit einer for schleife
        for (int i = 0; i < cs.length; i++) {
            System.out.println(cs[i]);
        }

        // enroll sollte ausgeben, dass s bei c bereits angemeldet ist
        s.enroll(c);
        System.out.println();

        Class pr = new Class("PR1", 20, 3, Wochentag.FRIDAY);
        Class db = new Class("DB", 20, 3, Wochentag.MONDAY);

        s.enroll(pr);
        s.enroll(db);

        System.out.println();
        System.out.println("--------------");
        System.out.println();

        // ausgabe des static counters -> wird pro erstelltes objekt erhöht, existiert einmal pro klasse
        System.out.println("Bereits " + Student.getCounter() + " Student(en) da!");

        Student s1 = new Student("Max", "M");
        Student s2 = new Student("Max", "M");
        Student s3 = new Student("Max", "M");

        System.out.println("Bereits " + Student.getCounter() + " Student(en) da!");

        int val = 4;
        String str = String.valueOf(val);

        System.out.println(s1.getId());
        // exkurs auf wunsch -> String.format zum formatieren. kann im println auch weggelassen werden (wie intellij vorschlägt)
        System.out.println(String.format("%03d", s3.getId()));

        System.out.println();
        System.out.println("--------------");
        System.out.println();

        s.printStudyDays();



    }
}
