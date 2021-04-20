package observer;

import java.util.ArrayList;
import java.util.List;

public class YouTubeChannel implements Observable {

    private final List<Observer> subscribers;
    private String latestVideoName;
    private String name;

    public YouTubeChannel(String name) {
        this.name = name;
        subscribers = new ArrayList<>();
    }

    @Override
    public void subscribe(Observer observer) {
        this.subscribers.add(observer);
        observer.setChannel(this);
    }

    @Override
    public void unsubscribe(Observer observer) {
        this.subscribers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        this.subscribers.forEach(Observer::update);
    }

    @Override
    public String getUpdate() {
        return this.latestVideoName;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void uploadNewVideo(String name) {
        this.latestVideoName = name;
        notifyObservers();
    }
}
