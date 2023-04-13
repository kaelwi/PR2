package friendlist;

import java.util.ArrayList;

public class Demo {
    public static void main(String[] args) {
        Friend adam = new Friend("Adam", 30, "Graz", "Austria", 2016);
        Friend bertik = new Friend("Bertik", 25, "Prague", "Czech Republic", 2008);
        Friend caesar = new Friend("Caesar", 45, "Berlin", "Germany", 2020);
        Friend david = new Friend("David", 30, "Graz", "Austria", 2019);

        FriendList friendList = new FriendList();
        friendList.addFriend(adam);
        friendList.addFriend(bertik);
        friendList.addFriend(caesar);
        friendList.addFriend(david);

        friendList.print();

        ArrayList<Friend> grazFriends = friendList.friendsFrom("Graz");
        friendList.print(grazFriends);

        System.out.println(friendList.findOldestFriend());
        System.out.println();

        ArrayList<Friend> friendsAbroad = friendList.friendsAbroad("Austria");
        friendList.print(friendsAbroad);

        friendList.removeFriend(adam);
        friendList.print();
    }
}
