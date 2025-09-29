package collection; /**
 * Example demonstrating parallelStream() in Java 8
 */
import java.util.*;

/**
 * parallle steams split tasks across multiple cores, improving speed on large data, - beware of thread safety issues.
 */
public class StreamParallelExample {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i <= 1000; i++) {
            numbers.add(i);
        }

        // Sequential stream sum
        int sumSequential = numbers.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Sequential Sum: " + sumSequential);

        // Parallel stream sum
        int sumParallel = numbers.parallelStream().mapToInt(Integer::intValue).sum();
        System.out.println("Parallel Sum: " + sumParallel);
    }
}
