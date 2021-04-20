package observer;

public class YouTubeChannelSubscriber implements Observer {

    private final String name;
    private YouTubeChannel youTubeChannel;

    public YouTubeChannelSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {
        if (youTubeChannel == null) {
            System.out.format("%s has no subscriptions to any channels %n", this.getName());
            return;
        }

        String latestVideo = this.youTubeChannel.getUpdate();
        System.out.format("%s received the latest video: %s %n", this.getName(), latestVideo);
    }

    @Override
    public void setChannel(Observable channel) {
        this.youTubeChannel = (YouTubeChannel) channel;
    }

    private String getName() {
        return name;
    }
}
