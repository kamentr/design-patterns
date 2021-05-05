package mediatorAndSingleton;

import java.util.List;

public class ChatImpl implements Chat {

    private final ChatBotMediator mediator;

    public ChatImpl(ChatBotMediator mediator, List<User> users) {
        this.mediator = mediator;
    }

    @Override
    public void sendMessage(String message, User sender) {
        if ("addBot".equals(message)) {
            System.out.println(sender.getName() + ": " + message);
            mediator.attachBotToChat();
            return;
        }

        String parsedMessage = mediator.parseMessage(message, sender);
        System.out.println(sender.getName() + ": " + parsedMessage);
    }

    @Override
    public void joinChat(User user) {
        sendSystemMessage("Welcome to the chat: " + user.getName());
    }

    @Override
    public void kickFromChat(User user) {
        sendSystemMessage(user.getName() + " got kicked from the chat");
    }

    private void sendSystemMessage(String systemMessage) {
        System.out.println(systemMessage);
    }
}
