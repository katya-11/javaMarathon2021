package day13;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private List<User> subscriptions = new ArrayList<>();

    public User(String name) {
        this.name = name;
        this.subscriptions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public List<User> getSubscriptions() {
        return subscriptions;
    }

    public void subscribe(User user) {
        this.subscriptions.add(user);
    }

    public boolean isSubscriber(User user) {
        for (User u : subscriptions) {
            if (u.getName().equals(user.getName())) {
                return true;
            }
        }
        return false;
    }


    public boolean isFriend(User user) {

        return this.isSubscriber(user) &&
                user.isSubscriber(this);
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.addNewMessage(this, user, text);
    }

    @Override
    public String toString() {
        return name;
    }
}
