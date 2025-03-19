package designpatterns;

/**
 * Proxy Pattern Example: Useful for access control, logging, or lazy initialization (e.g., API Gateway, Security Layer)
 */
interface Service {
    void execute();
}

class RealService implements Service {
    public void execute() {
        System.out.println("Executing Real Service");
    }
}

class ServiceProxy implements Service {
    private RealService realService;
    public void execute() {
        if (realService == null) {
            realService = new RealService();
        }
        System.out.println("Proxy in action: Logging access");
        realService.execute();
    }
}

public class ProxyPatternExample {
    public static void main(String[] args) {
        Service service = new ServiceProxy();
        service.execute();
    }
}
