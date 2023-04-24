package kh;

public class SpezialisierterArzt extends Arzt {
    private double zuschlag;

    public SpezialisierterArzt(String name, int gehalt, double zuschlag) {
        super(name, gehalt);
        this.zuschlag = zuschlag;
    }

    @Override
    public double getGehalt() {
        return super.getGehalt() * (1 + zuschlag);
    }
}
