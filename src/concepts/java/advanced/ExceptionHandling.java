import java.io.*;

class InvalidAmountException extends RuntimeException {
    InvalidAmountException(String msg){ super(msg); }
}

public class ExceptionHandling {
    public static void writeToFile(String path, String content) throws IOException {
        try (FileWriter fw = new FileWriter(path)) {
            fw.write(content);
        }
    }

    public static void withdraw(double balance, double amount){
        if (amount < 0) throw new InvalidAmountException("Amount cannot be negative");
        if (amount > balance) throw new IllegalArgumentException("Insufficient funds");
        // else OK
    }

    public static void main(String[] args) throws Exception {
        writeToFile("sample.txt", "hello");
        try {
            withdraw(100, 200);
        } catch (IllegalArgumentException ex) {
            System.out.println("Error: " + ex.getMessage());
        }
    }
}
