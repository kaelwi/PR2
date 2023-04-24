package spielermap;

import Teams.Player;
import Teams.Team;
import Teams.Verwaltung;

public class Demo {
    public static void main(String[] args) {
        SpielerMap playerListe = new SpielerMap();
        Spieler p1 = new Spieler("Thomas");
        Spieler p2 = new Spieler("Astrid");
        playerListe.addOrUpdate(p1, 20);
        playerListe.addOrUpdate(p2, 20);
        playerListe.addOrUpdate(p1, 30);
        System.out.println(playerListe.getPlayerWithPoints(20));
    }
}
