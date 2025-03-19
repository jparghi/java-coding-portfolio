package random;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateConverter {
  public static void main(String[] args) {
    try {
      // Input string
      String dateString = "22009";

      // Define the pattern (MMyyyy)
      SimpleDateFormat inputFormat = new SimpleDateFormat("MMyyyy", Locale.ENGLISH);

      // Parse the input string into a Date object
      Date date = inputFormat.parse(dateString);

      // Define the output format (MMMM yyyy)
      SimpleDateFormat outputFormat = new SimpleDateFormat("MMMM yyyy", Locale.ENGLISH);

      // Format the date to the desired output
      String formattedDate = outputFormat.format(date);

      // Print the result
      System.out.println(formattedDate);  // Output: February 2009
    } catch (Exception e) {
      e.printStackTrace();
    }
  }
}
