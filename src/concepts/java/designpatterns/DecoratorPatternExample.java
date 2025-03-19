/**
 * Decorator Pattern Example: Useful to add new functionality to objects dynamically (e.g., UI frameworks, adding responsibilities).
 */
interface Car {
    void assemble();
}

class BasicCar implements Car {
    public void assemble() {
        System.out.print("Basic Car");
    }
}

class CarDecorator implements Car {
    protected Car decoratedCar;
    public CarDecorator(Car car) { this.decoratedCar = car; }
    public void assemble() {
        decoratedCar.assemble();
    }
}

class SportsCar extends CarDecorator {
    public SportsCar(Car car) { super(car); }
    public void assemble() {
        super.assemble();
        System.out.print(" + Adding features of Sports Car");
    }
}

public class DecoratorPatternExample {
    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
    }
}
