/**
 * Example demonstrating differences between List, Set, and Map
 */
import java.util.*;

public class ListSetMapExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A"); list.add("B"); list.add("A");
        System.out.println("List: " + list);

        Set<String> set = new HashSet<>();
        set.add("A"); set.add("B"); set.add("A");
        System.out.println("Set: " + set);

        Map<Integer, String> map = new HashMap<>();
        map.put(1, "One"); map.put(2, "Two"); map.put(1, "New One");
        System.out.println("Map: " + map);
    }
}
