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

    public boolean isSubscribed(User user) {
        return this.subscriptions.contains(user);
    }

    public boolean isFriend(User user) {
        return isSubscribed(user) &&
                user.isSubscribed(this);
    }

    public void sendMessage(User user, String text) {
        MessageDatabase.addNewMessage(this, user, text);
    }

    @Override
    public String toString() {
        return name;
    }
}
