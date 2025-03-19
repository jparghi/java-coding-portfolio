package designpatterns;

/**
 * Factory Pattern Example: Useful in frameworks like Spring Boot (BeanFactory), creating objects without exposing instantiation logic.
 */
interface Notification {
    void notifyUser();
}

class EmailNotification implements Notification {
    public void notifyUser() { System.out.println("Email Notification Sent"); }
}

class SMSNotification implements Notification {
    public void notifyUser() { System.out.println("SMS Notification Sent"); }
}

class NotificationFactory {
    public static Notification getNotification(String type) {
        if ("EMAIL".equalsIgnoreCase(type)) return new EmailNotification();
        else if ("SMS".equalsIgnoreCase(type)) return new SMSNotification();
        return null;
    }
}

public class FactoryPatternExample {
    public static void main(String[] args) {
        Notification notification = NotificationFactory.getNotification("EMAIL");
        notification.notifyUser();
    }
}
