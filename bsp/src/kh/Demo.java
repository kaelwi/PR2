package kh;

public class Demo {
    public static void main(String[] args) {
        Arzt a1 = new Arzt("Mueller", 5000);
        SpezialisierterArzt a2 = new SpezialisierterArzt("Mustermann", 5000, 0.2);

        Krankenhaus kh = new Krankenhaus();
        kh.add(a1);
        kh.add(a2);

        kh.print();
    }
}
