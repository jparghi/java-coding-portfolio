package diff; /**
 * Example demonstrating thread-safe ConcurrentHashMap usage
 */
import java.util.concurrent.*;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        ConcurrentHashMap<String, Integer> map = new ConcurrentHashMap<>();
        map.put("A", 1);
        map.put("B", 2);
        System.out.println("ConcurrentHashMap: " + map);
    }
}
