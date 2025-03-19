package diff;

import java.util.HashMap;

public class HashMapVsHashTableExample {
  public static void main(String[] args) {

    hashMapExample();


  }

  private static void hashMapExample() {
    System.out.println("Hash Map Example");
    HashMap<Integer, String> map = new HashMap<>();
    map.put(1, "a");
    map.put(2, "b");
  }
}
