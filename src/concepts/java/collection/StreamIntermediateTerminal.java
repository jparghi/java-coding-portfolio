package collection; /**
 * Example demonstrating Intermediate vs Terminal operations in Streams
 */
import java.util.*;
import java.util.stream.*;

public class StreamIntermediateTerminal {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

        // Intermediate operations: filter, map
        Stream<Integer> stream = numbers.stream()
                                        .filter(n -> n % 2 == 0) // even numbers
                                        .map(n -> n * n);        // square

        // Terminal operation: collect
        List<Integer> squares = stream.collect(Collectors.toList());

        System.out.println("Squares of even numbers: " + squares);
    }
}
