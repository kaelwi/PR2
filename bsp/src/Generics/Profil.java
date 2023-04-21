package Generics;

public class Profil {
    private Info age;
    private Info name;
    private Info salary;

    public Profil(Info age, Info name, Info salary) {
        this.age = age;
        this.name = name;
        this.salary = salary;
    }

    public void print() {
        System.out.println("Name: ");
        System.out.println("\t" + checkSecurityLevel(name));

        System.out.println("Age: ");
        System.out.println("\t" + checkSecurityLevel(age));

        System.out.println("Salary: ");
        System.out.println("\t" + checkSecurityLevel(salary));

    }

    private String checkSecurityLevel(Info info) {
        switch (info.getSecurityLevel()) {
            case 1:
                return "Data is: " + info.getData();
            case 2:
                return "No access allowed.";
            case 3:
                return "Not available.";
            default:
                return "Wrong status.";
        }
    }

}
