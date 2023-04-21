package friendlist;

import java.time.Year;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class FriendList {
    // ArrayList<Friend> zur Verwaltung von friends
    // ohne dem Aufruf von new ist das Set null
    private Set<Friend> friends = new HashSet<>();

    // Generate Getter
    public Set<Friend> getFriends() {
        return friends;
    }

    // print-Methode für die Ausgabe der Elemente in der Liste
    public void print() {
         // alternativ:
        // friends.forEach((f) -> System.out.println(f));

        // for Schleife -> für jeden Friend f aus Set friends
        for (Friend f : this.friends) {
            System.out.println(f);
        }

        System.out.println();
    }

    // überladen der print Methode von oben
    public void print(Set<Friend> friends) {
        for (Friend f : friends) {
            System.out.println(f);
        }

        System.out.println();
    }

    // Einfügen eines Elements
    public void addFriend(Friend f) {
        friends.add(f);
    }

    // Gibt friends aus city zurück
    public Set<Friend> friendsFrom(String city) {
        // Set für die gefundenen friends
        Set<Friend> result = new HashSet<>();

        for (Friend f : friends) {
            // man könnte hier auch folgendes tun: String friendsCity = f.getCity() -> dann in if friendsCity.equals(city)
            if (f.getCity().equals(city)) {
                result.add(f);
            }
        }

        // gib result zurück
        return result;
    }

    // finde friend, den du am längsten kennst
    public Friend findOldestFriend() {
        // gibt das jetzige jahr
        int year = Year.now().getValue();

        // mit diesen werten werden dann die anderen verglichen und geschaut, ob jemand länger dabei ist
        Friend oldestFriend = null;
        int howLong = -1;

        for (Friend f : friends) {
            if (year - f.getKnownSince() > howLong) {
                howLong = year - f.getKnownSince();
                oldestFriend = f;
            }
        }

        return oldestFriend;
    }

    // entfernt friend von liste
    public void removeFriend(Friend f) {
        friends.remove(f);
    }

    // finde friends, die nicht in deinem land leben
    public Set<Friend> friendsAbroad(String homeCountry) {
        // arraylist für result
        Set<Friend> result = new HashSet<>();

        // laufe alle friends durch und schau, wo deren country nicht gleich dem übergebenen ist
        // for each schleife
        for (Friend f : friends) {
            if (!f.getCountry().equals(homeCountry)) {
                result.add(f);
            }
        }

        return result;
    }
}
