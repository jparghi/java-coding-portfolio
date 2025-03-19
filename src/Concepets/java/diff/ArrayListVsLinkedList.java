package diff; /**
 * Example demonstrating differences between ArrayList and LinkedList
 */
import java.util.*;

public class ArrayListVsLinkedList {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        arrayList.add("A");
        arrayList.add(1, "B");
        System.out.println("ArrayList: " + arrayList);

        List<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add(1, "B");
        System.out.println("LinkedList: " + linkedList);
    }
}
