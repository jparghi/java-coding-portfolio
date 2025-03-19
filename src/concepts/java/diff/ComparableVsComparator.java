/**
 * Example demonstrating Comparable and Comparator differences
 */
import java.util.*;

class Student implements Comparable<Student> {
    int id;
    Student(int id) { this.id = id; }
    public int compareTo(Student s) { return this.id - s.id; }
    public String toString() { return "Student:" + id; }
}

public class ComparableVsComparator {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(3));
        list.add(new Student(1));
        list.add(new Student(2));

        Collections.sort(list);
        System.out.println("Comparable Sorted: " + list);

        Collections.sort(list, (s1, s2) -> s2.id - s1.id);
        System.out.println("Comparator Sorted: " + list);
    }
}
