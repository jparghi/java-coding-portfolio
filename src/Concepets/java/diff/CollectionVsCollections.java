package diff; /**
 * Example demonstrating difference between Collection Interface and Collections Utility Class
 */
import java.util.*;

public class CollectionVsCollections {
    public static void main(String[] args) {
        Collection<String> collection = new ArrayList<>();
        collection.add("A");
        collection.add("B");
        System.out.println("Collection: " + collection);

        List<Integer> list = new ArrayList<>(Arrays.asList(3, 1, 2));
        Collections.sort(list);
        System.out.println("Sorted List: " + list);
    }
}
