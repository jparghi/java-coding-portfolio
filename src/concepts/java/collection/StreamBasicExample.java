package collection; /**
 * Example demonstrating basic usage of Java 8 Streams
 */
import java.util.*;
import java.util.stream.*;

public class StreamBasicExample {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("John", "Jane", "Tom", "Jack", "Jill");

        // Filter names starting with 'J', convert to uppercase, collect to list
        List<String> result = names.stream()
                                   .filter(name -> name.startsWith("J"))
                                   .map(String::toUpperCase)
                                   .collect(Collectors.toList());

        System.out.println("Filtered Names: " + result);
    }
}
