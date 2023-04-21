package bruch;

public class Demo {
    public static void main(String[] args) {
        Fraction fraction = new Fraction(1, 5);
        System.out.println(fraction.toDecimal());
        fraction.print();
        System.out.println(fraction);
        Fraction fraction1 = new Fraction(1, 5);
        Fraction result = fraction.multiplicate(fraction1);
        result.print();
        Fraction fraction2 = new Fraction(1, 5);
        fraction.multiplicate(fraction1, fraction2).print();
    }
}
