package mediatorAndSingleton;

public class ChatBot {

    private static ChatBotMediator mediator;

    private static final ChatBot INSTANCE = new ChatBot();

    public String parseMessage(String message, User user) {
        if (message.toLowerCase().contains("cat")) {
            mediator.kickFromChat(user);
            return "Inappropriate language! \"Cat\" is forbidden word";
        } else {
            return message;
        }
    }

    public static ChatBot createChatBot(ChatBotMediator mediator) {
        ChatBot.mediator = mediator;
        return INSTANCE;
    }
}
