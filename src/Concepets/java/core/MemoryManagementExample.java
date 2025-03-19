/**
 * Example demonstrating Stack vs Heap Memory & Garbage Collection
 */
class Person {
    String name;
    Person(String name) { this.name = name; }
}

public class MemoryManagementExample {
    public static void main(String[] args) {
        Person p1 = new Person("John"); // Allocated in heap
        p1 = null; // Eligible for GC
        System.gc();
        System.out.println("Person object is now eligible for Garbage Collection.");
    }
}
