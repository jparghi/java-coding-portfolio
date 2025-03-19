package core;

/**
 * Example demonstrating String immutability and StringBuilder usage
 */
public class StringHandlingExample {
    public static void main(String[] args) {
        // String (Immutable)
        String s1 = "Hello";
        s1.concat(" World");
        System.out.println("String: " + s1); // Output: Hello

        // StringBuilder (Mutable)
        StringBuilder sb = new StringBuilder("Hello");
        sb.append(" World");
        System.out.println("StringBuilder: " + sb); // Output: Hello World
    }
}
