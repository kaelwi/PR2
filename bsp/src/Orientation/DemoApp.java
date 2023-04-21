package Orientation;

import java.util.ArrayList;
import java.util.List;

public class DemoApp {
    public static void main(String[] args) {
        Direction d0 = Direction.NORTH;
        Direction d1 = Direction.EAST;
        Direction d2 = Direction.SOUTH;
        Direction d3 = Direction.WEST;

        d2.showTurn(d2.turn(d1), d1);
        System.out.println();
        d3.showTurn(d3.turn(d0), d0);
        System.out.println();
        d0.showTurn(d0.turn(d1), d1);
        System.out.println();
        d1.showTurn(d1.turn(d2), d2);
        System.out.println();
        d1.showTurn(d1.turn(d3), d3);
        System.out.println();
        d3.showTurn(d3.turn(d1), d1);
        System.out.println();
        d2.showTurn(d2.turn(d1), d1);
        System.out.println();
        d0.showTurn(d0.turn(d3), d3);
    }
}
