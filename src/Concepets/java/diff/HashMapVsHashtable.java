package diff; /**
 * Example demonstrating differences between HashMap and Hashtable
 */
import java.util.*;

public class HashMapVsHashtable {
    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();
        hashMap.put(null, "value");
        hashMap.put("key", null);
        System.out.println("HashMap: " + hashMap);

        Map<String, String> hashtable = new Hashtable<>();
        hashtable.put("key", "value");
        System.out.println("Hashtable: " + hashtable);
    }
}
