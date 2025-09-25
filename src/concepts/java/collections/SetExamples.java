import java.util.*;

public class SetExamples {
    public static void main(String[] args) {
        Set<String> hs = new HashSet<>(Arrays.asList("a","b","a","c"));
        System.out.println("HashSet (unique): " + hs);
        Set<Integer> ts = new TreeSet<>(Arrays.asList(5,1,4,1,2));
        System.out.println("TreeSet (sorted): " + ts);
    }
}
