import java.util.*;

public class MapExamples {
    public static Map<Character,Integer> freq(String s) {
        Map<Character,Integer> m = new LinkedHashMap<>();
        for (char c: s.toCharArray()) m.put(c, m.getOrDefault(c,0)+1);
        return m;
    }
    public static void main(String[] args) {
        System.out.println(freq("mississippi"));
        TreeMap<Integer,String> tm = new TreeMap<>();
        tm.put(3,"three"); tm.put(1,"one"); tm.put(2,"two");
        System.out.println("TreeMap (ordered by key): " + tm);
    }
}
