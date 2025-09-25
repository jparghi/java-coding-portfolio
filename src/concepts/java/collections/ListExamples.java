import java.util.*;

public class ListExamples {
    public static List<Integer> demoArrayListOps() {
        List<Integer> list = new ArrayList<>(Arrays.asList(1,2,3));
        list.add(4);
        list.remove(Integer.valueOf(2));
        list.set(0, 10);
        return list;
    }
    public static void main(String[] args) {
        System.out.println("ArrayList -> " + demoArrayListOps());
        LinkedList<String> ll = new LinkedList<>(Arrays.asList("a","b","c"));
        ll.addFirst("z"); ll.addLast("y");
        System.out.println("LinkedList -> " + ll);
    }
}
