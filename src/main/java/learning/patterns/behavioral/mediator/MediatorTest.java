package learning.patterns.behavioral.mediator;

public class MediatorTest {
    public static void main(String[] args) {
        SimpleTextChat chat = new SimpleTextChat();
        User admin = new Admin(chat,"admin");

        SimpleUser user1 = new SimpleUser(chat, "user1");
        SimpleUser user2 = new SimpleUser(chat, "user2");

        chat.setAdmin(admin);
        chat.addUserToChat(user1);
        chat.addUserToChat(user2);

        user1.sendMessage("hi i am user1");
        admin.sendMessage("Roger that. i am admin");
    }
}
