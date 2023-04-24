package spielermap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class SpielerMap {
    // key = spieler, value = integer (points)
    Map<Spieler, Integer> player = new HashMap<>();

    // spieler-punkte paar wird in map eingefügt, oder wenn bereits vorhanden (get nicht null zurückliefert), updaten der vorhandenen punkte
    public void addOrUpdate(Spieler s, int points) {
        Integer p = player.get(s);
        if (p == null) {
            player.put(s, points);
        } else {
            player.put(s, player.get(s) + points);
        }
    }

    public Map<Spieler, Integer> getPlayer() {
        return player;
    }

    public ArrayList<Spieler> getPlayerWithPoints(int points) {
       ArrayList<Spieler> result = new ArrayList<>();

       for (Map.Entry<Spieler, Integer> entry : player.entrySet()) {
           if (entry.getValue() > points) {
               result.add(entry.getKey());
           }
       }

       /*
        for (Spieler s : player.keySet()) {
            if (player.get(s) > points) {
                result.add(s);
            }
        }

        */



       return result;
    }
}
