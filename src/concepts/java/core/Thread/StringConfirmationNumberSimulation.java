package core.Thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.HashSet;
import java.util.Set;

public class StringConfirmationNumberSimulation {
    private static int counter = 1000; // Shared integer counter (Race condition possible)
    private static final Set<String> receivedNumbers = new HashSet<>();

    // Simulated web service that generates confirmation numbers (returns string version of an integer)
    public static synchronized String getConfirmationNumber() { // Synchronized to avoid race condition
        try {
            Thread.sleep(100); // Simulating processing delay
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return Integer.toString(counter++); // Convert integer to string safely
    }

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5); // 5 parallel threads

        Runnable task = () -> {
            String confirmationNumber = getConfirmationNumber();
            System.out.println(Thread.currentThread().getName() + " got confirmation number: " + confirmationNumber);

            synchronized (receivedNumbers) {
                if (receivedNumbers.contains(confirmationNumber)) {
                    System.out.println("⚠️ Race Condition Detected! Duplicate confirmation number: " + confirmationNumber);
                } else {
                    receivedNumbers.add(confirmationNumber); // Ensure unique confirmation numbers
                }
            }
        };

        for (int i = 0; i < 5; i++) {
            executor.submit(task); // Running five parallel tasks
        }

        executor.shutdown();
    }
}
