package observer;

public class ObserverPattern {

    public static void main(String[] args) {

        YouTubeChannel youTubeChannel = new YouTubeChannel("Java Tutorials");

        var subscriber1 = new YouTubeChannelSubscriber("Ivan");
        var subscriber2 = new YouTubeChannelSubscriber("Petko");
        var subscriber3 = new YouTubeChannelSubscriber("Kamen");

        youTubeChannel.subscribe(subscriber1);
        youTubeChannel.subscribe(subscriber2);
        youTubeChannel.subscribe(subscriber3);

        youTubeChannel.uploadNewVideo("Top 10 Ways to implement Observer Pattern");
    }
}
