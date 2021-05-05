package mediatorAndSingleton;

public interface Chat {

    void sendMessage(String message, User sender);

    void joinChat(User user);

    void kickFromChat(User user);
}
