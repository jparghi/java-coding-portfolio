package core; /**
 * Example demonstrating Checked and Unchecked Exceptions in Java
 */
import java.io.*;

public class ExceptionHandlingExample {
    public static void main(String[] args) {
        // Checked Exception Example
        try {
            FileReader file = new FileReader("nonexistent.txt");
        } catch (FileNotFoundException e) {
            System.out.println("Caught Checked Exception: " + e.getMessage());
        }

        // Unchecked Exception Example
        String str = null;
        try {
            System.out.println(str.length()); // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Caught Unchecked Exception: " + e.getMessage());
        }
    }
}
