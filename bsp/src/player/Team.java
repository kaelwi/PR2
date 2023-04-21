package player;

import java.util.ArrayList;

public class Team {
    // ein team verwaltet eine liste von playern
    private ArrayList<Player> players;
    private String name;

    public Team(String name) {
        this.name = name;
        // vor new ArrayList<>() ist die liste null
        // nicht vergessen (hier oder oben) new aufzurufen, ansonsten add und andere methoden nicht möglich, weil null
        this.players = new ArrayList<>();
    }

    public ArrayList<Player> getPlayers() {
        return players;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void add(Player player) {
        players.add(player);
    }

    public void print() {
        // für jeden player p aus der liste players
        for (Player p : players) {
            System.out.println(p);
        }
        System.out.println();
    }

    public int getPointsPerTeam() {
        // variable für die summe vorbereitet, anfangs 0
        int sum = 0;
        for (Player p : players) {
            // in sum werden punkte von jedem player gesammelt
            sum += p.getPoints();
        }
        return sum;
    }

    @Override
    public String toString() {
        // man kann auch erst int points = getPointsPerTeam() machen und dann points unten verwenden
        // ebenfalls kann man erst String str = "Team{......." machen und das dann zurückgeben
        return "Team{" +
                "name='" + name + '\'' +
                ", points=" + getPointsPerTeam() +
                '}';
    }
}
