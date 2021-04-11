package day13;

public class Task1 {
    public static void main(String[] args) {
        User user1 = new User("Jane");
        User user2 = new User("Mike");
        User user3 = new User("Eden");

        user1.sendMessage(user2, "Hello");
        user1.sendMessage(user2, "How are you?");

        user2.sendMessage(user1, "Hi");
        user2.sendMessage(user1, ":)");
        user2.sendMessage(user1, "Never been better, and you?");

        user3.sendMessage(user1, "Bonjour");
        user3.sendMessage(user1, "Ca va?");
        user3.sendMessage(user1, "xD");

        user1.sendMessage(user3, "Salut");
        user1.sendMessage(user3, "Tres bien.");
        user1.sendMessage(user3, "Et toi?");

        user3. sendMessage(user1, "Comme ci comme ca. Au revoir :)");

        MessageDatabase.showDialog(user1, user3);

    }
}
