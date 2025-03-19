package collection; /**
 * Example demonstrating reduce() operation in Java 8 Streams
 */
import java.util.*;

public class StreamReduceExample {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Reduce to calculate product
        int product = numbers.stream().reduce(1, (a, b) -> a * b);

        System.out.println("Product of numbers: " + product);
    }
}
