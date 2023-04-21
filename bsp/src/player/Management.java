package player;

import java.util.ArrayList;

public class Management {
    private ArrayList<Team> teams;

    public Management() {
        this.teams = new ArrayList<>();
    }

    public void add(Team team) {
        teams.add(team);
    }

    public void remove(Team team) {
        teams.remove(team);
    }

    public void print() {
        for (Team t : teams ) {
            // toString von Team
            System.out.println(t);
            // print() methode von team
            t.print();
        }
        System.out.println();
    }

    public Team getWinnerTeam() {
        // variablen für das winner team
        Team winner = null;
        int points = 0;
        for (Team t : teams) {
            // wenn die punkte vom team t höher als points sind:
            if (t.getPointsPerTeam() > points) {
                // speichere punkte von team t in points
                points = t.getPointsPerTeam();
                // merke dir t in winner
                winner = t;
                // beides wird überschrieben, wenn ein anderes team mehr punkte hat
            }
        }
        return winner;
    }

    public Player getBestPlayer() {
        Player best = null;
        int points = 0;

        // für jedes team aus liste teams
        for (Team t : teams) {
            // für jeden player aus team t
            for (Player p : t.getPlayers()) {
                // ähnlich wie winner team
                if (p.getPoints() > points) {
                    points = p.getPoints();
                    best = p;
                }
            }
        }

        return best;
    }

    public Player getPlayerById(int id) {
        // 2 schleifen notwendig, weil wir alle player von allen teams durchlaufen wollen
        for (Team t: teams) {
            for (Player p : t.getPlayers() ) {
                if (p.getId() == id) {
                    return p;
                }
            }
        }
        return null;
    }


}
