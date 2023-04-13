package friendlist;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class FriendList {
    // ArrayList<Friend> zur Verwaltung von friends
    private List<Friend> friends = new ArrayList<>();

    // Generate Getter
    public List<Friend> getFriends() {
        return friends;
    }

    // print-Methode für die Ausgabe der Elemente in der Liste
    public void print() {
        // https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html
        // friends.forEach((f) -> System.out.println(f));

        for (Friend f : this.friends) {
            System.out.println(f);
        }

        System.out.println();

        // size() anstatt length() (array)
        // for (int i = 0; i < friends.size(); i++) {
        //     System.out.println(friends.get(i));
        // }
    }

    // überladen der print Methode von oben
    public void print(ArrayList<Friend> friends) {
        for (Friend f : friends) {
            System.out.println(f);
        }

        System.out.println();
    }

    // Einfügen eines Elements zu ArrayList friends
    public void addFriend(Friend f) {
        friends.add(f);
    }

    // Gibt friends aus city zurück
    public ArrayList<Friend> friendsFrom(String city) {
        // ArrayList für die gefundenen friends
        ArrayList<Friend> result = new ArrayList<>();

        // laufe this.friends durch und suche nach denjenigen, deren city gleich der übergebenen ist
        for (int i = 0; i < friends.size(); i++) {
            if (friends.get(i).getCity().equals(city)) {
                // wenn friend mit gesuchter city gefunden -> zu result arraylist hinzufügen
                result.add(friends.get(i));
            }
        }

        // gib result arraylist zurück
        return result;
    }

    // finde friend, den du am längsten kennst
    public Friend findOldestFriend() {
        // gibt das jetzige jahr
        int year = Year.now().getValue();

        // hol den ersten friend und #jahre, die du ihn kennst
        // mit diesen werten werden dann die anderen verglichen und geschaut, ob jemand länger dabei ist
        Friend oldestFriend = friends.get(0);
        int howLong = year - friends.get(0).getKnownSince();

        for (int i = 1; i < friends.size(); i++) {
            // wenn friend, den du länger kennst dabei ist, also > howLong von vorhin
            if ((year - friends.get(i).getKnownSince()) > howLong) {
                // dann update howLong und oldestFriend auf diese werte
                howLong = year - friends.get(i).getKnownSince();
                oldestFriend = friends.get(i);
            }
        }

        return oldestFriend;
    }

    // entfernt friend von liste
    public void removeFriend(Friend f) {
        friends.remove(f);
    }

    // finde friends, die nicht in deinem land leben
    public ArrayList<Friend> friendsAbroad(String homeCountry) {
        // arraylist für result
        ArrayList<Friend> result = new ArrayList<>();

        // laufe alle friends durch und schau, wo deren country nicht gleich dem übergebenen ist
        // for each schleife
        for (Friend f : friends) {
            if (!f.getCountry().equals(homeCountry)) {
                result.add(f);
            }
        }

        // for schleife
        /*
        for (int i = 0; i < friends.size(); i++) {
            if (!friends.get(i).getCountry().equals(homeCountry)) {
                result.add(friends.get(i));
            }
        }

         */

        return result;
    }
}
