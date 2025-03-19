package core;

/**
 * Example demonstrating 4 OOP Principles: Encapsulation, Inheritance, Polymorphism, Abstraction
 */
class Animal {
    protected String name;
    public Animal(String name) { this.name = name; }
    public void sound() { System.out.println("Animal makes sound"); }
}

class Dog extends Animal {
    public Dog(String name) { super(name); }
    @Override
    public void sound() { System.out.println(name + " barks"); }
}

abstract class Vehicle {
    abstract void move();
}

class Car extends Vehicle {
    @Override
    void move() { System.out.println("Car moves"); }
}

public class OOPPrinciplesExample {
    public static void main(String[] args) {
        // Inheritance & Polymorphism
        Animal animal = new Dog("Tommy");
        animal.sound();

        // Abstraction
        Vehicle vehicle = new Car();
        vehicle.move();
    }
}
