package mediatorAndSingleton;

import java.util.ArrayList;
import java.util.List;

public class MainClass {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        User bob = new User("Bob");
        users.add(bob);
        User john = new User("John");
        users.add(john);
        User ivan = new User("Ivan");
        users.add(ivan);

        ChatBotMediator onlineChat = new ChatBotMediator(users);


        onlineChat.sendMessage("Hello everyone!", bob);
        onlineChat.sendMessage("Hi Bob!", ivan);
        onlineChat.sendMessage("addBot", ivan);
        onlineChat.sendMessage("Look at this picture of my new cat", john);
        onlineChat.sendMessage("Ohh no, John what have you done...", bob);
    }
}
