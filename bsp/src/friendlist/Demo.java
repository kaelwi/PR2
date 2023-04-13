package friendlist;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {

        // erstelle einige friends
        Friend adam = new Friend("Adam", 30, "Graz", "Austria", 2016);
        Friend bertik = new Friend("Bertik", 25, "Prague", "Czech Republic", 2008);
        Friend caesar = new Friend("Caesar", 45, "Berlin", "Germany", 2020);
        Friend david = new Friend("David", 30, "Graz", "Austria", 2019);

        // erstelle friendlist und adde friends von oben
        FriendList friendList = new FriendList();
        friendList.addFriend(adam);
        friendList.addFriend(bertik);
        friendList.addFriend(caesar);
        friendList.addFriend(david);

        // ausgabe aller friends
        friendList.print();

        // finde friends aus graz und gib sie aus
        ArrayList<Friend> grazFriends = friendList.friendsFrom("Graz");
        friendList.print(grazFriends);

        // finde friend, den du am längsten kennst und gib ihn aus
        System.out.println(friendList.findOldestFriend());
        System.out.println();

        // finde friends im ausland und gib sie aus
        ArrayList<Friend> friendsAbroad = friendList.friendsAbroad("Austria");
        friendList.print(friendsAbroad);

        // entferne adam von der liste und gib die liste (ohne adam) aus
        friendList.removeFriend(adam);
        friendList.print();
    }
}
