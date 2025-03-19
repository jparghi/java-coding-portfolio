package diff;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ArrayListVsLinkedList {

  public static void main(String[] args) {
    arrayList();
    linkListConcept();
  }

  private static void linkListConcept() {
    System.out.println("LinkedList:");
    LinkedList<String> linkedList = new LinkedList<>();
    linkedList.add("A");
    linkedList.add("B");
    linkedList.add(1, "C");
    for (String s : linkedList) {
      System.out.println(s);
    }
  }

  private static void arrayList() {
    System.out.println("ArrayList");
    List<String> list = new ArrayList<>();
    list.add("A");
    list.add("B");
    list.add(1, "X");

    for (String s : list) {
      System.out.println(s);
    }
  }

}
