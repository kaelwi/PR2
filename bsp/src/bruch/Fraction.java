package bruch;

public class Fraction {
    private int numerator;
    private int denomenator;

    public Fraction(int numerator, int denomenator) {
        this.numerator = numerator;
        this.denomenator = denomenator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenomenator() {
        return denomenator;
    }

    public double toDecimal() {
        return (double) numerator/denomenator;
    }

    public void print() {
        System.out.println(numerator + "/" + denomenator);
    }

    @Override
    public String toString() {
        return numerator + "/" + denomenator;
    }

    public Fraction multiplicate(Fraction b2) {
        return new Fraction(b2.getNumerator() * this.numerator, b2.getDenomenator() * this.denomenator);
    }

    // method overloading
    public Fraction multiplicate(Fraction b2, Fraction b3) {
        // wiederverwenden der obigen multiplicate(Fraction b2) method
        Fraction tempResult = this.multiplicate(b2);
        Fraction result = tempResult.multiplicate(b3);

        // Fraction res = new Fraction(b2.getNumerator() * this.numerator * b3.getNumerator(), b2.getDenomenator() * this.denomenator * b3.denomenator);
        return result;
        // return this.multiplicate(b2).multiplicate(b3);
    }
}
