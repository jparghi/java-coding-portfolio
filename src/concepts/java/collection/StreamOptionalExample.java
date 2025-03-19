package collection; /**
 * Example demonstrating Optional usage in Java 8
 */
import java.util.*;

/**
 * it handles null pointer exception.
 */
public class StreamOptionalExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Tom");

        // Using findFirst with Optional
        Optional<String> name = names.stream().filter(n -> n.startsWith("J")).findFirst();

        // Using ifPresent
        name.ifPresent(n -> System.out.println("First name starting with J: " + n));
    }
}
