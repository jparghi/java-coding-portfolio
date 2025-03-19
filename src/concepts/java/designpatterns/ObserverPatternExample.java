package designpatterns; /**
 * Observer Pattern Example: Useful in event-driven systems, like Kafka-based event systems.
 */
import java.util.*;

interface Observer {
    void update(String message);
}

class Subscriber implements Observer {
    private String name;
    public Subscriber(String name) { this.name = name; }
    public void update(String message) {
        System.out.println(name + " received message: " + message);
    }
}

class Publisher {
    private List<Observer> observers = new ArrayList<>();
    public void subscribe(Observer observer) { observers.add(observer); }
    public void notifyObservers(String message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }
}

public class ObserverPatternExample {
    public static void main(String[] args) {
        Publisher publisher = new Publisher();
        Observer sub1 = new Subscriber("Subscriber1");
        Observer sub2 = new Subscriber("Subscriber2");
        publisher.subscribe(sub1);
        publisher.subscribe(sub2);

        publisher.notifyObservers("New Event Published!");
    }
}
