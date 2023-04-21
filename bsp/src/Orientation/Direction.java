package Orientation;

// ähnliches beispiel in diesem tutorial: https://docs.oracle.com/javase/tutorial/java/javaOO/enum.html
public enum Direction {
    NORTH(0), EAST(90), SOUTH(180), WEST(270);

    private final int angle;

    // der constructor ist private (probiere hier private oder public dazuzuschreiben und schau, was die ide sagt)
    // aus obigem tutorial: Note: The constructor for an enum type must be package-private or private access. It automatically creates the constants that are defined at the beginning of the enum body. You cannot invoke an enum constructor yourself.
    Direction(int angle) {
        this.angle = angle;
    }

    public int getAngle() {
        return angle;
    }

    public int turn(Direction to) {
        return to.angle - this.angle;
    }

    public void showTurn(int turn, Direction to) {
        System.out.println("You are facing: " + this);
        System.out.println("You want to turn to the: " + to);

        if (Math.abs(turn) == 180) {
            System.out.println("Turn around to face " + to + "!");
        } else if (turn == -90 || turn == 270) {
            System.out.println("Turn to your left!");
        } else {
            System.out.println("Turn to your right!");
        }


    }
}
