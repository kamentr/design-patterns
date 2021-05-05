package mediatorAndSingleton;

import java.util.List;

public class ChatBotMediator {

    ChatBot chatBot;
    Chat chat;
    private boolean chatBotIsActivated;

    public ChatBotMediator(List<User> users) {
        this.chat = new ChatImpl(this, users);
        this.chatBot = ChatBot.createChatBot(this);

        users.forEach(this::joinChat);
    }

    public void sendMessage(String message, User user) {
        chat.sendMessage(message, user);
    }

    public void joinChat(User user) {
        chat.joinChat(user);
    }

    public void kickFromChat(User user) {
        chat.kickFromChat(user);
    }


    public String parseMessage(String message, User sender) {
        if (chatBotIsActivated) {
            return chatBot.parseMessage(message, sender);
        } else {
            return message;
        }
    }

    public void attachBotToChat() {
        chatBotIsActivated = true;
    }
}
