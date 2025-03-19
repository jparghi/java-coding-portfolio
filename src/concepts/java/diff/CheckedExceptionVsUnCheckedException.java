package diff;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * ==================== Checked vs Unchecked Exceptions ====================
 * | Aspect             | Checked Exceptions                              | Unchecked Exceptions                             |
 * |--------------------|-----------------------------------------------|-------------------------------------------------|
 * | When Caught?       | Compile Time                                   | Runtime                                         |
 * | Base Class         | Subclass of Exception (except RuntimeException) | Subclass of RuntimeException                    |
 * | Handling Required? | Must be handled using try-catch or throws      | Optional handling (not required)                |
 * | Examples           | IOException, SQLException, FileNotFoundException | NullPointerException, ArrayIndexOutOfBoundsException, ArithmeticException |
 * =========================================================================
 * Summary:
 * - Checked = Compile-time, recoverable, must handle.
 * - Unchecked = Runtime, often programming bugs, optional handling.
 */
public class CheckedExceptionVsUnCheckedException {

  public static void main(String[] args) {

    checkedExceptionExample();

    unCheckedExceptionExample();
  }

  private static void unCheckedExceptionExample() {
    System.out.println("Unchecked exception");
    String str = null;
    System.out.println(str.length());
  }

  private static void checkedExceptionExample() {
    System.out.println("Checked Exception Example");
    try {
      File file = new File("checkedException.txt");
      Scanner sc = new Scanner(file);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }
}
