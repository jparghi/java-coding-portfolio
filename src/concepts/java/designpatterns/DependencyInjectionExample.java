package designpatterns;

/**
 * Dependency Injection Example: Core concept used heavily in Spring framework
 */
interface MessageService {
    void sendMessage(String message);
}

class EmailService implements MessageService {
    public void sendMessage(String message) {
        System.out.println("Email sent: " + message);
    }
}

class Application {
    private MessageService service;

    // Constructor Injection
    public Application(MessageService service) { this.service = service; }

    public void processMessage(String message) {
        service.sendMessage(message);
    }
}

public class DependencyInjectionExample {
    public static void main(String[] args) {
        MessageService emailService = new EmailService();
        Application app = new Application(emailService);
        app.processMessage("Dependency Injection Example");
    }
}
