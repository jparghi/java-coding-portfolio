package Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.HashSet;
import java.util.Set;

public class RaceConditionSimulation {
    private static int confirmationNumber = 1000; // Shared resource (race condition)

    // Simulated web service method that generates confirmation numbers
    public static int getConfirmationNumber() {
        try {
            Thread.sleep(100); // Simulate processing delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return confirmationNumber++; // Race condition: multiple threads can get the same value
    }

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5); // 5 parallel threads
        Set<Integer> receivedNumbers = new HashSet<>();

        Runnable task = () -> {
            int number = getConfirmationNumber();
            System.out.println(Thread.currentThread().getName() + " got confirmation number: " + number);

            synchronized (receivedNumbers) {
                if (!receivedNumbers.add(number)) {
                    System.out.println("⚠️ Race Condition Detected! Duplicate number: " + number);
                }
            }
        };

        for (int i = 0; i < 5; i++) {
            executor.submit(task); // Run five parallel threads
        }

        executor.shutdown();
    }
}
