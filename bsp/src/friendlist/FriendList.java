package friendlist;

import java.time.Year;
import java.util.ArrayList;
import java.util.List;

public class FriendList {
    private List<Friend> friends = new ArrayList<>();

    public List<Friend> getFriends() {
        return friends;
    }

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

    // überladen
    public void print(ArrayList<Friend> friends) {
        for (Friend f : friends) {
            System.out.println(f);
        }

        System.out.println();
    }

    public void addFriend(Friend f) {
        friends.add(f);
    }

    public ArrayList<Friend> friendsFrom(String city) {
        ArrayList<Friend> result = new ArrayList<>();

        for (int i = 0; i < friends.size(); i++) {
            if (friends.get(i).getCity().equals(city)) {
                result.add(friends.get(i));
            }
        }

        return result;
    }

    public Friend findOldestFriend() {
        int year = Year.now().getValue();
        Friend oldestFriend = friends.get(0);
        int howLong = year - friends.get(0).getKnownSince();

        for (int i = 1; i < friends.size(); i++) {
            if ((year - friends.get(i).getKnownSince()) > howLong) {
                howLong = year - friends.get(i).getKnownSince();
                oldestFriend = friends.get(i);
            }
        }

        return oldestFriend;
    }

    public void removeFriend(Friend f) {
        friends.remove(f);
    }

    public ArrayList<Friend> friendsAbroad(String homeCountry) {
        ArrayList<Friend> result = new ArrayList<>();

        for (Friend f : friends) {
            if (!f.getCountry().equals(homeCountry)) {
                result.add(f);
            }
        }
        return result;
    }
}
