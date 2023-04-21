package player;

import java.util.Objects;

public class Player {

    // id: int, name: String, team: Team, points: int

    // static counter -> nur einmal pro klasse, nicht für jedes objekt
    private static int counter = 0;

    private int id;
    private String name;
    private Team team;
    private int points;

    public Player(String name, Team team, int points) {
        this.name = name;
        this.team = team;
        this.points = points;
        // jedem player objekt wird der wert des counters zugewiesen, dieser wird dann aber inkrementiert, also ist er für den nächsten player anders
        this.id = counter++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Team getTeam() {
        return team;
    }

    public void setTeam(Team team) {
        this.team = team;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", team=" + team +
                ", points=" + points +
                '}';
    }

    // 2 player sind dann gleich, wenn die id und der name gleich sind
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return id == player.id && name.equals(player.name);
    }

    // immer hashcode generieren, wenn equals generiert wurde
    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}
