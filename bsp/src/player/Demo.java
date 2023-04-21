package player;

public class Demo {
    public static void main(String[] args) {
        Team t1 = new Team("Team A");
        t1.add(new Player("Player 1A", t1, 20));
        t1.add(new Player("Player 2A", t1, 10));
        t1.add(new Player("Player 3A", t1, 30));

        Team t2 = new Team("Team B");
        t2.add(new Player("Player 1B", t2, 22));
        t2.add(new Player("Player 2B", t2, 12));
        t2.add(new Player("Player 3B", t2, 32));

        Team t3 = new Team("Team C");
        t3.add(new Player("Player 1C", t3, 20));
        t3.add(new Player("Player 2C", t3, 100));
        t3.add(new Player("Player 3C", t3, 30));
        t3.add(new Player("Player 4C", t3, 30));

        Management management = new Management();
        management.add(t1);
        management.add(t2);
        management.add(t3);

        management.print();

        t1.print();
        System.out.println(t1.getPointsPerTeam());

        System.out.println(management.getBestPlayer());

        System.out.println(management.getWinnerTeam());
        System.out.println(management.getPlayerById(2));

    }


}
