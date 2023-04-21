package Generics;

public class Demo {
    public static void main(String[] args) {
        // erst hier wird in der <> Klammer angegeben, von welchem Typ die Daten sien werden
        Info<Integer> age = new Info<>(23, 2);
        Info<Integer> salary = new Info<>(2700, 2);
        Info<String> name = new Info<>("Max", 1);

        Profil profil = new Profil(age, name, salary);
        profil.print();
    }

}
