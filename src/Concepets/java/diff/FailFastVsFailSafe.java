package diff; /**
 * Example demonstrating Fail-Fast and Fail-Safe Iterators
 */
import java.util.*;
import java.util.concurrent.*;

public class FailFastVsFailSafe {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        Iterator<String> it = list.iterator();
        list.add("B"); // Uncomment next line to see ConcurrentModificationException
        // it.next();

        ConcurrentHashMap<Integer, String> map = new ConcurrentHashMap<>();
        map.put(1, "One");
        Iterator<Integer> mapIterator = map.keySet().iterator();
        map.put(2, "Two");
        while (mapIterator.hasNext()) {
            System.out.println(mapIterator.next());
        }
    }
}
